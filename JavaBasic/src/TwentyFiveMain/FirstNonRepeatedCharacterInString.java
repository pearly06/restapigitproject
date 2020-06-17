package TwentyFiveMain;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String ns = "ABCDBC" ;
		frstRepeated(ns);
		

	}
	
	static char frstRepeated(String str) {
		int len = str.length();
		char ch = 0;
		boolean t = false;
		for(int i =0;i<len;i++) {
			if(t == false) {
			int j = i+1;
			
			while (j<len) {
				
			//for(int j=1;j<=len-1;j++) {
			
				if(str.charAt(i)== str.charAt(j)) {
					ch = str.charAt(i);
					t= true;
					System.out.println("the first repeating character is " +ch);
					break;
				}else {
					j++;
				}
			}
			}else {
				break;
			}
			}
		
		
		return ch;
		
	}

}
