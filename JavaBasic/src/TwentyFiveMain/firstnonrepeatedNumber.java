package TwentyFiveMain;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class firstnonrepeatedNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number of test case");
		int numtest = scn.nextInt();
		System.out.println("the number of test case"+numtest);
		for(int j=0;j<numtest;j++) {
		System.out.println("enter the size");
		int num = scn.nextInt();
		System.out.println("enter the array elements");
		double[] intArraynum = new double[num];
		for(int i=0;i<num;i++) {
			intArraynum[i] = scn.nextDouble(); 
		}
		System.out.println("the size : "+num);
		//System.out.println("the array elements : " +intArraynum);
		
		
		//int num = 5;
	    //int[] intArraynum = new int[]{-1, 2, -1, 3, 2};
	    
	    frstnonrepeating(intArraynum,num);
		}   
	} 

	static int frstnonrepeating(double[] intarray, int sizeOfarray) {
		double b = 0;
		 LinkedHashSet<Double> numlist = new LinkedHashSet<>();
		    for(int i=0;i<sizeOfarray;i++){
		        if(numlist.contains(intarray[i])){
		            numlist.remove(intarray[i]);
		        }else{
		            numlist.add(intarray[i]);
		        }
		         
		    }
		    
		    for(double a : numlist){
		       b = a;
		        break;
		    }
		    System.out.println(b);
		    return (int)b;
		    }

	}


