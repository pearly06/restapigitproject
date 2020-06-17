package TwentyFiveMain;

import java.util.Scanner;

import mathameticalProgram.palindrome;

public class nextPalindrome extends palindrome {

	nextPalindrome(int i1) {
		super(i1);
		
	}
      
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter your number  : ");
		int i1 = scn.nextInt();
	    int i2 = i1+1;
		while (i2 >i1) {
			if(palindromeDecision(i2)==false) {
				i2++;
			}else {
				System.out.println("The number is: "+i2);
				break;
			}
		}
		

	}

}
