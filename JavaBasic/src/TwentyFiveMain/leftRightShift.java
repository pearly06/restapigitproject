package TwentyFiveMain;

public class leftRightShift {

	public static void main(String[] args) {
		String str1 = "qwertyu";
		//Left rotation : "ertyuqw"
	         //Right rotation : "yuqwert"
		String str2 = "abcd";
		//leftShift : dabc
	     //   rightShift : cdab
		String str3 = "GeeksforGeeks";
		//Left Rotation  : "eksforGeeksGe" 
	         //Right Rotation : "ksGeeksforGee"
		leftRightShift lrs = new leftRightShift();
		lrs.leftRightShift(str1 ,2,2);
		lrs.leftRightShift(str2, 3, 2);
		lrs.leftRightShift(str3, 2, 2);
	}
	
	void leftRightShift(String s , int l , int r) {
		System.out.println(s.substring(l));
		System.out.println(s.substring(0,l));
		String leftshift = s.substring(l)+s.substring(0,l);
		System.out.println("after leftShift : "+leftshift);
		
		String rightshift = s.substring(s.length()-r)+s.substring(0, s.length()-r);
		System.out.println("after rightShift : "+rightshift);
		
		
		String leftrightshift = leftshift.substring(leftshift.length()-r)+leftshift.substring(0,leftshift.length()-r);
		System.out.println("after left +right on the same string :" +leftrightshift);
		
		
	}

}
