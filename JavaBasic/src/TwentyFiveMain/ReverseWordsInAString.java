package TwentyFiveMain;

import java.util.LinkedList;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String str1 = "You Are Awesome!";
     reverseWords rev = new reverseWords(str1);
      rev.reversingWord(str1);
	}

}
class reverseWords{
	private  String str;
	public reverseWords(String str) {
		System.out.println(str);
	}
	
	protected String reversingWord(String str) {
		String[] temp1 = str.split(" ");
		LinkedList<String> l1 = new LinkedList<>();
		for(String temp2: temp1) {
			l1.add(temp2);
		}
		System.out.println(l1);
		int len = l1.size();
		for(int i=0;i<l1.size()/2;i++) {
			String temp3 = l1.get(i);
			l1.set(i, l1.get(len-1-i));
			l1.set(len-1-i, temp3);
		}
		String out1 = "";
		System.out.println(l1);
		for(String temp4:l1) {
			
			 out1=out1+temp4.concat(" ");
			
		}
		out1 = out1.trim();
		System.out.println(out1);
		
		return out1;
		
	}
}