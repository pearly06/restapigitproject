package multiThreadPackage;

public class ThreadTwiceExampleNotPossible implements Runnable {

	public static void main(String[] args) {
               Thread th1 = new Thread(new ThreadTwiceExampleNotPossible(),"th1");
               th1.start();
               th1.start();
               
		/*
		 * As you observe the first call to start() resulted in execution of run()
		 * method, however the exception got thrown when we tried to call the start()
		 * second time.
		 */

	}

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+ " is executing");
		
	}

}
