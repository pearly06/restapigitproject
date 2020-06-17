package collectionPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedListUsingObject {
	
	

	public static void main(String[] args) {
		
		List<customer> listOfCustomer = new LinkedList<>();
		listOfCustomer.add(new customer(100,"Ramesh"));
		listOfCustomer.add(new customer(101, "A"));
		  listOfCustomer.add(new customer(102, "B"));
		  listOfCustomer.add(new customer(103, "C"));
		  
		  //using for each iterator
		  listOfCustomer.forEach(Customer->{
			  System.out.print(Customer.getID());
			   System.out.println(Customer.getname());
		  });
		
		   //using iterator
		  Iterator<customer> custitr = listOfCustomer.iterator();
		  while(custitr.hasNext()) {
			  customer Custom = custitr.next();
			  System.out.print(Custom.getID());
			  System.out.println(Custom.getname());
		  }
		
	}

}
