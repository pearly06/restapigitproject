package InputOutPut;

import java.io.File;
import java.io.IOException;

public class checkWhetherFileIsWritableorReadOnly {

	public static void main(String[] args)throws IOException  {
		File myfile = new File("D:\\programs\\testData\\writingFile\\WriteFile.txt");
		if (myfile.canWrite()) {
			System.out.println("File is writable.");
		}else {
			System.out.println("File is read only.");
		}
	}

}
