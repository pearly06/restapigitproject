package HundredMajorPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class reverseArrayList {
	
	void reverseArrayList(ArrayList<String> al){
		try {
			
		//from java util Iterator class came
		Iterator<String> itr = al.iterator();
		ArrayList<String> reverseAl = new ArrayList<>();
		int count = 0;
		while (itr.hasNext()) {
		//for(int i=0;i<al.size();i++) {	
			//reverseAl.add(al.get(al.size()-1-i));
			reverseAl.add(al.get(al.size()-1-count));
			++count;
			//String str = itr.next();
			
		}
		System.out.println(reverseAl);
		
		}catch(Exception e){
			System.out.println("Arrayout of bound");
		}
		
		
		
	}
	
		
	

}
