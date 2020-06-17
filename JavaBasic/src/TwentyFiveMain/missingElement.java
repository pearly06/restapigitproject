package TwentyFiveMain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class missingElement {

	public static void main(String[] args) {
		
		int[] act = {4,-9,10,6,7,5,3,7};
		int[] cur = {4,-9,6,7,5,3};
		int[] cur1 = {4,6,7,5,3};
		missingElement(act,cur);
		missingElements(act,cur1);
		missingElementsUsingHashMap(act,cur1);
	}
	public static void missingElement(int[] previous,int[] now) {
		int size1 = previous.length;
		int size2 = now.length;
		int sum1 = 0;
		int sum2 = 0;
		int num ;
		for (int i=0;i<size1;i++) {
			sum1 += previous[i];
		}
		for (int i=0;i<size2;i++) {
			sum2 += now[i];
		}
		
		num = sum1-sum2;
		System.out.println(num);
	}
	
	protected static void missingElements(int[] previous,int[] now) {
		
		int size1 = previous.length;
		int size2 = now.length;
		int count = 0;
		
		
		for (int i=0;i<size1;i++) {
			int k =0;
			while (k < size2) {
			  if (previous[i] != now[k]) {
				  
				  count=0;
			    k++;
			    		
			    }else {
			    	
			    	count++;
			    	break;
			    		}
			    	     
			    	}
			if(count==0) {
			    System.out.println("missing elements " +previous[i]);
			}
			
			
		}
		
		
	}

static void missingElementsUsingHashMap(int[] prev,int[] now) {
	   HashMap<Integer,Integer> prevmap = new HashMap<>();
	   HashMap<Integer,Integer> nowmap = new HashMap<>();
	   int a = prev.length;
	   int b = now.length;
	   
	   for(int i=0;i<a;i++) {
		   if(prevmap.containsKey(prev[i])) {
			   prevmap.put(prev[i],(prevmap.get(prev[i]))+1);
		   }else {
			   prevmap.put(prev[i],1);
		   }
		   
	   }
	   System.out.println("prevmap has : "+prevmap);
	   
	   for(int j=0;j<b;j++) {
		   if(nowmap.containsKey(now[j])) {
			   nowmap.put(now[j],(nowmap.get(now[j]))+1);
		   }else {
			   nowmap.put(now[j],1);
		   }
		   
	   }
	   System.out.println("nowmap has : "+nowmap);
	   
	   int count = 0;
	   
	   for(Map.Entry<Integer, Integer> entry: nowmap.entrySet()) {
		   if(prevmap.containsKey(entry.getKey())) {
			   if (!entry.getValue().equals(prevmap.get(entry.getKey()))) {
				   if(entry.getValue()>prevmap.get(entry.getKey())){
					   count = entry.getValue()-prevmap.get(entry.getKey());
					   System.out.println("this is one key missing : "+entry.getKey()+" and this many times "+count);

				   }else {
					   count = prevmap.get(entry.getKey())-entry.getValue();
					   System.out.println("this is one key missing : "+entry.getKey()+" and this many times "+count);

				   }
			   }
			  // System.out.println("this is another key missing : "+entry.getKey()+" and this many times "+count);
		   }
	   }
	   
	   HashSet<Integer> unionkeys = new HashSet<>(nowmap.keySet());
	   unionkeys.addAll(prevmap.keySet());
	   System.out.println("unionkeys has after adding all : "+unionkeys);
	   unionkeys.removeAll(nowmap.keySet());
	   System.out.println("unionkeys has after removing all : "+unionkeys);
	   System.out.println("these are other keys missing :"+unionkeys);
      }
    

}
