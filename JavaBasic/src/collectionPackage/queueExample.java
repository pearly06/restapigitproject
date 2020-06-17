package collectionPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*-------Queue interface source code in Java Library------
public interface Queue<E> extends Collection<E>{
	E element();
	boolean offer(E e);
	E peek();
	E poll();
	E remove();
}
----------------------------------------*/

/*
 * Demonstrate Queue interface methods with LinkedList implementation.
*/
public class queueExample {

	public static void main(String[] args) {
		// Create and initialize a Queue using a LinkedList
		Queue<String> eleQue = new LinkedList<>();
		Queue<String> eleQueAno = new LinkedList<>();
		// Adding new elements to the Queue (The Enqueue operation)
		eleQue.add("ele1");
		eleQue.add("fle2");
		eleQue.add("ale3");
		eleQue.add("ble4");
		System.out.println("WaitingQueue : " + eleQue);

        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
		
		String name = eleQue.remove();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + eleQue);
		//String name1 = eleQueAno.remove();
		//System.out.println("Removed from WaitingQueue : " + name1 + " | New WaitingQueue : " + eleQueAno);
		// Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = eleQue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + eleQue);
        String name1 = eleQueAno.poll();
        System.out.println("Removed from WaitingQueue : " + name1 + " | New WaitingQueue : " + eleQueAno);
        name = eleQue.peek();
        System.out.println("Retrieved from WaitingQueue : " + name + " | New WaitingQueue : " + eleQue);
        name1 = eleQueAno.peek();
        System.out.println("Retrieved from WaitingQueue : " + name1 + " | New WaitingQueue : " + eleQueAno);
        //Queue interface methods - isEmpty(), size(), element(),peek() with examples.
     // Check is a Queue is empty
        System.out.println("is queue empty? : "+eleQue.isEmpty());
        System.out.println("is queue empty? : "+eleQueAno.isEmpty());
     // Find the size of the Queue
        System.out.println("is queue empty? : "+eleQue.size());
        System.out.println("is queue empty? : "+eleQueAno.size());
     // Check if the Queue contains an element
        String searchname= "ale3";
        if(eleQue.contains(searchname)) {
        //if(eleQueAno.contains(searchname)) {	
        	System.out.println("Queue contains "+searchname);
        }else {
        	System.out.println("Queue doesnot contains "+searchname); 
        }
        
     // Get the element at the front of the Queue without removing it using element()
        // The element() method throws NoSuchElementException if the Queue is empty
        
        String firstElementInQueue = eleQue.element();
        System.out.println(firstElementInQueue);
		/*
		 * String firstElementInQueueAno = eleQueAno.element();
		 * System.out.println(firstElementInQueueAno);
		 */
        
   // 
        
        eleQue.add("ele1");
        eleQue.add("fle2");
        System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");     
        eleQue.forEach(forname -> {System.out.println(forname);});
        
        System.out.println("\n=== Iterating over a Queue using iterator() ===");
        Iterator<String> eleQueItr = eleQue.iterator();
        while (eleQueItr.hasNext()) {
        	String itrname = eleQueItr.next();
        	System.out.println(itrname);
        }
       
        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for (String feEle :eleQue ) {
        	System.out.println(feEle);
        }
        
        System.out.println("\n=== Iterating over a Queue using iterator() and Java 8 forEachRemaining() ===");
        eleQueItr = eleQue.iterator();
        eleQueItr.forEachRemaining(itrname->{System.out.println(itrname);} );
        
        
	}

}
