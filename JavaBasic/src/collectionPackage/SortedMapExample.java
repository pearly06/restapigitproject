package collectionPackage;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
		// Creating a TreeMap
		
		SortedMap<String,String> fileExtension = new TreeMap<>();
		
		// Adding new key-value pairs to a TreeMap
		
		fileExtension.put("python", ".py");
        fileExtension.put("c++", ".cpp");
        fileExtension.put("kotlin", ".kt");
        fileExtension.put("golang", ".go");
        fileExtension.put("java", ".java");
        
     // Printing the TreeMap (Output will be sorted based on keys)
        System.out.println(fileExtension);
		
        System.out.println("First Key :" +fileExtension.firstKey());
        System.out.println("Last Key :" +fileExtension.lastKey());
        
        //getting tail and head map
        
        SortedMap<String,String> sortedMap = fileExtension.tailMap("golang");
        System.out.println("tailMap : " + sortedMap);
        sortedMap = fileExtension.headMap("golang");
        System.out.println("headMap : " + sortedMap);		
        
		
	}

}
