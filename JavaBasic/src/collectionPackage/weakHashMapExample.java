package collectionPackage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class weakHashMapExample {

	public static void main(String[] args) {
		final Map<key,Project> map = new WeakHashMap<>();
		key key1 = new key("ACTIVE");
		final key key2 = new key("INACTIVE");
		map.put(key1, new Project(100, "Customer Management System", "Customer Management System"));
        map.put(key2, new Project(200, "Employee Management System", "Employee Management System"));
        key1 = null;
        System.gc();
        for (final Entry<key, Project> entry : map.entrySet()) {
            System.out.println(entry.getKey().getKey() + "   " + entry.getValue());
        }
        
        //Note that the key1 is null and its entry is removed and garbage collected.
	}

}
