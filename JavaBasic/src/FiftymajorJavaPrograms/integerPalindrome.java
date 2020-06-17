package FiftymajorJavaPrograms;

import java.util.Scanner;

public class integerPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Print the number");
		int num = scn.nextInt();
		int actualnum = num;
		//String s = null;
		String finalSTR = null;
		int OppNum = 0;
		int temp = 0;
		while(num > 0) {
			temp = num % 10;
			num = num/10;
			//this logic u didnt know
			OppNum = (OppNum*10)+temp;
			//-----------
			System.out.println(temp);
			System.out.println(OppNum);
			//String s = Integer.toString(temp);
			//System.out.println(s);
			//finalSTR += s;
			//System.out.println(finalSTR);
			
		}
		
		//OppNum = Integer.parseInt(finalSTR);
		//OppNum = Integer.valueOf(finalSTR);
		//System.out.println(OppNum);
		if(actualnum==OppNum) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}

}

//eg: 454
