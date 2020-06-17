package FiftymajorJavaPrograms;

import java.util.Arrays;

public class reverseAnArray {

	public static void main(String[] args) {
		String[] names = {"John","jammy","ravi","preety"};
		 System.out.println("original array: " + Arrays.toString(names));
		 reverse(names);
		 System.out.println("reverse array: " + Arrays.toString(names));
		 

	}

	private static void reverse(String[] array1) {
		if(array1==null||array1.length<2) {
			return;
		}
		
		for(int i=0;i<array1.length/2;i++) {
			String temp = array1[i];
			array1[i] = array1[array1.length-1-i];
			array1[array1.length-1-i]=temp;
			
		}
	}

}
