package InputOutPut;

import java.io.File;
import java.io.IOException;

public class createFileDemo {

	public static void main(String[] args) {
		File file = new File("D:\\programs\\testData\\newfile.txt");
		/*If file gets created then the createNewFile() 
	      * method would return true or if the file is 
	      * already present it would return false
	      */
		try {
			boolean fcreatn = file.createNewFile();
			if (fcreatn) {
				System.out.println("File is created successfully");
			}else {
				System.out.println("File already present at the specified location");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
