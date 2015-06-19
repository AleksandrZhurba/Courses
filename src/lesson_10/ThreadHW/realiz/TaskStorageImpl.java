package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.inter.Task;
import lesson_10.ThreadHW.inter.TasksStorage;

import java.util.LinkedList;
import java.util.List;

public class TaskStorageImpl implements TasksStorage {

    private List<Task> tasks = new LinkedList<Task>();

    @Override
    public synchronized void add(Task task) throws NullPointerException {
        tasks.add(task);

    }

    @Override
    public synchronized Task get() {
        if (tasks.isEmpty()) {
            return null;
        }
        return tasks.remove(0);
    }

    @Override
    public synchronized int count() {
        return tasks.size();
    }
}
