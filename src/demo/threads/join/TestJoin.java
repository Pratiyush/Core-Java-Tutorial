package demo.threads.join;

class MyRunnable implements Runnable {
	Thread pt = null;
	MyRunnable(Thread t)
	{
		pt = t;
	}
	
	public void run() {
		System.out.println("\tThread " + Thread.currentThread().getName() + " running ....");
		System.out.println("\tGoing to sleep for 5 seconds...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
	}
}

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		MyRunnable r = new MyRunnable(t);
		Thread t1 = new Thread(r, "t1");
		t1.start();
		System.out.println("Main thread is waiting for thread t1 to complete...");
		t1.join();
		System.out.println("Main thread says Thread t1 completed");
	}
}
