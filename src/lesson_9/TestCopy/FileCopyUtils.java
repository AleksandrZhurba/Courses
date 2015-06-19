package lesson_9.TestCopy;

public interface FileCopyUtils {
	
	
	void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException;
}
