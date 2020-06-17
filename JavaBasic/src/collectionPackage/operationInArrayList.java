package collectionPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class operationInArrayList {

	public static void main(String[] args) {
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("frouzen");
		System.out.println("before any operation.." +programmingLanguages);
		//remove(int index)
		programmingLanguages.remove(4);
		System.out.println("After remove(4): " + programmingLanguages);
		// Remove all the elements that satisfy the given predicate
		programmingLanguages.removeIf(new Predicate<String>(){
			@Override
			public boolean test(String s) {
				  return s.startsWith("C");
				 }
		});
		System.out.println(programmingLanguages);
		
		//clear()
		programmingLanguages.clear();
		System.out.println("After clear(): " + programmingLanguages);
		
	}

}
