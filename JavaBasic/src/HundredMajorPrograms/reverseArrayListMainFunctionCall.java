package HundredMajorPrograms;

import java.util.ArrayList;

public class reverseArrayListMainFunctionCall extends reverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("go");
		al.add("corona");
		al.add("go");
		al.add("go away");
		System.out.println(al);
		reverseArrayList ral = new reverseArrayList();
		ral.reverseArrayList(al);
		//System.out.println(ral.reverseAl);
          
	}

}
