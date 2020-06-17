package DataStructure;

public class majorityElement {

	public static void main(String[] args) {
		int[] myarr1 = new int[]{1,2,2,6,0};
		int[] myarr2 = new int[]{1,1,2,2};
		int[] myarr3 = new int[]{3,3,3,3};
		majorityElement me = new majorityElement();
		me.findmajorelement(myarr1);
		me.findmajorelement(myarr2);
		me.findmajorelement(myarr3);
		
	}

	public int findmajorelement(int[] series) {
		int count=0;
		int max = 0;
		int ele = series[0];
		for(int i=0;i<series.length;i++) {
			if(ele == series[i]) {
				count=count+1;
				max = series[i];
			}else {
				
				if(count>0) {
					count = count-1;
					ele = series[i];
					}
				
				
			}
		}
		
		System.out.println(max);
		return max;
		
	}
	
}

