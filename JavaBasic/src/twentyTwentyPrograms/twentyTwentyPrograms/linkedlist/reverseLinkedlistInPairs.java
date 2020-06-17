package twentyTwentyPrograms.linkedlist;

import java.util.LinkedList;

//if linked list is = 5,6,7,1,2,8
//reverse linkedlist = 6,5,1,7,8,2
//it can be done by 2 ways = iterative,recursive

public class reverseLinkedlistInPairs{
	static LinkedList<String> reverselist = new LinkedList<>();
	
	
	private static void iterativeReverseLinkedlistInPairs(LinkedList<String> input) {
		int j = 0;
		while(j<=input.size()) {
			for(int i=j;i<=j+1;i++) {
				String[] roughArr = new String[2];
				roughArr[0] = input.get(i);
				roughArr[1] = input.get(i+1);
				j=j+1;
				
				reverselist.add(roughArr[0]);
				reverselist.add(roughArr[1]);
				
				
				}
			
		}
		
		System.out.println(reverselist);
	}
	
	
	
	

}
