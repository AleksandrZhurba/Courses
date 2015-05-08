/**
 * Created by Alexandr on 08.05.2015.
 */
public class GetValue {

    int a;
    int b;
    int c;

    public int max (int a, int b, int c) {

        int max = 0;
        if (a > b && a > c)
            max = a;
        if (b > a && b > c)
            max = b;
        if (c > a && c > b)
            max = c;
        return max;
    }

    public int min (int a, int b, int c) {

        int min = 0;

        if (a > b && b < c)
            min = b;
        if (b > c && c < a)
            min = c;
        if (c > a && a < b)
            min = a;

        return min;
    }

    public int average (int a, int b, int c) {

        return (a + b + c) / 3;
    }

}
