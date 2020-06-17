package collectionPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TraverseTheListInEitherDirection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("element 1");
		list.add("element 2");
	    list.add("element 3");
	    list.add("element 4");
	    
	    ListIterator<String> listitr = list.listIterator();
	    while (listitr.hasNext()) {
	    	String str = listitr.next();
	    	System.out.println("forward direction ---" + str);
	    }
	    
	    while(listitr.hasPrevious()) {
	    	String str = listitr.previous();
	    	System.out.println("backward direction ---" + str);
	    }
	    
	    for(ListIterator<String> listitr1 = list.listIterator(list.size());listitr1.hasPrevious();) {
	    	String t = listitr1.previous();
	         System.out.println(t);
	    }
	}

}
