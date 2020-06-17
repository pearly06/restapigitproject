package TwentyFiveMain;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		String st1 = "Eleven Plus two";
		String st2 = "Twelve plus one";
		if (anagramStrings(st1,st2)==true) {
			System.out.println("It is anagram");
		}else {
			System.out.println("Ït is not Anagram");
		}
		
		
	}
    
	static boolean anagramStrings(String str1,String str2) {
		if(str1.length()==str2.length()) {
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		
		ArrayList<Character> al1 = new ArrayList<>();
		ArrayList<Character> al2 = new ArrayList<>();
		
		for(int i=0;i<str1.length();i++) {
			al1.add(str1.charAt(i));
		}
		System.out.println("first arraylist"+al1);
		
		for(int i=0;i<str2.length();i++) {
			al2.add(str2.charAt(i));
		}
		System.out.println("second arraylist"+al2);
		
		Collections.sort(al1);
		//Collections.
		System.out.println("first arraylist after sort"+al1);
		Collections.sort(al2);
		System.out.println("second arraylist after sort"+al2);
		if(al1.containsAll(al2)) {
		
			
			return true;
		}else {
			return false;
		}
			
			
		
		}
		else {
			return false;
		}
		
		
	}
}
