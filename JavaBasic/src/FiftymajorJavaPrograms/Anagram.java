package FiftymajorJavaPrograms;

import java.util.Arrays;

public class Anagram {
	
	public static boolean isAnagram(String word ,String anagram){
		
		if(word.length()!= anagram.length()) {
			System.out.println("false");
			return false;
		}
		char[] chars = word.toCharArray();
		for(char c:chars ) {
			int index = anagram.indexOf(c);
			if(index != -1) {
				anagram = anagram.substring(0,index)+anagram.substring(index+1);
				System.out.println("true");
				return true;
			}else {
				System.out.println("false");
				return false;
				
			}
				
		}
		System.out.println("false");
		return anagram.isEmpty();
		
		
	}
	//another way
	
	public static boolean Anagram(String word ,String anagram){
		char[] charWord = word.toCharArray();
		char[] charAnagram = anagram.toCharArray();
		Arrays.sort(charWord);
		Arrays.sort(charAnagram);
		return Arrays.equals(charWord, charAnagram);
		
	}

	public static void main(String[] args) {
		/*
		 * A string is said to be an anagram if it contains same characters and same
		 * length but in different order e.g. army and Mary are anagrams.
		 */
		Anagram ana = new Anagram();
		
		//ana.isAnagram("Army", "Mary");
		
		ana.isAnagram("BOArmy", "BOMary");
		
       // ana.Anagram("Army", "Mary");
		
		//ana.Anagram("BOArmy", "BOMaryyy");
		//ana.isAnagram("word", "sentence");
		
	}

}
