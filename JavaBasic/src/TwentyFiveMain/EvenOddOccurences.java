package TwentyFiveMain;

import java.util.ArrayList;
import java.util.HashMap;

public class EvenOddOccurences {

	public static void main(String[] args) {
		int[] in = {1,3,3,6,6,6,10};
		oddEven(in);
		
		
	}
	public boolean oddEvenDecision(int i) {
		
		if(i%2==0) {
		return true	;
		}else {
			return false;
		}
	}
	
	public static void oddEven(int[] in) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i : in) {
			if (hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		
		ArrayList<Integer> evenlist = new ArrayList<>();
		ArrayList<Integer> oddlist = new ArrayList<>();
		for(Integer key: hm.keySet()) {
			if((hm.get(key))%2==0) {
				//System.out.println(hm.get(key)/2);
				evenlist.add(key);
			}else {
				oddlist.add(key);
				//System.out.println(hm.get(key));
				
			}
		}
		
		System.out.println("even :"+evenlist);
		
		System.out.println("odd: " +oddlist);
	}

}
