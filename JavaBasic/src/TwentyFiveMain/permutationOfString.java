package TwentyFiveMain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.RandomStringUtils;

public class permutationOfString {

	public static void main(String[] args) {
		String str= "BALL";
		char[] c = {'B','A','L','L'};
		int n = c.length;
		
		permutatedString(str);
		findPermutation(c,0,n);
	}
	public static void permutatedString(String str) {
		String str1 = null;
		ArrayList<Character> listChar = new ArrayList<>();
		//int j =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			listChar.add(ch);
		}
		System.out.println(listChar);
		Collections.sort(listChar);
		System.out.println(listChar);
		
		
		HashMap<Character,Integer> hm = new HashMap<>();
	    for(int i=0;i<listChar.size();i++) {
	    	if(hm.containsKey(listChar.get(i))) {
	    		hm.put(listChar.get(i), (hm.get(listChar.get(i)))+1);
	    	}else {
	    		hm.put(listChar.get(i),1);
	    	}
	    }
	    System.out.println(hm);
	    //claulating up most
	    int permutationCount = 0;
	    int upper=1;
	    int i =1;
	    while(i<listChar.size()+1) {
	        upper =upper*i; 
	        i++;
	    }
	    System.out.println(upper);
	    //HashSet<Character> st = new HashSet<>();
	    int index=0;
	    //calculating downmost
		/*
		 * for(Map.Entry<Character,ArrayList<Integer>> entry: ((List<Character>)
		 * hm).iterator().entrySet()) { Character key = entry.getKey();
		 * ArrayList<Integer> val = entry.getValue(); index++; }
		 */
	    int down = 1;
	    for(Object key: hm.keySet()) {
	    	Character lkey = (Character)key;
	    	Integer list = hm.get(lkey);
	    	System.out.println(list);
	    	int b =1;
	    	int mid = 1;
	    	
	    	while(b<=list) {
	    		mid *= b;
	    		b++;
	    	}
	    	
	    	down *= mid;
	    }
	    System.out.println(down);
	    permutationCount = upper/down;
	    System.out.println("number of permutation :" +permutationCount);
	    
	    //not correct
	   
		/*
		 * HashMap<String , Integer> val = new HashMap<>(); int k=0;
		 * while(k<=permutationCount) { int targetlength = str.length(); String gen= "";
		 * String temp = RandomStringUtils.random(targetlength,str);
		 * if(val.containsKey(temp)) { val.put(temp,2); }else { val.put(temp, 1);
		 * //System.out.println(temp); k++; }
		 * 
		 * 
		 * 
		 * }
		 */
	    
	    }
	
	 static boolean shouldSwap(char ch[],int start,int curr){
		 for(int i=start;i<curr;i++) {
			 if(ch[i]==ch[curr]) {
				 return false;
			 }
		 }
		 
		return true;
	    	
	    }
	 static void findPermutation(char ch[],int index , int n) {
		 if(index>=n) {
			 System.out.println(ch); 
	            return; 
		 }
		// HashSet<Integer> hs = new HashSet<>();
		//hs.remove(o)
		 //int[] c = new int[10];
		// c.
		 
		 for(int i=index;i<n;i++) {
			 // Proceed further for ch[i] only if it  
	            // doesn't match with any of the characters  
	            // after ch[index]  
			 boolean check = shouldSwap(ch,index,i);
			 if(check) {
				 swap(ch,index,i);
				 findPermutation(ch,index+1,n);
				 swap(ch, index, i);
			 }
			 
		 }
	 }
	 
	 static void swap(char[] str, int i, int j) { 
	        char c = str[i]; 
	        str[i] = str[j]; 
	        str[j] = c; 
	    } 

}
