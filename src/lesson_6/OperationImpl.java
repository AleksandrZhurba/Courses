package lesson_6;

public class OperationImpl implements Operation {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }


}
