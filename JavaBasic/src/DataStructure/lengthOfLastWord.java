package DataStructure;

import java.awt.List;
import java.util.ArrayList;

public class lengthOfLastWord {
	
void calculateLengthOfLastWord(String Sentence) {
	String lastwordIs = lastWordInString(Sentence);
	int actlen = LastWordLength(lastwordIs);
	System.out.println("The length of last Word is : "+actlen);
	
	
}
	int LastWordLength(String lastWord){
		return lastWord.length() ;
		
	}
	
	String lastWordInString(String givenStr) {
		String lastStr = "";
		int stringLength = givenStr.length();
		//ArrayList<String> al = new ArrayList<String>();
		
		String[] StrArray;
		int i=0;
		if(stringLength!=0) {
			StrArray =givenStr.split(" ") ;
			i=StrArray.length-1;
			while(i>=0) {
			   if(StrArray[i]!="") {
				   lastStr= StrArray[i];
				   break;
				   }else {
				   i--;
				   }
			}
			
			return lastStr;
			
		}else {
			return lastStr;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		String a = "    i dont Know you   ";//3
		
		String b =  "i dont Know yours ";//5
		
		String c = "i dont Know yourself";//8
		
		lengthOfLastWord lo = new lengthOfLastWord();
		lo.calculateLengthOfLastWord(a);
		lo.calculateLengthOfLastWord(b);
		lo.calculateLengthOfLastWord(c);
              
	}

}
