package collectionPackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
/*
interface SortedSet<E> extends Set<E>{
	
	//3 extra operation which we can do in sorted set apart from set operation
	//Range view
	SortedSet<E> subSet(E fromElement,E toElement);
	SortedSet<E> headSet(E toElement);
	SortedSet<E> tailSet(E fromElement);
	
	//EndPoints
	E first();
	E last();
	
	//comparator access
	
	Comparator<? super E> comparator();
	
}
*/
public class SortedSetExample {
	
	  public static void main(String[] args) {
		    //creating a tree set
		  SortedSet<String> fruits = new TreeSet<>();
		// Adding new elements to a TreeSet
		  fruits.add("apple");
		  fruits.add("orange");
		  fruits.add("pineapple");
		  fruits.add("guava");
		  System.out.println(fruits);
		// Returns the first (lowest) element currently in this set.
		  String fruitFirst = fruits.first();
		  System.out.println("returns the first element: "+fruitFirst);
		// Returns the last (highest) element currently in this set. 
		  String fruitLast = fruits.last();
		  System.out.println("returns the last element: "+fruitLast);
		// Returns the comparator used to order the elements in this set, or
		  // null if this set uses the natural ordering of its elements.
		  Comparator<?> comparator = fruits.comparator();
		  
		  SortedSet<String> tailSet = fruits.tailSet("orange");
		  System.out.println("tails set :" +tailSet);
		  
		  SortedSet<String> headSet = fruits.headSet("pineapple");
		  System.out.println("heads set :" +headSet);
		  
		  SortedSet<String> viewFruitsBetweenRange = fruits.subSet("guava", "pineapple") ;
		  System.out.println("fruit set :" +viewFruitsBetweenRange);
	}

}
