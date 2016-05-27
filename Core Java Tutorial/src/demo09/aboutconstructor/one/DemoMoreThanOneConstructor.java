package demo09.aboutconstructor.one;

class MoreThanOneConstructor {
	int m;
	MoreThanOneConstructor() {
		m = 5;
	}
	MoreThanOneConstructor(int value) {
		m = value;
	}
	void display() {
		System.out.println("display method invoked from class MoreThanOneConstructor, m=" + m);
	}
}

public class DemoMoreThanOneConstructor {
	
	static void demoMoreThanOneConstructor() {
		MoreThanOneConstructor moc1 = new MoreThanOneConstructor();
		moc1.display();
		
		MoreThanOneConstructor moc2 = new MoreThanOneConstructor(10);
		moc2.display();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of more than one constructor.");
		
		demoMoreThanOneConstructor();
	}
}
