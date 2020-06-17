package collectionPackage;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExample {

	public static void main(String[] args) {
		// Creating an ArrayList of String using
		Collection<String> animals = new ArrayList<>(); 
		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("human");
		animals.add("cat");
		System.out.println(animals);
		System.out.println(animals.size());
		
		//incase of string array
		String[] arrayofanimal = new String[2];
		System.out.println(arrayofanimal.length);
		arrayofanimal[0]="Lion";
		arrayofanimal[1]="human";
		//arrayofanimal[2]="cat";
		for(String str : arrayofanimal) {
			System.out.println(str);
		}

	}

}
