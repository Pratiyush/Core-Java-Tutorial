package demo.threads.state;

class MyRunnable implements Runnable {
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("t3")) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class TestThreadStates {
	public static void main(String[] args) throws InterruptedException
	{
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r, "t1");
		System.out.println("State of t1 => " + t1.getState().name());
		
		Thread t2 = new Thread(r, "t2");
		t2.start();
		System.out.println("State of t2 => " + t2.getState().name());
		
		Thread t3 = new Thread(r, "t3");
		t3.start();
		t3.join(500);
		System.out.println("State of t3 => " + t3.getState().name());
		
		Thread t4 = new Thread(r, "t4");
		t4.start();
		t4.join();
		System.out.println("State of t4 => " + t4.getState().name());
	}
}
