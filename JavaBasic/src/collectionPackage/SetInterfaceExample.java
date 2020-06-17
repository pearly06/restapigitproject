package collectionPackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceExample {

	public static void main(String[] args) {
		Set<String> weekdays = new HashSet<>();
		
		weekdays.add("Mon");
		weekdays.add("Tue");
		weekdays.add("Wed");
		weekdays.add("Thur");
		System.out.println(weekdays);
		weekdays.add("Fri");
		System.out.println(weekdays);
		weekdays.add("Thur");
		System.out.println(weekdays);
		
		Set<String> weekdays1 = new LinkedHashSet<>();
		weekdays1.add("Mon");
		weekdays1.add("Tue");
		weekdays1.add("Wed");
		weekdays1.add("Thur");
		System.out.println(weekdays1);
		
		
	}

}
