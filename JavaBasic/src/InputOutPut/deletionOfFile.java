package InputOutPut;

import java.io.File;

public class deletionOfFile {

	public static void main(String[] args) {
		File file = new File("D:\\programs\\testData\\newfile.txt");
		 /*the delete() method returns true if the file is
         * deleted successfully else it returns false
         */
		try{
		if(file.delete()) {
			System.out.println(file.getName() +" is deleted successfully");
		}else {
			System.out.println(file.getName() +" cannot be deleted successfully");
		}
		}catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
	}

}
