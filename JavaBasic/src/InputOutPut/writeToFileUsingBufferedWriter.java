package InputOutPut;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeToFileUsingBufferedWriter {

	public static void main(String[] args) {
		
		/*
		 * will be using write() method of BufferedWriter to write the text into a file.
		 * The advantage of using BufferedWriter is that it writes text to a
		 * character-output stream, buffering characters so as to provide for the
		 * efficient writing (better performance) of single characters, arrays, and
		 * strings.
		 */
		
		BufferedWriter bw = null;
		try {
			String mycontent = "This is a try to write it in file."
					+ "Hope it to execute correctly.";
			//Specify the file name and path here
			File file = new File("D:\\programs\\testData\\writingFile\\WriteFile1.txt");
			/* This logic will make sure that the file 
			  * gets created if it is not present at the
			  * specified location*/
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(mycontent);
			System.out.println("file written successfully");
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if(bw!= null)
					bw.close();
			}catch(Exception ex) {
				System.out.println("Error in closing the BufferedWriter"+ex);
			}
		}
	}
	
	
	/*
	 * NOTE :
	 * FILEWRITER :
	 *  public class FileWriter extends OutputStreamWriter
	 *  FileWriter is meant for writing streams of characters. 
	 *  For writing streams of raw bytes, consider using a FileOutputStream.
	 * Convenience class for writing character files. 
	 * The constructors of this class assume that the default character 
	 * encoding and the default byte-buffer size are acceptable.
	 *  To specify these values yourself, construct an OutputStreamWriter on a FileOutputStream.
       Whether or not a file is available or may be created depends upon 
         the underlying platform. Some platforms, in particular,
      allow a file to be opened for writing by only one FileWriter (or other file-writing object) at a time.
      In such situations the constructors in this class will fail if the file involved is already open.
      
      BUFFEREDWRITER :
      public class BufferedWriter extends Writer
      Writes text to a character-output stream, buffering characters so as 
      to provide for the efficient writing of single characters, arrays, and strings.
      A newLine() method is provided, which uses the platform's own notion of line separator 
      as defined by the system property line.separator. Not all platforms use the 
      newline character ('\n') to terminate lines. Calling this method to 
      terminate each output line is therefore preferred to writing a newline character directly.

In general, a Writer sends its output immediately to the underlying character
 or byte stream. Unless prompt output is required, it is advisable to wrap a
  BufferedWriter around any Writer whose write() operations may be costly, 
  such as FileWriters and OutputStreamWriters.
	 */
}
