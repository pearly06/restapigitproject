package multiThreadPackage;
public class threadDemo3{
	public static void main(String[] args){
		/*
		 * Runnable obj3 = new Runnable() { public void run(){ for(int i=1;i<=5;i++) {
		 * System.out.println("Hi"); try {Thread.sleep(1000);}catch(Exception e) {
		 * 
		 * } }
		 * 
		 * } Runnable obj4 = ()-> {
		 * 
		 * for(int i=1;i<=5;i++) { System.out.println("Hello"); try
		 * {Thread.sleep(1000);}catch(Exception e) {} } };
		 * 
		 */
		Thread t1 = new Thread(()->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);}catch(Exception e1) {
					
				}
			}
		
	});
		Thread t2 = new Thread(()->
		{
			for(int i=1;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e11) {
					
				}
			}
		
	});
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {
			
		}
		
		t2.start();	
				
		
				
        }
		}