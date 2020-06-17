package FiftymajorJavaPrograms;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print your number: ");
		int num = sc.nextInt();
		int flag =0;
		int numbreak =2;
		if(num==0|| num==1) {
			System.out.println("Its not prime");
			
		}else {
			
			  while(numbreak<num) {
				 if(num%numbreak==0) {
					 flag = 1;
					 break;
				 }
				  
				numbreak++;
				
			   }
			
			  if(flag==1) {
				  System.out.println("it is not prime");
				  
			  }else{
				  System.out.println("it is prime");
			  }
			
			/*
			 * for(int numbreak=2;numbreak<=num;numbreak++) { num=num%numbreak ; if(num ==
			 * 0) { flag=1; break; } } if (flag==1) {
			 * System.out.println("it is not prime number"); }else {
			 * System.out.println("It is prime number "); }
			 */
		}

	}

}
