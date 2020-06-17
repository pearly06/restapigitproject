package FiftymajorJavaPrograms;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1 = scn.nextInt();
		System.out.println("Enter your second number");
		int num2 = scn.nextInt();
		System.out.println(GCD(num1,num2));
		
	}

	public static int GCD(int n1, int n2) {
		if(n2==0) {

			return n1;
		}
		return GCD(n2,n1%n2);
		
	}

}
