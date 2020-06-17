package collectionPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAddRemoveRetrieveSearchIterate {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("E");
		System.out.println(list);
		//add(int index, String element)
		list.add(3, "D");
		System.out.println(list);
		//addFirst(String e)
		list.addFirst("F");
		System.out.println(list);
		//addLast(String e)
		list.addLast("G");
		System.out.println(list);
		//addAll(Collection<? extends String> c)
		LinkedList<String> secondList =new LinkedList<>();
		secondList.add("I");
		secondList.add("J");
		list.addAll(secondList);
		System.out.println(list);
		System.out.println("Started With Remove");
		//removeFirst()
		list.removeFirst();
		System.out.println(list);
		//removeLast()
		list.removeLast();
		System.out.println(list);
		//remove(Object o)
		boolean isRemoved = list.remove("G");
		if(isRemoved) {
			System.out.println(list);
		}
		//removeIf(Predicate<? super String> filter)
		list.removeIf(secondlist ->secondlist.startsWith("C"));
		System.out.println(list);
		
		//clear()
		secondList.clear();
		System.out.println(secondList);
		
		System.out.println("Retrieving Elements");
		System.out.println(list);
		//getFirst()
		String firstElement = list.getFirst();
		System.out.println(firstElement);
		//getLast()
		String lastElement = list.getLast();
		System.out.println(lastElement);
		//get(int index)
		System.out.println(list);
		String indexElement = list.get(2);
		System.out.println(indexElement);
		
		//Search elements LinkedList API's
		System.out.println("Search elements LinkedList");
		System.out.println(list);
		//contains(Object o)
		System.out.println(list.contains("E"));
		System.out.println(list.contains("F"));
		//indexOf(Object o)
		System.out.println(list.indexOf("E"));
		System.out.println(list.indexOf("F"));
		//lastIndexOf(Object o)
		list.add("E");
		System.out.println(list);
		System.out.println(list.lastIndexOf("E"));
		System.out.println(list.lastIndexOf("F"));
		
		//Iterating over LinkedList
		System.out.println("Iterating over LinkedList");
		System.out.println(list);
		//forEach(Consumer<? super String> action)
		/*
		 * Performs the given action for each element of the Iterable until all elements
		 * have been processed or the action throws an exception. Unless otherwise
		 * specified by the implementing class, actions are performed in the order of
		 * iteration (if an iteration order is specified). Exceptions thrown by the
		 * action are relayed to the caller.
		 */
		list.forEach(alphabet->{System.out.println("for each : "+alphabet);});
		//iterator()
		//Returns an iterator over the elements in this list (in proper sequence).
		Iterator<String> alphabet = list.iterator();
		while(alphabet.hasNext()) {
			String Alphabet = alphabet.next();
			System.out.println(Alphabet);
		}
		
		
		
		

	}

}
