package Rough_Basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ChildRough extends ParentRough {
	
	ChildRough(){
		System.out.println("Child default Constructor");
	}

  void A_method() {
		System.out.println("Parent method define here");
	}
  
 // String st = "childmethod";
  String B_method(String st) {
	 // st = "childmethod";
	  System.out.println(st);
		return st;
	}
  
  public static void main (String[]args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	 // System.out.println(args[2]);//will give run time exception ArrayIndexOutOfBoundsException
	  ChildRough ch = new ChildRough();
	  ch.A_method();
	  String st = "childmethodpublicmethod";
	  ch.B_method(st);
	  ///////
	  //using reflection we can use private method of parent class java.lang.reflect package
	  Method m = ParentRough.class.getDeclaredMethod("C_method");
	  m.setAccessible(true);//bypasses the private modifier
	  m.invoke(new ParentRough());
	// System.out.println(m.invoke(new ParentRough()));
	  ////////
  }

  
	
}

