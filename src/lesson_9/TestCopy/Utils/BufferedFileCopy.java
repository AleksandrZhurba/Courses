package lesson_9.TestCopy.Utils;

import lesson_9.TestCopy.FileAlreadyExistsException;
import lesson_9.TestCopy.FileCopyFailedException;
import lesson_9.TestCopy.FileCopyUtils;

import java.io.*;

public class BufferedFileCopy implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {

        File file = new File(destination);

        if (file.exists()) {
            throw new FileAlreadyExistsException("File already exists" + destination);

        }

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try {
            inputStream = new BufferedInputStream(new FileInputStream(source));
            outputStream = new BufferedOutputStream(new FileOutputStream(destination));

            int b = 0;
            while (true) {
                b = inputStream.read();
                if (b == -1) {
                    break;
                } else {
                    outputStream.write(b);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
