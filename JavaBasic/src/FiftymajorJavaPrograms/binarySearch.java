package FiftymajorJavaPrograms;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n = scn.nextInt();
		int[] input = new int[n];
		System.out.println("Enter those number ");
		for(int i=0;i<n;i++) {
			input[i] = scn.nextInt();
		}
		System.out.println("Enter the number you want to search");
		int num = scn.nextInt();
		
		int index = performBinarySearch(input,num);
		System.out.println(index+1);
	}

	public static int performBinarySearch(int[] inp, int no) {
		int low=0;
		int high = inp.length-1;
		while(high>=low) {
			int mid = (high+low)/2;
			if(inp[mid]==no) {
				return mid;
			}else if (inp[mid]<no) {
				low=mid+1;
				
				
			}else if(inp[mid]>no) {
				high=mid-1;
			}
		}
		return -1;
	}

}
