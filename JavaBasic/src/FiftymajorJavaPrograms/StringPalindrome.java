package FiftymajorJavaPrograms;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your string");
		String checkPalindrome = scn.nextLine();
		String opp = "";
		int lastindex = checkPalindrome.length();
		System.out.println(lastindex);
		for(int i=lastindex -1; i>=0;i--) {
			String temp = checkPalindrome.substring(i, i+1);
			System.out.println("temp one : "+temp);
			opp += temp;
			System.out.println("opp one : "+opp);
		}
		System.out.println(opp);
		
		if(checkPalindrome.equalsIgnoreCase(opp)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not plaindrome");
		}
		
			}

}
