package collectionPackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HowHashsetcontainsduplicateandNullandsynchronized {
	
	//// Set can contain one null value
	private static void nullValue() {
		Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		System.out.println(set.toString());
	}
	// it is not contain duplicate elements
    
	private static void duplicateValue() {
		Set<String> set = new HashSet<>();
		set.add("element1");
		set.add("element1");
		System.out.println(set.toString());
	}
	
	// HashSet is not synchronized
	private static void synchronizedhashset() {
		Set<String> set = new HashSet<>();
		Set<String> synchronizedSet = Collections.synchronizedSet(set);
	
	}
	public static void main(String[] args) {
		nullValue();
		duplicateValue();
	}

}
