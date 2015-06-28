package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.exception.TaskExecutionFailedException;
import lesson_10.ThreadHW.inter.FindFilesTask;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask{
    private String directory = null;
    private String searchString = null;
    private PrintStream out = null;

    static Logger log = Logger.getLogger(FindFilesTask.class.getName());
    public FindFilesTaskImpl() {
    }

    public FindFilesTaskImpl(String directory, String searchString, PrintStream out) {

        log.info("Find files tasks is started");

        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }




    @Override
    public void execute() throws TaskExecutionFailedException {

        File dirFile = new File(directory);
        File[] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                String name = dirFile.getName();
                if (name.indexOf(searchString) != -1){
                    return true;
                }
                return false;
            }
        });
        out.println("find " + files.length + " files with name <" + searchString + "> : " + Arrays.toString(files));
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("Derictory is not set");
        }
        File file = new File(directory);
        if (!file.exists()) {
            throw new  FileNotFoundException("directory not exists");
        }
        this.directory = directory;
    }

    @Override
    public void setFileNameSearchString(String searchString) throws IllegalArgumentException {
        this.searchString = searchString;
    }

    @Override
    public void setPrintStream(PrintStream out) {
        this.out = out;

    }
}
