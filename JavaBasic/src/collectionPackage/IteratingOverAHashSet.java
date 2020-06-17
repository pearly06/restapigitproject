package collectionPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingOverAHashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("element 1");
		set.add("element 2");
		set.add("element 3");
		set.add("element 4");
		
		// using Iterator
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println("using iterator: "+str);
		}
		
		
		// Using advanced for loop
		
		for(String str: set) {
			System.out.println("using advanced for loop: "+str);	
		}
		
		//forEach in java 8
		
		set.forEach(str->System.out.println("using advanced foreach in java 8 loop: "+str));
		

	}

}
