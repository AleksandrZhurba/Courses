package lesson_4;


import java.util.Arrays;

public class Meth {
    //1
    public void invertMethod1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public void invertMethod2(int[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[tmp.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(tmp));
    }

    public void invertMethod3(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;

        }
    }

    //2
    public void averageNumb(int[] arr) {

        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];
        }
        double aver = (double) summ / arr.length;
        System.out.println(aver);

    }

    //3
    public void minElement(int[] arr) {
        Arrays.sort(arr);

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.print(min + " ");
            }
        }
    }
    public void invertMinMax (int[] arr) {


    }
}
