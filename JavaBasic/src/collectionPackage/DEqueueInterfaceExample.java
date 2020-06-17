package collectionPackage;

import java.util.ArrayDeque;
import java.util.Deque;


class Book{
	int id;
	String name,author;
	int quantity;
	
	public Book(int id,String name , String author,int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.quantity = quantity;
	}
}

public class DEqueueInterfaceExample {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("salt");
		dq.add("sugar");
		dq.add("water");
		dq.add("lemon");
		for(String str: dq) {
			System.out.println(str);
		}
		System.out.println(dq);
		//using offerFirst ,AddFirst,AddLast,OfferLast
		
		dq.addFirst("Honey");
		dq.addLast("glass");
		dq.offerFirst("chat Masala");
		dq.offerLast("ice");
		System.out.println(dq);
		
		//using pollfirst , polllast,RemoveFirst,RemoveLast
		
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);
		dq.removeLast();
		System.out.println(dq);
		
		Deque<Book> bookDq = new ArrayDeque<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", 5);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", 6);
		Book b3 = new Book(103, "Operating System", "Galvin", 7);
		// Adding Books to Deque
		bookDq.add(b1);
		bookDq.add(b2);
		bookDq.add(b3);
		bookDq.add(b2);
		
		System.out.println(bookDq);
		
		// Traversing ArrayDeque
		
		for(Book abc : bookDq ) {
			System.out.println(abc.id + " " + abc.name + " " + abc.author + " "+ abc.quantity);
		}
		
		

	}

}
