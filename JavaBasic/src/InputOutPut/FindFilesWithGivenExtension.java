package InputOutPut;

import java.io.File;

public class FindFilesWithGivenExtension {
	 //specify the path (folder) where you want to search files
	static String fileLocation = "D:\\programs";
	 //extension you want to search for e.g. .png, .jpeg, .xml etc
	static String searchWithExtension = ".xml";

	public static void main(String[] args) {
		
		FindFilesWithGivenExtension obj = new FindFilesWithGivenExtension();
		obj.listFiles(fileLocation,searchWithExtension);
		

	}

	public void listFiles(String fileLoc, String ext) {
		SearchFiles files = new SearchFiles(ext);//new class
		File folder = new File(fileLoc);
		if (folder.isDirectory()==false) {
			System.out.println("folder does not exist in : "+fileLoc);
			return;
		}
		String[] list = folder.list(files);
		if(list.length==0) {
			System.out.println("There are no files with the extension : "+ext);
			return;
		}
		for (String file: list) {
			String temp = new StringBuffer(fileLoc).append(File.separator).append(file).toString();
			System.out.println("file : " +temp);
		}
		
	}

}
