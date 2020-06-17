package collectionPackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class linked_Hashmap_methods {

	public static void main(String[] args) {
		//// Creating a LinkedHashMap
		LinkedHashMap<String,String> userCityMapping = new LinkedHashMap<>();
		//put and putifabsent
		userCityMapping.put("John", "New York");
		userCityMapping.put("Rajeev", "Bengaluru");
		System.out.println(userCityMapping);
		userCityMapping.putIfAbsent("Steve", "London");
		System.out.println(userCityMapping);
		//isEmpty()
		Map<String, String> emptymap = new LinkedHashMap<>();
		// Check if a HashMap is empty
		System.out.println("is Linkedmap empty? : " + emptymap.isEmpty());
		System.out.println("is Linkedmap empty? : " + userCityMapping.isEmpty());
		//size
		System.out.println("We have the city information of " + userCityMapping.size() + " users");
		//contains key
		String userName = "Steve";
		// Check if a key exists in the HashMap
		if(userCityMapping.containsKey(userName)) {
		 // Get the value assigned to a given key in the HashMap
			String city = userCityMapping.get(userName);
			System.out.println(userName + " lives in " + city);
		}else {
			 System.out.println("City details not found for user " + userName);
		}
		//containsValue(Object value)
		// Check if a value exists in a HashMap
		String repectiveCity = "New York";
		if(userCityMapping.containsValue(repectiveCity)) {
		 System.out.println("There is a user in the userCityMapping who lives in "+repectiveCity);
		} else {
		 System.out.println("There is not user in the userCityMapping who lives in "+repectiveCity);
		}
		
		//remove(Object key)
		userCityMapping.put("Jack", "Australia");
		userCityMapping.put("Chris", "Newzeland");
		userCityMapping.put("Harry", "sri lanka");
		System.out.println(userCityMapping);

		String usertoremove = "Chris";
		String wife = userCityMapping.remove(usertoremove);
		System.out.println(userCityMapping);
		//remove(Object key, Object value)
		
		boolean isRemoved = userCityMapping.remove("Steve", "London");
		System.out.println("Did Steve get removed from the mapping? : " + isRemoved);
		System.out.println(userCityMapping);
		//using replace function changing old value to new
		userCityMapping.replace("Harry", "sri lanka", "Maldives");
		System.out.println(userCityMapping);
		
		//Iterate over a LinkedHashMap using Java 8 forEach and lambda expression
		userCityMapping.forEach((user,city)->{
			 System.out.println(user + " => " + city);
		});
		
		//Iterating over the LinkedHashMap's entrySet using Java 8 forEach and lambda
		userCityMapping.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		});
		
		//Iterating over the entrySet of a LinkedHashMap using iterator()
		Iterator<Map.Entry<String,String>> userCityMappingIterator  = userCityMapping.entrySet().iterator();
		while(userCityMappingIterator.hasNext()) {
			Map.Entry<String, String> entry = userCityMappingIterator.next();
			System.out.println(entry.getKey() + " =>:: " + entry.getValue());
		}
		
		//Iterating over the entrySet of a LinkedHashMap using iterator() and forEachRemaining()
		
		 Iterator<Entry<String, String>> userCityMappingIterator1 = userCityMapping.entrySet().iterator();
		 userCityMappingIterator1.forEachRemaining(entry->{
			 System.out.println(entry.getKey() + " =>: " + entry.getValue());
		 });
		 
		// loop linkedHahMap using java 8 forEach method
		 
		 userCityMapping.forEach((k, v) -> {
			   System.out.println(k);
			   System.out.println(v);
			  });
		 
		// loop linkedHahMap using before java 8 forEach method
		 for (Entry pair : userCityMapping.entrySet()) {
			   System.out.println(pair.getKey());
			   System.out.println(pair.getValue());
			  }
		 
	}

}
