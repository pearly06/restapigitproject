package InputOutPut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyOneFileToAnother {

	public static void main(String[] args) {
		/*
		 * first we can read the file using FileInputStream
		 *  and then we can write the
		 * read content to the output file using FileOutputStream.
		 */
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			File infile = new File("D:\\programs\\testData\\writingFile\\WriteFile.txt");
			File outfile = new File("D:\\programs\\testData\\writingFile\\CopyOutFile.txt");
			fis = new FileInputStream(infile);
			fos = new FileOutputStream(outfile);
			
			byte[] buffer = new byte[1024];
			int length;
			
			 /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
			
			while((length = fis.read(buffer))>0) {
				fos.write(buffer, 0, length);
			}
			
			//Closing the input/output file streams
			
			fis.close();
			fos.close();
			
			System.out.println("File copied successfully!!");
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
