package searching;

public class binarySearchfunction {
	static int binarysearchfunction(int[] sortedArray,int eleToBeSearch) {
		int first =0;
		int last = sortedArray.length-1;
		
		while(first <=last) {
			int mid = (first+last)/2; //compute mid point
			if(eleToBeSearch < sortedArray[mid]) {
				last = mid-1;       //repeat search in first half
			}else if(eleToBeSearch>sortedArray[mid]) {
				first = mid+1;      //repeat in last half
			}else {
				return mid;
			}
		}
		return -1 ;
		
	}

}
