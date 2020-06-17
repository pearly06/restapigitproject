package Rough_Basic;

public class ParentRough {
	
	ParentRough(){
		System.out.println("Parent default Constructor");
	}
	
	ParentRough(String str){
		System.out.println("Parent non default Constructor: "+str );
	}
	
	void A_method() {
		
	}
	
	String B_method(String str) {
		return str;
	}
	private void C_method() {
		System.out.println("click on C_method of parent");
	}

}
