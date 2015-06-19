package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.exception.TaskExecutionFailedException;
import lesson_10.ThreadHW.inter.Task;
import lesson_10.ThreadHW.inter.TaskExecutor;
import lesson_10.ThreadHW.inter.TasksStorage;

/**
 * Created by workstation on 16.06.2015.
 */
public class TaskExecutorImpl implements TaskExecutor, Runnable {

    public TaskExecutorImpl(TasksStorage storage) {
        this.storage = storage;
    }

    private TasksStorage storage = new TaskStorageImpl();
    private Thread thread = new Thread();
    boolean stop = false;

    @Override
    public void run() {
        while (!stop){
            Task t = storage.get();
            if (t == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    t.execute();
                } catch (Exception e) {
                    int count = t.getTryCount();
                    if (count < 5) {
                        storage.add(t);
                    } else {
                        System.out.println("Cannot apply" + t);
                    }
                }
            }
        }

    }

    @Override
    public void setStorage(TasksStorage storage) throws NullPointerException {

        this.storage = storage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {

        if (storage == null) {
            throw new NullPointerException("");
        }
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void stop() throws IllegalStateException {

        stop = true;
    }
}
