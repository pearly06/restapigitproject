package FiftymajorJavaPrograms;

import java.util.Scanner;

public class reverseAString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter your string");
		String str = scn.nextLine();
		String revstr = "";
		int len = str.length();
		System.out.println(len);
		while(len>0) {
			//String temp = str.substring(len-1);
			String temp = str.substring(len-1,len);
			revstr += temp;
			System.out.println(revstr);
			len--;
		}
		System.out.println("after reversing: "+revstr);

	}

}
