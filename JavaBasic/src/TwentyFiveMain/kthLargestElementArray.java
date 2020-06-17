package TwentyFiveMain;

import java.util.Arrays;

public class kthLargestElementArray {

	public static void main(String[] args) {
		//int[] ab = {3,1,2,1,4};
		int[] ab = {3,1,2,2,5,6,6,7,4};
		//{1,2,2,3,4,5,6,6,7}
		int k = 7; // for 8 and 9 its out of boundary.
		kthlargestnondistinctele ks = new kthlargestnondistinctele();
		ks.kthDistinct(k, ab);
		ks.kthlargestnondistinct(k, ab);

	}
	
	}
class kthlargestnondistinctele extends kthDistnictElement{
	int count = 0;
 int kthlargestnondistinct(int k,int[] n1){
	 Arrays.sort(n1);
	 for(int i=1;i<k;i++) {
			if(n1[i-1]==n1[i]) {
				k = k+1;
			}
			count = k;
		}
	 System.out.println(n1[count-1]);
	return n1[count-1];
 }
//@Override
 protected int kthDistinct(int k, int[] n1) {
	Arrays.sort(n1);
	System.out.println(n1[k-1]);
	return n1[k-1];
}
 }