package Mobile_java_basicProgramming;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr1 = {9,14,3,2,43,11,58,22};
		System.out.println("Before selection sort");
		for(int i : arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		selectionSortArraySort(arr1);
		System.out.println("After selection sort");
		for(int i : arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		//bubbleSortArraySort(arr1);
		System.out.println("After bubble sort");
		for(int i : arr1) {
			System.out.println(i+" ");
		}
		System.out.println();
	}
	
	public static void selectionSortArraySort(int[] arr) {
		for(int i =0;i<arr.length-1;i++) {
			{
				for(int j=i+1;j<=arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp = i;
						arr[temp] = arr[i];
						arr[i]=arr[j];
						arr[j]=arr[temp];
						j++;
					}else {
						i++;
					}
					
				}
				i++;
			}
		}
		/*
		 * for(int i=0;i<arr.length-1;i++) {
		 *  int index = i ; 
		 *  for(int j=i+1;j<arr.length;j++) {
		 *  if(arr[j]<arr[index])
		 *   { index = j; }
		 * 
		 * } 
		 * int smallestNum = arr[index];
		 *  arr[index] = arr[i]; 
		 *  arr[i]=smallestNum;
		 * 
		 * }
		 */
	}	
		public static void bubbleSortArraySort(int[] arr) {
			for(int i=0;i<arr.length-1;i++) {
				//int index = i ;
				for(int j=1;j<arr.length-i;j++) {
					if(arr[j-1]<arr[j]) {
						//index = j;
						int smallestNum1 = arr[j-1];
						arr[j-1] = arr[j];
						arr[j]=smallestNum1;
					}
					
				}
				
				
			}
	}

}
