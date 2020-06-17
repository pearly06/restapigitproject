package collectionPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationException {
	//private static List<Integer> list = new ArrayList<>();
	private static List<Integer> list = new CopyOnWriteArrayList<>();

	public static void main(String[] args) {
		list.add(1);
        list.add(2);
        list.add(3);
        
        final Runnable runnable = ()->{
        	list.add(4);
            list.add(5);
        };
        final Thread thread = new Thread(runnable);
        thread.start();
        
        final Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
        	final Integer integer = iterator.next();
        	System.out.println(integer);
        }
        
        //we were modified ArrayList via creating a separate thread.
        //let's replace ArrayList with CopyOnWriteArrayList class and see the output.
        //iterator of CopyOnWriteArrayList is fail-safe and doesn't
        //throw ConcurrentModificationException.

		
	}

}
