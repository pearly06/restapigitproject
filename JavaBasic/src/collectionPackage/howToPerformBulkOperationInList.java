package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class howToPerformBulkOperationInList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		// addAll() - Appends all of the elements in the specified collection to
	     // the end of this list,
	     // in the order that they are returned by the specified collection's
	     // iterator (optional operation).
		List<String> union = new ArrayList<>();
		union.addAll(list);
		System.out.println(union +": addALL operation example");
		printMessage(union, "addALL operation example ");
		
		// Retains only the elements in this list that are contained in
	    // the specified collection (optional operation).
		
		List<String> retainlist = new ArrayList<>();
		retainlist.add("element 1");
		retainlist.add("element 2");
		retainlist.add("element 3");
		retainlist.add("element 4");
		retainlist.add("element 5");
		System.out.println(retainlist +": before retaining the list is this");
		System.out.println("retainAll -- > " +retainlist.retainAll(list));
		System.out.println(list);
		System.out.println(retainlist +": after retaining the list is this same as the list arraylist");
		
		// Removes from this list all of its elements that are
	    // contained in the specified collection (optional operation).
		
		List<String> Removelist = new ArrayList<>();
		Removelist.add("element 1");
		Removelist.add("element 2");
		Removelist.add("element 3");
		Removelist.add("element 4");
		Removelist.add("element 5");
		System.out.println(Removelist +": before removing the list is this");
		System.out.println("remove all-->" +Removelist.removeAll(list));
		System.out.println(list);
		System.out.println(Removelist +": after removing the list is this");
		printMessage(Removelist, "removeAll operation example "); 
		
		//containsall for checking whether all the element is present 
		//in the current collection or not 
		
		List<String> containslist = new ArrayList<>();
		containslist.add("element 1");
		containslist.add("element 2");
		containslist.add("element 3");
		containslist.add("element 4");
		containslist.add("element 5");
		System.out.println("contains all-->" +containslist.containsAll(list));

		
}

	private static void printMessage(List<String> list, String message) {
		list.forEach(key->System.out.println(message + key));
		
	}

}
