package TwentyFiveMain;

public class maxConsecutiveSum {

	public static void main(String[] args) {
		
		int[] arr = {3,-5,2,-4,6,-9,9,-10};
		
		sum1(arr);
       //it should give 9
		int[] arr1 = {5,7,-13,10,5};
		sum1(arr1);
		//it should give 15
		
		int[] arr2 = {-40,1,40,-50,1,50,-20,1,20,0};
		sum1(arr2);
		//it should give 52
		int[] arr3= {2,-2,5,-5,6,-6};
		sum1(arr3);
		int[] arr4 = {0};
		sum1(arr4);
	}
	
	static int sum1(int[] arr) {
		int max = 0;
		int temp =0;
		int sum = 0;
		int tempmax=0;

		int len = arr.length;
		
		
		
		
		for(int i=0;i<len;i++) {
			if(tempmax<max) {
				tempmax=max;
			}
			for(int j=i+1;j<len;j++) {
				max = arr[i];
				temp = 0;
				for(int n=i;n<=j;n++) {
					
					temp +=arr[n];
					if(temp>=max) {
						
						max = temp;
						//System.out.println(max);
						
					}
					
				}
				
			}
		}
		
		//
		System.out.println(max);
		//if(tempmax<max) {
			//tempmax=max;
		//}
		System.out.println("This is the max consecutive number:"+tempmax);
		return tempmax;
		
	}
}
