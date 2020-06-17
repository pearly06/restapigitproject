package TwentyFiveMain;

 class rough1{
	public void swap() {
		System.out.println("rough1");
	}
}
 
 class rough2 extends rough1{
		public void swap() {
			System.out.println("rough2");
		}
	}
 class rough3 extends rough1{
		public void swap() {
			System.out.println("rough3");
		}
	}

public class rough {

	public static void main(String[] args) {
		rough1 rg = new rough2();
		
		rg.swap();
				
		
	}

}
