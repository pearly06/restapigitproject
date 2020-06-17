package collectionPackage;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		IdentityHashMap<String,String> identityhashmap = new IdentityHashMap<String,String>();
		identityhashmap.put("a", "Java");
		identityhashmap.put(new String("a"), "J2EE");
		identityhashmap.put("b", "J2SE");
		identityhashmap.put(new String("b"), "Spring");
		identityhashmap.put("c", "Hibernate");
		
		for (String str : identityhashmap.keySet()) {
			System.out.println("Key : " + str + " and Value : " + identityhashmap.get(str));
			
			}
		System.out.println("Size of map is : " + identityhashmap.size());
        System.out.println("Here 'a' and new String('a') are considered as separate keys");
        
        HashMap<String,String> hashmap = new HashMap<String,String>();
        hashmap.put("a", "Java");
        hashmap.put(new String("a"), "J2EE");
        hashmap.put("b", "J2SE");
        hashmap.put(new String("b"), "Spring");
        hashmap.put("c", "Hibernate");
        for (String str1 : hashmap.keySet()) {
			System.out.println("Key : " + str1 + " and Value : " + hashmap.get(str1));
			
			}
		System.out.println("Size of map is : " + hashmap.size());
        
        
	}

}
