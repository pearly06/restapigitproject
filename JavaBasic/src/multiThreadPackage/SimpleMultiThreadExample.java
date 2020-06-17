package multiThreadPackage;

public class SimpleMultiThreadExample extends Thread{
	public void run() {
		System.out.println("My thread is in running state.");
	}

	public static void main(String[] args) {
		SimpleMultiThreadExample obj = new SimpleMultiThreadExample();
        obj.start();
	}

}
