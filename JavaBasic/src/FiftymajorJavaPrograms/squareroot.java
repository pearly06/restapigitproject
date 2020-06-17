package FiftymajorJavaPrograms;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number for which you want to fi nd the squareroot");
		Double num = scn.nextDouble();
		
//getting the squareroot of a number
		Double sqrroot = Math.sqrt(num);
		System.out.println(sqrroot);
		

	}

}
