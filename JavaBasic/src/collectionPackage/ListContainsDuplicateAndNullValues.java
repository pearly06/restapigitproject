package collectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListContainsDuplicateAndNullValues {
	private static void nullvalueDemo() {
	
	List<String> list = new ArrayList<>();
	list.add(null);
	list.add(null);
	
	System.out.println(list.toString());
	}
	
	private static void DuplicatevalueDemo() {
		
		List<String> list = new ArrayList<>();
		list.add("Duplicate");
		list.add("Duplicate");
		
		System.out.println(list.toString());
		}
	
	public static void main(String[] args) {
		
		nullvalueDemo();
		DuplicatevalueDemo();
	}

}
