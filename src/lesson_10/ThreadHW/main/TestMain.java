package lesson_10.ThreadHW.main;

import lesson_10.ThreadHW.inter.CopyFileTask;
import lesson_10.ThreadHW.inter.FindFilesTask;
import lesson_10.ThreadHW.inter.TaskExecutor;
import lesson_10.ThreadHW.inter.TasksStorage;
import lesson_10.ThreadHW.realiz.CopyFileTaskImpl;
import lesson_10.ThreadHW.realiz.FindFilesTaskImpl;
import lesson_10.ThreadHW.realiz.TaskExecutorImpl;
import lesson_10.ThreadHW.realiz.TaskStorageImpl;
import lesson_9.TestCopy.Utils.BufferedFileCopy;
import lesson_9.TestCopy.Utils.ChannelFileCopy;
import lesson_9.TestCopy.Utils.Java7FileCopy;
import lesson_9.TestCopy.Utils.OneByteFileCopyUtils;

import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestMain {

    public static void main(String[] args) {

//

        TasksStorage myStorage = new TaskStorageImpl();

        CopyFileTask myCopy1 = new CopyFileTaskImpl("d:\\Temp\\list_1.jpg","d:\\Temp\\1\\list_1.jpg",new Java7FileCopy());
        CopyFileTask myCopy2 = new CopyFileTaskImpl("d:\\Temp\\list_2.jpg","d:\\Temp\\1\\list_2.jpg",new BufferedFileCopy());
        CopyFileTask myCopy3 = new CopyFileTaskImpl("d:\\Temp\\list_3.jpg","d:\\Temp\\1\\list_3.jpg",new ChannelFileCopy());
        CopyFileTask myCopy4 = new CopyFileTaskImpl("d:\\Temp\\list_4.jpg","d:\\Temp\\1\\list_4.jpg",new OneByteFileCopyUtils());

        FindFilesTask myFind1 = new FindFilesTaskImpl("d:\\Temp\\1\\","list_5",new PrintStream(System.out));
        FindFilesTask myFind2 = new FindFilesTaskImpl();
        FindFilesTask myFind3 = new FindFilesTaskImpl();
        FindFilesTask myFind4 = new FindFilesTaskImpl();


        myStorage.add(myCopy1);
        myStorage.add(myCopy2);
        myStorage.add(myCopy3);
        myStorage.add(myCopy4);

        myStorage.add(myFind1);
        myStorage.add(myFind2);
        myStorage.add(myFind3);
        myStorage.add(myFind4);

        TaskExecutor gogo = new TaskExecutorImpl(myStorage);
        gogo.start();
    }
}
