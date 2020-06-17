package collectionPackage;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Hashset_Add_Remove_API_example {

	public static void main(String[] args) {
		// Creating a HashSet
		Set<String> daysOfWeek = new HashSet<>();
		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		// Adding duplicate elements will be ignored
		daysOfWeek.add("Monday");
		System.out.println(daysOfWeek);
		
		//using add all
		// Creating a HashSet from another collection (ArrayList)
		List<String> weekendlist = new LinkedList<>();
		weekendlist.add("Saturday");
		weekendlist.add("Sunday");
		System.out.println(weekendlist);
		Set<String> weekendset = new HashSet<>(weekendlist);
		
		//add all with list and set
		daysOfWeek.addAll(weekendset);
		System.out.println(daysOfWeek);
		//daysOfWeek.addAll(weekendlist);
		//System.out.println(daysOfWeek);
		
		//remove(Object o)
		/*
		 * Remove an element from a HashSet (The remove() method returns false if the
		 * element does not exist in the HashSet)
		 */
		boolean isRemoved = daysOfWeek.remove("Monday");
		System.out.println("after removing monday: " +isRemoved +"------> "+daysOfWeek);
		isRemoved = daysOfWeek.remove("Monday");
		System.out.println("after removing monday: " +isRemoved +"------> "+daysOfWeek);
		
		//remove all 
		daysOfWeek.removeAll(weekendlist);
		System.out.println("after removing weekend: " +daysOfWeek);
		
		//removeIf(Predicate<? super Integer> filter)
		daysOfWeek.removeIf(str-> str=="Friday");
		System.out.println("after removing friday: " +daysOfWeek);
		//clear()
		daysOfWeek.clear();
		System.out.println("after clear: " +daysOfWeek);
		
		

	}

}
