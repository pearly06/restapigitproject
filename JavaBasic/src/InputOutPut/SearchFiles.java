package InputOutPut;

import java.io.File;
import java.io.FilenameFilter;

public class SearchFiles implements FilenameFilter {
       String extn;
       public SearchFiles(String extn) {
    	   this.extn = extn;
       }
	
	
	@Override
	public boolean accept(File loc, String name) {
		if(name.lastIndexOf('.')>0)
		{
			// get last index for '.' 
			int lastIndex = name.lastIndexOf('.');
			// get extension
			String str = name.substring(lastIndex);
			// matching extension 
			if(str.equalsIgnoreCase(extn)) {
				return true;
			}
		}
		return false;
	}
       
}
