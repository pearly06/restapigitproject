package InputOutPut;

import java.io.File;
import java.io.IOException;

public class toMakeWritableFromReadOnly {

	public static void main(String[] args)throws IOException {
		File myfile = new File("D:\\programs\\testData\\writingFile\\WriteFile.txt");
		//changing the file mode to writable
		/*
		 * file.setWritable(true): To make file writable.
		 *  file.setWritable(false): To make file read only.
		 */
		myfile.setWritable(true);
		if(myfile.canWrite()) {
			System.out.println("File is writable.");
	     }else {
	    	 System.out.println("File is read only.");
	     }
		

	}

}
