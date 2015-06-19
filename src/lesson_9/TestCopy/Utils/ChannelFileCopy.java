package lesson_9.TestCopy.Utils;


import lesson_9.TestCopy.FileAlreadyExistsException;
import lesson_9.TestCopy.FileCopyFailedException;
import lesson_9.TestCopy.FileCopyUtils;

import java.io.*;
import java.nio.channels.FileChannel;

public class ChannelFileCopy implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        File file = new File(destination);

        if (file.exists()){
            throw new FileAlreadyExistsException(" this file already exists - " + destination);
        }

        FileChannel inChannel = null;
        FileChannel outCannel = null;
        try {
            inChannel = new FileInputStream(source).getChannel();
            outCannel = new FileOutputStream(destination).getChannel();

            inChannel.transferTo(0,inChannel.size(),outCannel);

//            ByteBuffer buff = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, inChannel.size());
//            outCannel.write(buff);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
