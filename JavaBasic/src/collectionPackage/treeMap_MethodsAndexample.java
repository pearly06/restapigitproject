package collectionPackage;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class treeMap_MethodsAndexample {

	public static void main(String[] args) {
		TreeMap<String,String> fileExtensions = new TreeMap<>();
		// Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", ".kt");
		fileExtensions.put("golang", ".go");
		fileExtensions.put("java", ".java");

		// Printing the TreeMap (Output will be sorted based on keys)
		System.out.println(fileExtensions);
		// loop linkedHahMap using java 8 forEach method
		fileExtensions.forEach((k,v)->{
			System.out.print(k+": ");
			System.out.println(v);
		});
		
		//by default it will print in ascending order to change it to descending.
		// Creating a TreeMap with a Custom comparator (Descending order)
		//System.out.println(fileExtensions.comparator().reversed());
		TreeMap<String,String> fileExtensionsrev = new TreeMap<>(Comparator.reverseOrder());
		fileExtensionsrev.put("python", ".py");
		fileExtensionsrev.put("c++", ".cpp");
		fileExtensionsrev.put("kotlin", ".kt");
		fileExtensionsrev.put("golang", ".go");
		fileExtensionsrev.put("java", ".java");
		System.out.println(fileExtensionsrev);
		//// loop linkedHahMap using before java 8 forEach method
		for(Entry entry :fileExtensionsrev.entrySet()) {
			System.out.print(entry.getKey()+"=>");
			System.out.println(entry.getValue());
		}
		
		//Accessing the entries of a TreeMap
		//Find the size of a TreeMap.
		System.out.println("Total number of languages: " + fileExtensionsrev.size());
		//Check if a given key exists in a TreeMap.
		String lang = "python";
		if(fileExtensionsrev.containsKey(lang)) {
		    // Get the value associated with a given key in a TreeMap
		    String name = fileExtensionsrev.get(lang);
		    System.out.println("language with file " + lang + " : " + name);
		} else {
		    System.out.println("language with file doesnot exist :" + lang);
		}
		//Retrieve the first entry in the TreeMap.
		System.out.println("First entry in  map : " +fileExtensionsrev.firstEntry());
		
		//Retrieve the last entry in the TreeMap.
		System.out.println("Last entry in  map : " +fileExtensionsrev.lastEntry());
		//Retrieve the entry whose key is just lower than the given key.
		Map.Entry<String, String> language = fileExtensionsrev.lowerEntry("kotlin");
		System.out.println(language);
		//Retrieve the entry whose key is just higher than the given key.
		language = fileExtensionsrev.higherEntry("kotlin");
		System.out.println(language);
	}

}
