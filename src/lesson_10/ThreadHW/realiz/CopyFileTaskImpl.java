package lesson_10.ThreadHW.realiz;

import lesson_10.ThreadHW.exception.TaskExecutionFailedException;
import lesson_10.ThreadHW.inter.CopyFileTask;
import lesson_9.TestCopy.FileCopyFailedException;
import lesson_9.TestCopy.FileCopyUtils;

public class CopyFileTaskImpl extends TaskImpl implements CopyFileTask{

    public CopyFileTaskImpl() {
    }

    public CopyFileTaskImpl(String from, String to, FileCopyUtils fileCopy) {
        this.from = from;
        this.to = to;
        this.fileCopy = fileCopy;
    }

    private String from = null;
    private String to = null;
    private FileCopyUtils fileCopy = null;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        try {
            fileCopy.copyFile(getFrom(), getTo());
        } catch (FileCopyFailedException e) {
            throw new TaskExecutionFailedException(e.getMessage());
        }

    }

    @Override
    public void setFileCopyUtils(FileCopyUtils copyUtils) {
        this.fileCopy = copyUtils;
    }
}
