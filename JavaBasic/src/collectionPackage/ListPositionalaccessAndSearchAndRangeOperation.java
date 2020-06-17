package collectionPackage;


import java.util.LinkedList;
import java.util.List;

public class ListPositionalaccessAndSearchAndRangeOperation {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		// The basic positional access operations are get, set, add and remove
		
		list.add("element 1");
		list.add("element 2");
	    list.add("element 3");
	    list.add("element 4");
	    list.add("element 2");
	    
	    list.forEach(str-> System.out.println("The elements are.."+str));

	 // Replaces the element at the specified position in this list with
	    // the specified element (optional operation).
	    
	    list.set(3, "element 5");
	    list.forEach(str->System.out.println("after removing and then adding the elements are .."+str));
	    
	 // Inserts the specified element at the specified position in this list
	    // (optional operation).
	    // Shifts the element currently at that position (if any) and any
	    // subsequent
	    // elements to the right (adds one to their indices).
	    
	    list.add(3, "element 4");
	    list.forEach(str->System.out.println("after adding the elements at specified position are .."+str) );
	    
	 // Returns the element at the specified position in this list.
	    System.out.println(list.get(2));
	    
	 // Removes the element at the specified position in this list (optional
	    // operation).
	    // Shifts any subsequent elements to the left (subtracts one from their
	    // indices).//
	    // Returns the element that was removed from the list.
	    
	    list.remove(2);
	    list.forEach(str-> System.out.println("after Removing.."+str));
	    
	    //////////search operations
	    
	 // Returns the index of the first occurrence of the specified element in
	    // this list,
	    // or -1 if this list does not contain the element.
	  int index = list.indexOf("element 2");
	  System.out.println(" search element at index--->" + index);
      index = list.indexOf("Element 2");
      System.out.println(" search element at index --->" + index);  
 
      // Returns the index of the last occurrence of the specified element in
      // this list,
      // or -1 if this list does not contain the element
      
      int lastIndex = list.lastIndexOf("element 2");
      System.out.println(" search element last at index--->" + lastIndex);
      lastIndex = list.lastIndexOf("Element 2");
      System.out.println(" search element last at index--->" + lastIndex);
      
      for(String str : list) {
    	  System.out.println(" list element are --" + str);
      }
      
    //Returns a view of the portion of this list between the specified fromIndex, 
    //inclusive, and toIndex, exclusive.
      
      for(String str : list.subList(1, 3)) {
    	  System.out.println(" sub list are --" + str);
      }
      
    //If fromIndex and toIndex are equal, the returned list is empty.
      for(String str : list.subList(1, 1)) {
    	  System.out.println(" sub list are of--" + str); 
      }
      
	}

}
