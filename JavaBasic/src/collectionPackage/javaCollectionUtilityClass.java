package collectionPackage;

import java.util.Collections;
import java.util.LinkedList;

public class javaCollectionUtilityClass {

	public static void main(String[] args) {
		listSortingAlgorithmsDemo();

	}
	private static void listSortingAlgorithmsDemo() {
		LinkedList<String> list = new LinkedList<>();
		list.add("element 2");
	     list.add("element 1");
	     list.add("element 4");
	     list.add("element 3");
	     // Sorts the specified list into ascending order, according to
	     // the natural ordering of its elements.
	     Collections.sort(list);
	     for(String str:list) {
	    	 System.out.println(" sort elements in ascending order  --" + str);
	     }
	}

}
