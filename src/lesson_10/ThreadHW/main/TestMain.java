package lesson_10.ThreadHW.main;

import lesson_10.ThreadHW.inter.CopyFileTask;
import lesson_10.ThreadHW.inter.FindFilesTask;
import lesson_10.ThreadHW.inter.TaskExecutor;
import lesson_10.ThreadHW.inter.TasksStorage;
import lesson_10.ThreadHW.realiz.CopyFileTaskImpl;
import lesson_10.ThreadHW.realiz.FindFilesTaskImpl;
import lesson_10.ThreadHW.realiz.TaskExecutorImpl;
import lesson_10.ThreadHW.realiz.TaskStorageImpl;
import lesson_9.TestCopy.Utils.Java7FileCopy;

public class TestMain {

    public static void main(String[] args) {

        TasksStorage myStorage = new TaskStorageImpl();

        CopyFileTask myCopy1 = new CopyFileTaskImpl("d:\\TMP\\copy1.txt","d:\\TMP\\1\\",new Java7FileCopy());
        CopyFileTask myCopy2 = new CopyFileTaskImpl("d:\\TMP\\copy2.txt","d:\\TMP\\1\\",new Java7FileCopy());
        CopyFileTask myCopy3 = new CopyFileTaskImpl("d:\\TMP\\copy3.txt","d:\\TMP\\1\\",new Java7FileCopy());
        CopyFileTask myCopy4 = new CopyFileTaskImpl("d:\\TMP\\copy4.txt","d:\\TMP\\1\\",new Java7FileCopy());
//        CopyFileTask myCopy5 = new CopyFileTaskImpl();
//
//        FindFilesTask myFind1 = new FindFilesTaskImpl();
//        FindFilesTask myFind2 = new FindFilesTaskImpl();
//        FindFilesTask myFind3 = new FindFilesTaskImpl();
//        FindFilesTask myFind4 = new FindFilesTaskImpl();
//        FindFilesTask myFind5 = new FindFilesTaskImpl();


        myStorage.add(myCopy1);
        myStorage.add(myCopy2);
        myStorage.add(myCopy3);
        myStorage.add(myCopy4);

        TaskExecutor gogo = new TaskExecutorImpl(myStorage);
        gogo.start();
    }
}
