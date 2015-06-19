package lesson_9.TestCopy.IOUtils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by пк on 16.06.2015.
 */
public class IOUtils_Demo {

    public static void main(String[] args) {

        IOUtils_Impl obj = new IOUtils_Impl();
//        System.out.print("Enter any string:\t");
//        obj.replaceChars(new BufferedReader(new InputStreamReader(System.in)), new BufferedWriter(new OutputStreamWriter(System.out)),
//                "123456789","qweFHGmpg");
//


        String dir = "C:\\Users\\пк\\Desktop\\test";
        try {
            obj.printArrayOfFiles(obj.findFiles(dir));
        } catch (Exception e) {
            System.out.println("Error. Exit program.");
        }

    }
}
