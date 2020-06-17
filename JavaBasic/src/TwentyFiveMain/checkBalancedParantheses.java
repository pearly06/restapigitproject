package TwentyFiveMain;

import java.util.HashMap;
import java.util.Map;

public class checkBalancedParantheses {

	public static void main(String[] args) {
		String str1 = "<{[(}]>";
		String str2 = "<{[()}]>";
		String str3 = "I am [very] {fo";
		balancedParantheses bp1 = balancedParantheses.getObject();
		bp1.balancedOrNot(str1);
		balancedParantheses bp2 = balancedParantheses.getObject();
		bp2.balancedOrNot(str2);
		bp2.balancedOrNot(str3);
	}

}
class balancedParantheses{
	private static String str;
	private static balancedParantheses obj = new balancedParantheses(str);
	//private constructor is used so that allows you to create a class that can't be instantiated from outside the class: the outside world can't do this:
	private balancedParantheses(String str) {
		this.str = str;
		
	}
	public static balancedParantheses getObject() {
		//balancedParantheses balancedParantheses = null;
		return obj;
	}
	boolean balancedOrNot(String str) {
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			}else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
		hm.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
        
		/*
		 * hm.forEach((k,v)->{ if(v/2==0) {int flag =0;} else {int flag =1;} });
		 */
		/*
		 * for(Map.Entry<Character , Integer> entry: hm.entrySet()) {
		 * if(entry.getValue() ==0) { flag_even =1; }else { flag_odd =1; } }
		 */
		int flag=0;
		//{
		if(hm.containsKey('{')||hm.containsKey('}')) {
        if(hm.containsKey('{')&&hm.containsKey('}')) {
        	 if((hm.get('{') == hm.get('}'))){
        		 
        	 }else {
        		 flag++;
        	 }
        }else {
        	flag++;
        }
		}
		
		
        //]
		if(hm.containsKey('[')||hm.containsKey(']')) {
        if(hm.containsKey('[')&&hm.containsKey(']')) {
       	 if((hm.get('[') == hm.get('['))){
       		 
       	 }else {
       		 flag++;
       	 }
       }else {
       	flag++;
       }
		} 
        
		
		//)
		if(hm.containsKey('(')||hm.containsKey(')')) {
        if(hm.containsKey('(')&&hm.containsKey(')')) {
       	 if((hm.get('(') == hm.get(')'))){
       		 
       	 }else {
       		 flag++;
       	 }
       }else {
       	flag++;
       }
		} 
        
		
		//<
		if(hm.containsKey('<')||hm.containsKey('>')) {
        if(hm.containsKey('<')&&hm.containsKey('>')) {
       	 if((hm.get('<') == hm.get('>'))){
       		 
       	 }else {
       		 flag++;
       	 }
       }else {
       	flag++;
       }
		}
      
		
		System.out.println(flag);
        
        if(flag==0) {
        	System.out.println("true");
        	return true;
        }else {
        	System.out.println("false");
        	return false;
        }
        
        

        
        
        
        
        
        
        
        
        
		
		
	}
}