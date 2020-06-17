package FiftymajorJavaPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number for which you want to see factorial: ");
		int num = scn.nextInt();
		int temp =1;
		
		if (num == 0) {
			System.out.println(0);
		}else {
			for(int i=num ; i>=1;--i) {
				temp = temp*i;
			}
			System.out.println("the result is : "+temp);
			
		}
		
		
		
	}

}
