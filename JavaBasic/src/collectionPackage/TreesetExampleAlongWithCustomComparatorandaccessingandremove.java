package collectionPackage;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetExampleAlongWithCustomComparatorandaccessingandremove {

	public static void main(String[] args) {
		// Creating a TreeSet with a custom Comparator (Case Insensitive Order)
		SortedSet<String> weekdays_caseinsesntive = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		weekdays_caseinsesntive.add("Monday");
		weekdays_caseinsesntive.add("Tuesday");
		weekdays_caseinsesntive.add("Wednesday");
		weekdays_caseinsesntive.add("Thursday ");
		weekdays_caseinsesntive.add("Friday");
		weekdays_caseinsesntive.add("Saturday");
		weekdays_caseinsesntive.add("Sunday");
		weekdays_caseinsesntive.add("Sunday");
		weekdays_caseinsesntive.add("sunday");
		weekdays_caseinsesntive.add("");
		//weekdays_caseinsesntive.add(null);
		System.out.println("TreeSet with a custom Comparator (Case Insensitive Order) : " +weekdays_caseinsesntive);
		
		// Creating a TreeSet with a custom Comparator (Descending  Order)
		SortedSet<String> weekdays_descendingOrder = new TreeSet<>(Comparator.reverseOrder());
		weekdays_descendingOrder.add("Monday");
		weekdays_descendingOrder.add("Tuesday");
		weekdays_descendingOrder.add("Wednesday");
		weekdays_descendingOrder.add("Thursday ");
		weekdays_descendingOrder.add("Friday");
		weekdays_descendingOrder.add("Saturday");
		weekdays_descendingOrder.add("Sunday");
		weekdays_descendingOrder.add("Sunday");
		weekdays_descendingOrder.add("sunday");
		weekdays_descendingOrder.add("");
		System.out.println("TreeSet with a custom Comparator (Descending  Order) : " +weekdays_descendingOrder);
		
		
		//accessing the element ...................
		
		//Example 1: Find the size of a TreeSet.
		System.out.println("Number of elements in the TreeSet : " + weekdays_caseinsesntive.size());
		
		//Example 2: Check if an element exists in a TreeSet.
		String name = "sunday";
		String Name2 = "January";
		if(weekdays_descendingOrder.contains(name)) {
			 System.out.println("weekdays_descendingOrder TreeSet contains the element : " + name);
			} else {
			 System.out.println("weekdays_descendingOrder TreeSet does not contain the element : " + name);
			}
		if(weekdays_caseinsesntive.contains(name)) {
			 System.out.println("weekdays_caseinsesntive TreeSet contains the element : " + name);
			} else {
			 System.out.println("weekdays_caseinsesntive TreeSet does not contain the element : " + name);
			}
		if(weekdays_descendingOrder.contains(Name2)) {
			 System.out.println("weekdays_descendingOrder TreeSet contains the element : " + Name2);
			} else {
			 System.out.println("weekdays_descendingOrder TreeSet does not contain the element : " + Name2);
			 }
		
		//Example 3: Find the first element in the TreeSet.
		
		System.out.println("First element weekdays_caseinsesntive : " + weekdays_caseinsesntive.first());
		System.out.println("First element weekdays_descendingOrder : " + weekdays_descendingOrder.first());
		
		//Example 4: Find the last element in the TreeSet.
		System.out.println("Last element weekdays_caseinsesntive : " + weekdays_caseinsesntive.last());
		System.out.println("Last element weekdays_descendingOrder : " + weekdays_descendingOrder.last());
		
		//Example 5: Find the element just higher than the given element in the TreeSet.
		String findName = "tuesday";
		//System.out.println("Element just greater than "  + findName + " : " + weekdays_caseinsesntive.higher(findName));
		TreeSet<String> weekdays = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday ");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		weekdays.add("Sunday");
		weekdays.add("sunday");
		weekdays.add("");
		//weekdays.add(null);
		System.out.println("TreeSet with a custom Comparator (Case Insensitive Order) : " +weekdays);
		System.out.println("Element just greater than "  + findName + " : " + weekdays.higher(findName));
		//Example 6: Find the element just lower than the given element in the TreeSet.
		System.out.println("Element just lower than "  + findName + " : " + weekdays.lower(findName));
		
		//Removing elements from a TreeSet..............
		
		boolean isRemoved = weekdays.remove("saturday");
		System.out.println("TreeSet with a custom Comparator (Case Insensitive Order) :"+isRemoved+ "  :  "+ weekdays);
		
		// Remove the first element of the TreeSet.
		
		String day_first = weekdays.pollFirst();
		//String day1 = weekdays_caseinsesntive.pollFirst();
		System.out.println("Removed first element " + day_first + " from the TreeSet : " + weekdays);
		
		//Remove the last element of the TreeSet.
		String day_last= weekdays.pollLast();
		System.out.println("Removed last element " + day_last + " from the TreeSet : " + weekdays);
		
		//Remove all elements that satisfy a given predicate.
		
		weekdays_descendingOrder.removeIf(day-> day=="sunday");
		System.out.println("after removing the required element"+weekdays_descendingOrder);
	}

}
