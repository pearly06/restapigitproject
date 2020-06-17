package TwentyFiveMain;

import java.util.LinkedList;

public class jumpingOnclouds {

	public static void main(String[] args) {
		int[] c = {0,0,0,1,0,0,0}; //3
		int[] c1= {0,0,1,0,0,1,0}; //4
		jumpingOnCloudsmethod(c);
		jumpingOnCloudsmethod(c1);
		
	}
	static int i =0;
	static int count =0;
	
	
	static int jumpingOnCloudsmethod(int[] c) {
		LinkedList<Integer> l = new LinkedList<>();
		for(Integer in : c) {
			l.add(in);
		}
		while(i<l.size()) {
		     if(l.contains(0)) {
		    	 l.remove(i);
		    	 }else {
		    		 count++;
		    		 i++;
		    	 }
		    count++;
		    
		}
		/*
		 * while(i<c.length-1) { if(c[i]==0) { while(c[i]==0) { if(i<c.length-1) { i++;
		 * }
		 * 
		 * } count++; }else { i++; count++; }
		 * 
		 * 
		 * }
		 * 
		 */		System.out.println(count);
		
		return count;
	}
}
