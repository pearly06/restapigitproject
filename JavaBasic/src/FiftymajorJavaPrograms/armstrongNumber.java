package FiftymajorJavaPrograms;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		int  number = sc.nextInt();
		int num = number;
		
		//int num = 153;
		int value = 0;
		int val = 0;
		
		while(num>0) {
			int newnum = num%10;
			val = newnum*newnum*newnum;
			value = value+val;
			num = num/10;
		}
		System.out.println(value);
		if(number == value ) {
			System.out.println("It is an Armstrong Number");
		}else {
			System.out.println("It is not an Armstrong Number");
		}
		
		// 153,371,370,407
		
		

	}

}
