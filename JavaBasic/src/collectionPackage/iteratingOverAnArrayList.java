package collectionPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class iteratingOverAnArrayList {

	public static void main(String[] args) {
		
		// Three ways to iterator list
		
		List<String> list = new LinkedList<>();
		list.add("element 1");
	    list.add("element 2");
	    list.add("element 3");
	    list.add("element 4");
	 // using Iterator
	    Iterator<String> itr = list.iterator();
	    while(itr.hasNext()) {
	    	String str = itr.next();
	    	System.out.println(" only forward direction using iterator ---" + str);
	    }
	    
	//using advanced for loop
	    for(String str: list) {
	    	System.out.println(" only forward direction using advanced for loop ---" + str);
	    }
	    
	 // Java 8
	    list.forEach(str-> System.out.println("only forward direction using foreach of java8 ---"+str));
	    

		

	}

}
