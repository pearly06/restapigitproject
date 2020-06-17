package Rough_Basic;

public class child extends Parent {
	
	public static String childContent = "child variable1" ;
	public String parentAnoContent = "child variable2" ;
	public String childAnoContent = "child variable3" ;
	
	public void ParentMethod() {
		System.out.println("this is child class : " +childContent);
	}
	public String ParentAnoMethod() {
		System.out.println("this is child class : " +childAnoContent);
		 
		return childAnoContent;
		
	}
	
	public void childMethod() {
		System.out.println("this is child class : " +parentAnoContent);
	}
	


}
