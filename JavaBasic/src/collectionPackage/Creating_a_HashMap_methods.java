package collectionPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Creating_a_HashMap_methods {

	public static void main(String[] args) {
		Map<String,Integer> number = new HashMap<>();
		
		// Adding key-value pairs to a HashMap
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put(null, 6);
		number.put("", 10);
		
		System.out.println("adding numbers"+number);
		// Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
		/* putIfAbsent
		 * If the specified key is not already associated with a value (or is mapped to
		 * null) associates it with the given value and returns null, else returns the
		 * current value.
		 */
		number.putIfAbsent("Four", 4);
		number.putIfAbsent("Six", 6);
		number.putIfAbsent("Ten", 10);
		System.out.println("adding numbers if absent"+number);
		number.putIfAbsent("Six", 6);
		System.out.println("adding numbers if absent second"+number);
		
		
		// Check if a HashMap is empty
		Map<String,String> userCityMapping = new HashMap<>();
		System.out.println("is userCityMapping empty? : "+userCityMapping.isEmpty()); 
		System.out.println("is number empty? : "+number.isEmpty()); 
		
		/*
		 * size()
		 *  Returns the number of key-value mappings in this map. If the map
		 * contains more than Integer.MAX_VALUE elements return Integer.MAX_VALUE.
		 */
		System.out.println("We have the number information of " +number.size() +" number" );
		
		//containsKey(Object key)
		//contains a mapping for a key k such that (key==null ? k==null: key.equals(k)
		
		String myKey = ""; 
		if(number.containsKey(myKey)) {
			int i = number.get(myKey);
			System.out.println(myKey + " in numbers " + i);
		}else {
			 System.out.println("Key not found " + myKey);
		}
		
		//same for value  containsValue(Object value)
		//contains at least one mapping to a value v such that (value==null ? v==null : value.equals(v))
		int myValue = 10; 
		if(number.containsValue(myValue)) {
			System.out.println("Prsent");
		}else {
			 System.out.println("Not Present");
		}
		
		//remove(Object key)
		//contains a mapping from key k to value v such that (key==null ? k==null: key.equals(k))
		System.out.println("numbers"+number);
		number.remove("");
		System.out.println("removing numbers"+number);
		
		//remove(Object key, Object value)
		boolean isRemoved = number.remove("Two", 2);
		System.out.println("Did number selected get removed from the mapping? : " + isRemoved);
		System.out.println("removing selected numbers"+number);
		isRemoved = number.remove("Zero", 0);
		System.out.println("Did number selected get removed from the mapping? : " + isRemoved);
		System.out.println("removing selected numbers"+number);
		
		
		//// HashMap demonstration for null keys and duplicate keys
		
		number.put(null, null);
		number.put(null, null);
		// iterate map using java 8 forEach method
		number.forEach((k,v)->{
			System.out.println(k);
			  System.out.println(v);
		});
		//another way in for loop
		for(Entry<String,Integer> entry : number.entrySet()) {
			System.out.println(entry.getKey());
			  System.out.println(entry.getValue());
		}
		
		System.out.println("numbers"+number);
		
		//// Returns a Set view of the keys contained in this map
		Set<String> keysTotal = number.keySet();
		System.out.println("the keys: "+keysTotal);
		
		// Returns a Collection view of the values contained in this map
		Collection<Integer> allnum = number.values();
		System.out.println("the values: "+allnum);
		
		// Returns a Set view of the mappings contained in this map
		Set<Entry<String,Integer>> entry = number.entrySet();
		System.out.println("the  keys and values: "+entry);
		
		//multimap
		Map<String,List<Integer>> multimapdemo = new HashMap<>();
		List<Integer> multivalueList = new ArrayList<>();
		multivalueList.add(0);
		multivalueList.add(20);
		multimapdemo.put("zero", multivalueList);
		System.out.println(multimapdemo);
		
		//synchronization
		
		Map<String, String> currencies = new HashMap<String, String>();
		currencies.put("USA", "USD");
		currencies.put("England", "GBP");
		currencies.put("Canada", "CAD");
		currencies.put("HongKong", "HKD");
		currencies.put("Australia", "AUD");
		// Synchronizing HashMap in Java
		currencies = Collections.synchronizedMap(currencies);
		// Make sure to synchronize Map while Iterating
		// getting key set can be outside synchronized block
		Set<String> keySet1 = currencies.keySet();
		synchronized(currencies) {
			Iterator<String> itr = keySet1.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		//foreach with object loop
		
		Map<Integer, Person> map = new HashMap<>();
		map.put(1, new Person(100, "Ramesh"));
		map.put(2, new Person(100, "Ram"));
		 map.put(3, new Person(100, "Prakash"));
		 map.put(4, new Person(100, "Amir"));
		 
		 for(final Entry<Integer,Person> entry1:map.entrySet()) {
			 System.out.println(entry1.getKey());
			//System.out.println(entry1.getValue().getName()));
		 }
		
		 ////  In Java 8, you can loop a Map with forEach + lambda expression.
		map.forEach((k,p)->{
			System.out.println(k);
			 System.out.println(map.get(k));
		});
		
		
		
		
	}

}
