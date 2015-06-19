package lesson_9.TestCopy.IOUtils;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by пк on 16.06.2015.
 */
public class Test_MobileNumbers {

    public static void main(String[] args) {

        FileWriter out = null;
        try {
            out = new FileWriter("C:\\Users\\пк\\Desktop\\numbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (long i = 0; i < 10000000; i++) {
            try {
                out.write((long) (80660000000L + i) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (i%100000 == 0 ){
                System.out.println(i);
            }
        }

        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
