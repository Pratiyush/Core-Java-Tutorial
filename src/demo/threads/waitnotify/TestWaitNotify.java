package demo.threads.waitnotify;

class Counter {
	int value;
	boolean valueSet=false;
	
	Counter(int counterValue) {
		value = counterValue; 
	}
	
	synchronized int readCounter()  throws InterruptedException 
	{
		while (!valueSet) {
			wait();
		}
		doSomething(); // Do something to simulate some activity which takes some time.
		System.out.println("Read counter, value = " + value);
		valueSet = false; // Change the state so that the IncrementThread can again increment the value
		notify();
		return value;
	}
	
	synchronized void incrementCounter() throws InterruptedException
	{
		while (valueSet) {
			wait();
		}
		doSomething(); // Do something to simulate some activity which takes some time.
		value++; // Change the state so that the ReadThread can know that a new value has been set
		System.out.println("Incremented counter, value = " + value);
		valueSet = true;
		notify();
	}

	void doSomething() {
		for (int i=0; i<1000000000; i++);
	}
	
}

class IncrementThread extends Thread {
	Counter counterRef;
	IncrementThread(Counter c)
	{
		counterRef = c;
	}
	
	public void run() {
		try {
			while (true)
			{
				counterRef.incrementCounter();
			}
		}
		catch (InterruptedException ie) {
		}
	}
}

class ReadThread extends Thread {
	Counter counterRef;
	ReadThread(Counter c)
	{
		counterRef = c;
	}
	
	public void run() {
		try {
			while (true)
			{
				counterRef.readCounter();
			}
		}
		catch (InterruptedException ie) {
		}
	}
}

public class TestWaitNotify {
	public static void main(String[] args) {
		Counter c = new Counter(100);
		IncrementThread it = new IncrementThread(c);
		ReadThread rt = new ReadThread(c); 
		it.start();
		rt.start();
	}
}
