package mathameticalProgram;

public class palindrome {
	protected int i;
	 protected palindrome(int i){
		this.i = i;
	}
	
	
	

	protected static boolean  palindromeDecision(int i) {
		int rev = 0,temp ;
		int act = i;
		while(i>0) {
		temp = i%10;
		i= i/10;
		rev = rev*10+temp;
		
		}
		if(rev==act) {
			return true;
		}else {
			return false;
		}
		
		
		
	}
}
