package lesson_4;

import java.util.Arrays;

public class homework_lesson4 {

    public static void main (String[] args) {

        //task 2
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        System.out.println(Arrays.toString(arr));


        int[] inv1 = {1,2,3,4,5,6,7};
        int[] inv2 = {-1,2,5,57,-3};
        int[] inv3 = {5,3,5,2,1};
        int[] arr5 = {-2,4,3,4,5,-2,1};

        Meth meth1 = new Meth();

        meth1.invertMethod1(inv1);
        System.out.println(Arrays.toString(inv1));

        meth1.invertMethod2(inv2);

        meth1.invertMethod3(inv3);
        System.out.println(Arrays.toString(inv3));

        meth1.averageNumb(inv2);

        meth1.minElement(arr5);

    }
}
