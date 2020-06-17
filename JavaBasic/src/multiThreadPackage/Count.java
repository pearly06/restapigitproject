package multiThreadPackage;

public class Count extends Thread {
	//creating constructor 
   Count(){
	   super("myExtendingthread");
	   System.out.println("my thread created" + this);
	   start();
   }
   public void run() {
	   try {
		   for(int i=0;i<10;i++) {
			   System.out.println("Printing the count " + i);
			   Thread.sleep(1000);
		   }
	   }catch(InterruptedException ex) {
		   System.out.println("my thread interrupted");
	   }
	   System.out.println("My thread run is over" );
   }

}
