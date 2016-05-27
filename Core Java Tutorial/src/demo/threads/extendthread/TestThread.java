package demo.threads.extendthread;

class MyThread extends Thread {
	MyThread(String name) {
		super (name);
	}
	
	public void run()
	{
		System.out.println("Inside MyThread => " + Thread.currentThread().getName());
	}
}

public class TestThread 
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread("t1");
		MyThread t2 = new MyThread("t2");
		MyThread t3 = new MyThread("t3");
		MyThread t4 = new MyThread("t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}