package lesson_4;

import java.util.Arrays;

public class homework_lesson4 {
    static void arrpr (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main (String[] args) {

        //task 2
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        System.out.println(Arrays.toString(arr));


        int[] inv1 = {1,2,3,4,5,6,7};
        int[] inv2 = {-1,2,5,57,-3};
        int[] inv3 = {5,3,5,2,1};
        int[] arr5 = {-2,4,3,4,5,-2,1};

        Methods meth1 = new Methods();

        meth1.invertMethod1(inv1);
        arrpr(inv1);

        meth1.invertMethod2(inv2);

        meth1.invertMethod3(inv3);
        arrpr(inv3);

        meth1.averageNumb(inv2);

        meth1.minElement(arr5);

    }
}
