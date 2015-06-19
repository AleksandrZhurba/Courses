import lesson_9.TestCopy.MyFileCopyTestUtils;

public class TestCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyFileCopyTestUtils utils = new MyFileCopyTestUtils();

//		try {
//			long startTime = System.currentTimeMillis();
//			utils.createSimpleFileCopyUtils().copyFile(
//					"d:\\TMP\\erste.txt",
//					"d:\\TMP\\Byte.txt");
//			long endTime = System.currentTimeMillis();
//			System.out.println("Copy time  = " + (endTime - startTime));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			long startTime = System.currentTimeMillis();
			utils.createBufferedFileCopyUtils().copyFile(
					"d:\\TMP\\erste.txt",
					"d:\\TMP\\Buffered.txt");
			long endTime = System.currentTimeMillis();
			System.out.println("Copy time  = " + (endTime - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			long startTime = System.currentTimeMillis();
			utils.createJava7CopyUtils().copyFile(
					"d:\\TMP\\erste.txt",
					"d:\\TMP\\Java7.txt");
			long endTime = System.currentTimeMillis();
			System.out.println("Copy time = " + (endTime - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}

        try {
            long startTime = System.currentTimeMillis();
            utils.createChannelsFileCopyUtils().copyFile(
                    "d:\\TMP\\erste.txt",
                    "d:\\TMP\\Channel.txt");
            long endTime = System.currentTimeMillis();
            System.out.println("Copy time = " + (endTime - startTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
		

	}

}
