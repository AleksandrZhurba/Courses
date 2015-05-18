package lesson_4;

import java.util.Arrays;

public class homework_lesson4 {
    static void arrpr (int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap (){

    }

    public static void main (String[] args) {

        //task 2
        int[] arr = {1,3,5,7,9};
        System.out.println(Arrays.toString(arr));


        int[] arr2 = {1,2,3,4,5,6,7};
        int[] arr3 = {9,8,8,7,2,-1};

        Methods meth1 = new Methods();

        meth1.bubble(arr2);
        arrpr(arr2);

        meth1.temparr(arr3);
        arrpr(arr3);


    }
}
