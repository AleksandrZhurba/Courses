import com.sun.org.apache.xpath.internal.SourceTree;

public class Test {
    public static void main (String args[]) {

        GetValue myNum = new GetValue();

        System.out.println(myNum.min(7,5,3));
        System.out.println(myNum.max(7, 5, 3));
        System.out.println(myNum.average(7, 5, 3));

    }
}
