package collectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CreateInsertRemoveIteratorSynchronizedUserdefinedLinkedHashSet {
	
	private static void linkedHashSetInsertionDemo() {
		Set<String> set = new LinkedHashSet<>();
		set.add("element 1");
		  set.add("element 2");
		  set.add("element 3");
		  set.add("element 4");
		  //// using Iterator
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("LinkedHashSet does "
					  + " maintain insertion order in iterator ---" +str);
			
			}
			
	   // Using advanced for loop
				for(String str: set) {
					System.out.println("LinkedHashSet does "
							  + " maintain insertion order in advanced for loop ---" +str);
				}
				// Java 8
				set.forEach(str ->System.out.println("LinkedHashSet does "
						  + " maintain insertion order in java 8 ---" +str));
	}
	
	private static void SynchronizedhashSetDemo() {
		Set<String> set = new LinkedHashSet<>();
		Set<String> synchronizedset = Collections.synchronizedSet(set);
	}

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		// Adding new elements to the HashSet
		set.add("Monday");
		set.add("Tuesday");
		set.add("Wednesday");
		set.add("Thursday");
		set.add("Friday");
		set.add("Saturday");
		set.add("Sunday");

		// Adding duplicate elements will be ignored
		set.add("Monday");

		System.out.println(set);
		
		//insertion and iterator example
		
		linkedHashSetInsertionDemo();
		
		//remove(Object o)
		/*
		 * Remove an element from a LinkedHashSet (The remove() method returns false if
		 * the element does not exist in the LinkedHashSet )
		 */
		
		boolean isRemoved = set.remove("Saturday");
		System.out.println("After remove(saturday) => " +isRemoved +": "+set);
		isRemoved = set.remove("Saturdaynight");
		System.out.println("After remove(saturdaynight) => " +isRemoved +": "+set);
		
		//removeAll(Collection<?> c)
		
		List<String> weekend = new ArrayList<>();
		weekend.add("Saturday");
		weekend.add("sunday");
		isRemoved = set.removeAll(weekend);
		System.out.println("After remove(weekend) => " +isRemoved +": "+set);
		
		//removeIf(Predicate<? super Integer> filter)
		
		isRemoved = set.removeIf(str->str=="Friday");
		System.out.println("After remove(Friday) => " +isRemoved +": "+set);
		
		//clear();
		weekend.clear();
		System.out.println(weekend);
		
		
		//userdefined object
		
		Set<customer> customers = new LinkedHashSet<>();
        customers.add(new customer(101, "Rajeev"));
        customers.add(new customer(102, "Sachin"));
        customers.add(new customer(103, "Chris"));
        
        /*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */
        customers.add(new customer(101, "Rajeev"));

        System.out.println(customers);

	}

}
