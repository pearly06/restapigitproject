package collectionPackage;

import java.util.HashSet;
import java.util.Set;

public class HashSetBulkOperationApi {

	public static void main(String[] args) {
		
              Set<String> set = new HashSet<>();
              set.add("element1");
              set.add("element2");
              set.add("element3");
              set.add("element4");
              
              // Appends all of the elements in the specified collection to the end of
              // this list,
              // in the order that they are returned by the specified collection's
              // iterator (optional operation).
              Set<String> union = new HashSet<>();
              union.addAll(set);
              printMessage(union,"addAll operation example");
              
              //Retains only the elements in this list that are contained in
              // the specified collection (optional operation).
              
              Set<String> retainele = new HashSet<>();
              retainele.add("element 5");
              retainele.add("element 2");
              retainele.add("element 7");
              System.out.println("reatin all---->"+retainele.retainAll(set));
              
           // Removes from this list all of its elements that are
              // contained in the specified collection (optional operation).
              Set<String> difference = new HashSet<String>();
              difference.add("element 1");
              difference.add("element 2");
              difference.add("element 5");
              difference.add("element 3");
              difference.add("element 4");
              System.out.println("removeAll operation example ---> " + difference.removeAll(set));
              printMessage(difference, "removeAll operation example ");
              printMessage(set, "main set operation example ");
              System.out.println(difference);
              
              
              System.out.println("containsAll operation example ---- > " + difference.containsAll(set));
              
	}

	private static void printMessage(Set<String> myset, String msg) {
		myset.forEach(key->System.out.println(msg+key));
		
	}

}
