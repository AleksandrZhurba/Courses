package lesson_9.TestCopy;

import lesson_9.TestCopy.Utils.BufferedFileCopy;
import lesson_9.TestCopy.Utils.ChannelFileCopy;
import lesson_9.TestCopy.Utils.Java7FileCopy;
import lesson_9.TestCopy.Utils.OneByteFileCopyUtils;

public class MyFileCopyTestUtils implements FileCopyTestUtils{

	@Override
	public FileCopyUtils createSimpleFileCopyUtils() {
		return new OneByteFileCopyUtils();
	}

	@Override
	public FileCopyUtils createBufferedFileCopyUtils() {
		// TODO Auto-generated method stub
		return new BufferedFileCopy();
	}

	@Override
	public FileCopyUtils createChannelsFileCopyUtils() {
		// TODO Auto-generated method stub
		return new ChannelFileCopy();
	}

	@Override
	public FileCopyUtils createJava7CopyUtils() {
		// TODO Auto-generated method stub
		return new Java7FileCopy();
	}

}
