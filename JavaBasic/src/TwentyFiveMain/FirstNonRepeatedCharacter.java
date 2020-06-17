package TwentyFiveMain;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import collectionPackage.ConcurrentModificationException;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) throws java.util.ConcurrentModificationException, InterruptedException {
		
           String str = "I Am feeling naseauted";
           FirstNonRepeatedCharacter fc = new FirstNonRepeatedCharacter();
           fc.firstRepeatedCharRemovingRepeatedCharacter(str);
	}
	protected char firstRepeatedCharRemovingRepeatedCharacter(String str) throws java.util.ConcurrentModificationException, InterruptedException{
		str = str.toUpperCase();
		String temp = "";
		String stt = "" ;
		String str2 = null ;
		String[] arr = str.split(" ");
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
		LinkedList<Character> ll = new LinkedList<>();
		LinkedList<Character> l2 = new LinkedList<>();
	    for(int i=0;i<arr.length;i++) {
	    	String str1 = arr[i];
	    	for(int j=0;j<str1.length();j++){
	    		char c = str1.charAt(j);
	    		if(hm.containsKey(str1.charAt(j))){
	    			
	    			hm.put(c,(hm.get(c))+1);
	    		}else {
	    			hm.put(c, 1);
	    		}
	    	}
	    }
	    
	    System.out.println(hm);
	    
	    for(Character st:hm.keySet()) {
	    	if(hm.get(st)==1) {
	    		ll.add(st);
	    		System.out.println("The numbers : "+st);
	    		
	    	}
	    	 }
		System.out.println(ll.get(0));
	Thread.sleep(2000);
		for(Character st1:hm.keySet()){
	    	if(hm.get(st1)>1) {
	    		l2.add(st1);
	    	 }
	    }
	
		System.out.println("all the repeating characters are :"+l2);
		System.out.println("all the non repeating characters are :" +ll);
		//System.out.println(ll.get(0));
		
		for(int i=0;i<arr.length;i++) {
		 String st = arr[i];
		 for(int j=0;j<st.length();j++) {
			 
			 if(ll.contains(st.charAt(j))) {
				 
				 //st = st.replace(st.charAt(j),Character.MIN_VALUE);
			 stt = st.substring(j,j+1);
				
			 }
			 //System.out.print(stt+ " ");
			 
		 }
		 stt += stt+" ";
		 
			System.out.println(stt);
		//temp += stt+" ";
		 //System.out.println("lines: "+temp);
		}
		//String expected = "";
		//expected += temp;
		//System.out.println("final : "+temp);
		return ll.get(0);
		
	}

}
