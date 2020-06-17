package InputOutPut;

import java.io.File;
import java.io.IOException;

public class makingFileReadOnly {

	public static void main(String[] args)throws IOException {
		File myfile = new File("D:\\programs\\testData\\writingFile\\WriteFile.txt");
		//making the file read only
		boolean flag = myfile.setReadOnly();
		if(flag==true) {
			System.out.println("File successfully converted to Read only mode!!");
		}else {
			System.out.println("Unsuccessful Operation!!");
		}
		
		
		
	}

}
