package TwentyFiveMain;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class ValidshuffleOfCombiningtwoString {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "def";
		String str3 = "dabecf";
		String str4 = "pear";
		String str5 = "ly";
        String str6 = "ylpear";
        String str7 = "lpeyar";
		ValidshuffleOfCombiningtwoString vcs = new ValidshuffleOfCombiningtwoString();
		//vcs.shuffle(str1,str2,str3);
		vcs.shuffleHashmap(str1, str2, str3);
		vcs.shuffleHashmap(str4, str5, str6);
		vcs.shuffleHashmap(str4, str5, str7);

	}
	
	/*
	 * public boolean shuffle(String str1 , String str2, String str3) { int len1 =
	 * str1.length(); int len2 = str2.length(); int len3 = str3.length(); int[]
	 * count1 = new int[len1]; int[] count2 = new int[len2]; int j=0; for(int
	 * i=0;i<len1;i++) { j = str1.indexOf(str1.charAt(i)); count1[i]=j;
	 * System.out.println(count1[i]); j++; }
	 * 
	 * 
	 * 
	 * return false;
	 * 
	 * }
	 */
	public boolean shuffleHashmap(String str1 , String str2, String str3) {
		int len1 = str1.length();
		int len2 = str2.length();
		int len3 = str3.length();
		LinkedHashMap<Character , Integer> hmStr1 = new LinkedHashMap<>();
		LinkedHashMap<Character , Integer> hmStr2 = new LinkedHashMap<>();
		LinkedHashMap<Character , Integer> hmStr3 = new LinkedHashMap<>();
		LinkedHashMap<Character,Integer> hmStr4 = new LinkedHashMap<>();
		LinkedHashMap<Character,Integer> hmStr5= new LinkedHashMap<>();
		
		
		for(int i=0;i<len1;i++) {
			hmStr1.put(str1.charAt(i),i);
		}
		System.out.println(hmStr1);
		for(int i=0;i<len2;i++) {
			hmStr2.put(str2.charAt(i),i);
		}
		System.out.println(hmStr2);
		
		for(int i=0;i<len3;i++) {
			hmStr3.put(str3.charAt(i),i);
		}
		System.out.println(hmStr3);
		Set<Character> hs = hmStr3.keySet();
		int i =0;
		int j =0;
		for(char ch: hs) {
		   	if(hmStr1.containsKey(ch)||hmStr2.containsKey(ch)&& hmStr3.containsKey(ch)) {
		   		if(hmStr1.containsKey(ch)){
		   			hmStr4.put(ch,i);
		   			i++;
		   			
		   		}else {
		   			hmStr5.put(ch,j );
		   			j++;
		   		}
		   		
		   		
		   		
		   	}
		}
		System.out.println(hmStr4);
   		
   		System.out.println(hmStr5);
   		//System.out.println("valid shuffle");
   		
   		if((hmStr1.equals(hmStr4))&&(hmStr2.equals(hmStr5))) {
   			System.out.println("valid shuffle ");
   			return true;
   		}else {
   			System.out.println("Not a valid shuffle");
   			return false;
   		}
		
		
		
	}

}
