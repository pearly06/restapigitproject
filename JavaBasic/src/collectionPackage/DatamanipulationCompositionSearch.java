package collectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DatamanipulationCompositionSearch {

	public static void main(String[] args) {
		listAlgorithmsDemo();

	}
	
	private static void listAlgorithmsDemo() {
		List<String> list = new LinkedList<>();
        list.add("element 2");
        list.add("element 1");
        list.add("element 4");
        list.add("element 3");
        // Sorts the specified list into ascending order, according to 
        //the natural ordering of its elements.
        // All elements in the list must implement the Comparable interface.
        // Furthermore, 
        //all elements in the list must be mutually 
        //comparable (that is, e1.compareTo(e2) 
        //must not throw a ClassCastException for any elements e1 and e2 in the list). 
        Collections.sort(list);
        for(String str : list){
            System.out.println(" sort elements in ascending order  --" + str);
    }
      //reverses the order of the elements in a List.
        Collections.reverse(list);
        for(String str : list){
            System.out.println(" sort elements in reverse order  --" + str);
        }    
         // rotates all the elements in a List by a specified distance.
            Collections.rotate(list, 1);
            for(String str : list){
                System.out.println(" sort elements in rotate order  --" + str);
            } 
            
          //swaps the elements at specified positions in a List.
            
            Collections.swap(list, 0, 1);
            for(String str : list){
                System.out.println(" sort elements in swap order  --" + str);
            } 
            
          //replaces all occurrences of one specified value with another.
            Collections.replaceAll(list, "element 3", "element 6");        
            for(String str : list){
                System.out.println(" sort elements in swap order  --" + str);
            } 
            
            //copy from source to destination the whole list
            List<String> destList = new ArrayList<>(list);
            //Collections.copy(destList,list);
            for(String str : list){
                System.out.println(" sort elements in copy src order  --" + str);
            } 
            for(String str : destList){
                System.out.println(" sort elements in copy dest order  --" + str);
            } 
           // searches for an element in an ordered List using the binary search algorithm.
            //binary search
            Collections.sort(list);
            for(String str : list){
                System.out.println(" sort elements in ascending order  --" + str);
                }         
           int i = Collections.binarySearch(list, "element 4");
           System.out.println("element found in position : "+i);
           
           
         //Returns the number of elements in the specified collection         
           //equal to the specified object.
           
           System.out.println(Collections.frequency(list, "element 1"));
           
           List<String> list2 = new LinkedList<>();
           list2.add("element 2");
           list2.add("element 1");
           list2.add("element 1");
           list2.add("element 3");
           //Returns true if the two specified collections have no elements in common. 
           System.out.println(Collections.disjoint(list, list2));
           
        // Returns the minimum element of the given collection, 
           // according to the natural ordering of its elements.
           // All elements in the collection must implement the Comparable interface.
           
           System.out.println(Collections.min(list));
           
         //Returns the maximum element of the given collection,
           // according to the natural ordering of its elements. 
           //All elements in the collection must implement the Comparable interface. 
           System.out.println(Collections.max(list));
           
	}

}
