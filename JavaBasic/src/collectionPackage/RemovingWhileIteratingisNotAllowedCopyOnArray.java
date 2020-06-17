package collectionPackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemovingWhileIteratingisNotAllowedCopyOnArray {

	private static List<Integer> list = new CopyOnWriteArrayList<>();
	public static void main(String[] args) {
		list.add(1);
        list.add(2);
        list.add(3);
        final Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
        	final Integer num = itr.next();
        	itr.remove();
        	System.out.println(num);
        }

	}

}
