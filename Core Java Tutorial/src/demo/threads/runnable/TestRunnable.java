package demo.threads.runnable;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Inside MyRunnable => " + Thread.currentThread().getName());
	}
}

public class TestRunnable {
	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(r, "t1");
		Thread t2 = new Thread(r, "t2");
		Thread t3 = new Thread(r, "t3");
		Thread t4 = new Thread(r, "t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
