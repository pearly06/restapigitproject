package FiftymajorJavaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class listOfDuplicateCharacter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter your string");
		String str = scn.nextLine();
		printDuplicateChracters(str);
		}

	private static void printDuplicateChracters(String word) {
		char[] characters = word.toCharArray();
//build hashmap with characters and number of times they appear in string
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch:characters ) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch,1);
			}
		}
		//iterate through hashmap to print all duplicate character of string
		Set<Map.Entry<Character,Integer>> entryset = charMap.entrySet();
		System.out.printf("List of duplicate characters in string '%s''%n'",word);
		for(Map.Entry<Character, Integer> entry:entryset) {
			if(entry.getValue()>1) {
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
		}
		
	}

}
