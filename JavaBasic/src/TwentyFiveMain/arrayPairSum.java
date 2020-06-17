package TwentyFiveMain;

public class arrayPairSum {

	public static void main(String[] args) {
		int[] num = {5,7,8,9,10,14,6,4,0};
		int sum = 14;
		sumarray(num,sum);
		
	}
	
	public static void sumarray(int[] arr , int k) {
		int size = arr.length;
		System.out.println(size);
		for(int i=0;i<size;i++) {
			int j=i+1;
			while(j<size) {
			//for(int j=i+1;j<size;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println( "the numbers are : "+arr[i]+" and "+arr[j]);
					j++;
				}else {
					j++;
				}
			}
		}
	}

}
