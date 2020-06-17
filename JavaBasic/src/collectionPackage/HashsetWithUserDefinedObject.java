package collectionPackage;

import java.util.HashSet;
import java.util.Set;

public class HashsetWithUserDefinedObject {
	
	

	public static void main(String[] args) {
		Set<customer> custset = new HashSet<>();
		custset.add(new customer(101,"Meeta"));
		custset.add(new customer(102, "Sachin"));
		custset.add(new customer(103, "Chris"));
		 /*
        HashSet will use the `equals()` & `hashCode()` implementations 
        of the Customer class to check for duplicates and ignore them
      */
		custset.add(new customer(101,"Meeta"));
		 System.out.println(custset);

	}

}
