package collectionPackage;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		 // Creating a HashMap
		Map<String,Integer> numberMapping = new HashMap<>();
		// Adding key-value pairs to a HashMap
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		System.out.println(numberMapping);
		// Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
		numberMapping.put("Four", 4);
		System.out.println(numberMapping);
		numberMapping.put("Three", 5);
		System.out.println(numberMapping);
		
		
	}

}
