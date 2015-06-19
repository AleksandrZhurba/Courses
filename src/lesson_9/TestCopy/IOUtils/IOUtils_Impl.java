package lesson_9.TestCopy.IOUtils;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by пк on 16.06.2015.
 */
public class IOUtils_Impl implements IOUtils {
    @Override
    public void replaceChars(Reader in, Writer out, String inChars, String outChars) throws NullPointerException, IllegalArgumentException {

        if (inChars == null || outChars == null) {
            throw new NullPointerException("нет данных для замены");
        }
        if (in == null) {
            throw new NullPointerException("нет in потока");
        }
        if (out == null) {
            throw new NullPointerException("нет out потока");
        }
        if (inChars.length() != outChars.length()) {
            throw new IllegalArgumentException("строки для замены разной длины");
        }

        BufferedReader inPotok = new BufferedReader(in);
        FileWriter outFile = null;
        try {
            outFile = new FileWriter("C:\\Users\\пк\\Desktop\\out111.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                String string = inPotok.readLine();
                if (string.equals(".")) {
                    System.out.println("exit");
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                for (int i = 0; i < inChars.length(); i++) {
                    string = string.replace(inChars.charAt(i), outChars.charAt(i));
                }
                //out.write("\t" + string + "\n");
                outFile.write(string + "\n");
                outFile.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {

        if (dir == null) {
            throw new NullPointerException("dir == null");
        }

        File file = new File(dir);
        if (!file.exists()) {
            throw new IllegalArgumentException("нет файлов по адресу: " + file.getPath());
        }

        LinkedList<String> list = new LinkedList<String>();
        for (File eachFile : file.listFiles()) {
            if (eachFile.isDirectory()) {
                for (String name : findFiles(eachFile.getPath())) {
                    list.add("\t" + name);
                }
            } else {list.add(eachFile.getName());
                }
        }

        String[] result = new String[list.size()];
        int i = 0;
        for (String name : list) {
            result[i] = list.get(i);
            i++;
        }

        return result;
    }


    public void printArrayOfFiles(String[] args) {
        int i = 0;
        for (String str: args) {
            System.out.println(args[i]);
            i++;
        }
    }
}
