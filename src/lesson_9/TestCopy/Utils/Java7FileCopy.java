package lesson_9.TestCopy.Utils;

import lesson_9.TestCopy.FileAlreadyExistsException;
import lesson_9.TestCopy.FileCopyFailedException;
import lesson_9.TestCopy.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;


public class Java7FileCopy implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            Files.copy(new File(source).toPath(), new File(destination).toPath());
        } catch (IOException e) {
           throw new FileCopyFailedException(e.getMessage());
        }
    }
}
