package InputOutPut;

import java.io.File;
import java.io.IOException;

public class checkFileIsHidden {

	public static void main(String[] args) throws IOException , SecurityException {
		File file = new File("D:\\programs\\testData\\checker hidden\\myHiddenFile.txt");
		//File file = new File("D:\\programs\\testData\\checker hidden\\myOpenFile.txt");
		if(file.isHidden()) {
			System.out.println("This file is hidden");
		}else {
			System.out.println("This file is not hidden");
		}

	}

}
