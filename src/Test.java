import java.util.Scanner;

public class Test {


    public static void main (String args[]) {

        Scanner user_input = new Scanner (System.in);

        int a;
        int b;
        int c;

        System.out.print("Enter 1st number: ");
        a = user_input.nextInt();

        System.out.print("Enter 2nd number: ");
        b = user_input.nextInt();

        System.out.print("Enter 3rd number: ");
        c = user_input.nextInt();

        GetValue myNum = new GetValue();


        System.out.println("\nCustom max number is " + myNum.max(a, b, c));
        System.out.println("Custom min number is " + myNum.min(a, b, c));
        System.out.println("Custom average number is " + myNum.average(a, b, c) + "\n");

        System.out.println(myNum.min(7, 5, 3));
        System.out.println(myNum.max(7, 5, 3));
        System.out.println(myNum.average(7, 5, 3));

    }
}
