package InputOutPut;

import java.io.File;

public class RenameAFile {

	public static void main(String[] args) {
		//old file
		File oldFile = new File("D:\\programs\\testData\\newfile.txt");
		//new file
		File NewFile = new File("D:\\programs\\testData\\newRenamefile.txt");
		
		/*renameTo() return boolean value
		 * It return true if rename operation is
		 * successful
		 */
		boolean flag = oldFile.renameTo(NewFile);
		if (flag) {
			System.out.println("File rename is successful");
		}else {
			System.out.println("File rename is not successful");
		}
		
	}

}
