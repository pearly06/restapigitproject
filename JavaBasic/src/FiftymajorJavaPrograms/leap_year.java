package FiftymajorJavaPrograms;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the year");
		Double yr = scn.nextDouble();
		
		if(yr%400 ==0) {
			//Double ab = yr%400;
			System.out.println("Its a leap year");
		}else {
			if(yr%100==0) {
				//Double ab = yr%100;
				System.out.println("Its not a leap year");
			}else {
				if (yr%4==0) {
					//Double ab = yr%4;
					System.out.println("Its a leap year");
				}else {
					System.out.println("Its not a leap year");
				}
			}
		}
	}

}
