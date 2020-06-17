package multiThreadPackage;

public class ThreadCreationByImplementingRunnableInterfaceSimpleProg implements Runnable{

	public static void main(String[] args) {
		ThreadCreationByImplementingRunnableInterfaceSimpleProg simpleprog = new ThreadCreationByImplementingRunnableInterfaceSimpleProg();
		System.out.println(simpleprog.getClass());
		Thread tobj = new Thread(simpleprog);
         tobj.start();
	}

	@Override
	public void run() {
		System.out.println("My thread is in running state.");  
		
	}

}
