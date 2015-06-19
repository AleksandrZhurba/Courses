package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.exception.TaskExecutionFailedException;
import lesson_10.ThreadHW.inter.FindFilesTask;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FindFilesTaskImpl extends TaskImpl implements FindFilesTask{

    public FindFilesTaskImpl() {
    }

    public FindFilesTaskImpl(String directory, String searchString, PrintStream out) {

        this.directory = directory;
        this.searchString = searchString;
        this.out = out;
    }

    private String directory = null;
    private String searchString = null;
    private PrintStream out = null;


    @Override
    public void execute() throws TaskExecutionFailedException {

        File dirFile = new File(directory);
        File [] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                String name = dirFile.getName();
                if (name.indexOf(searchString) != -1){
                    return true;
                }
                return false;
            }
        });
        out.print(files);
    }

    @Override
    public void setDirectory(String directory) throws NullPointerException, FileNotFoundException {
        if (directory == null) {
            throw new NullPointerException("");
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
