package lesson_6;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        Operation oper = new OperationImpl();
        int res = oper.div(6, 2);

        operation(oper);
        System.out.println(res);

    }

    public static void operation(Operation a) {
        System.out.println(a);
    }
}
