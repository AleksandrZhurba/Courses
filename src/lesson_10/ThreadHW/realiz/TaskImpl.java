package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.inter.Task;

public abstract class TaskImpl implements Task{
    private int tryCount = 0;
    @Override
    public int getTryCount() {
        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;
    }
}
