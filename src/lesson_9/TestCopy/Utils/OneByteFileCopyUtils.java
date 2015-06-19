package lesson_9.TestCopy.Utils;

import lesson_9.TestCopy.FileAlreadyExistsException;
import lesson_9.TestCopy.FileCopyFailedException;
import lesson_9.TestCopy.FileCopyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class OneByteFileCopyUtils implements FileCopyUtils {

	@Override
	public void copyFile(String source, String destination)
			throws FileCopyFailedException, FileAlreadyExistsException {
		File file = new File(destination);
		
		if (file.exists()){
			throw new FileAlreadyExistsException(" this file already exists - " + destination);
		}
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		try {
			inputStream = new FileInputStream(source);
			outputStream = new FileOutputStream(destination);
			
			int b = 0;
			while (true) {
				b = inputStream.read();
				if (b == -1){
					break;
				}else{
					outputStream.write(b);
				}
			}
		} catch (Exception e) {
			throw new FileCopyFailedException(e.getMessage());

		}finally{
			if (inputStream != null){
				try {
					inputStream.close();
				} catch (IOException e) {
					throw new FileCopyFailedException(e.getMessage());
				}
			}
			
			if (outputStream != null){
				try {
					outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					throw new FileCopyFailedException(e.getMessage());
				}
			}
		}
		
	}
}
