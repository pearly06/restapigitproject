package twentyTwentyPrograms.linkedlist;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
//import twentyTwentyPrograms.linkedlist.reverseLinkedlistInPairs;

public class mainProgramlinkedlist {
	//if linked list is = 5,6,7,1,2,8
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		LinkedList<String> ls = new LinkedList<>();
		ls.add("5");
		ls.add("6");
		ls.add("7");
		ls.add("1");
		ls.add("2");
		ls.add("8");
		//To call the private method
		Class rlp = Class.forName("reverseLinkedlistInPairs");
		Object ob = rlp.newInstance();
		Method mt = rlp.getDeclaredMethod("iterativeReverseLinkedlistInPairs", new Class[] {LinkedList.class});
		mt.setAccessible(true);
		mt.invoke(ob,ls);
		//reverseLinkedlistInPairs rlp = new reverseLinkedlistInPairs();
		
		
	}

}
