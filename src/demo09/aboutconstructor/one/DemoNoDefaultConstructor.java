package demo09.aboutconstructor.one;

class NoDefaultConstructor {
	int k;
	
	NoDefaultConstructor(int value) {
		k = value;
	}
	void display() {
		System.out.println("display method invoked from class NoDefaultConstructor, k=" + k);
	}
}

public class DemoNoDefaultConstructor {
	
	static void demoNoDefaultConstructor() {
		//The constructor NoDefaultConstructor() is undefined
		//NoDefaultConstructor ndc1 = new NoDefaultConstructor();
		NoDefaultConstructor ndc2 = new NoDefaultConstructor(2);
		ndc2.display();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of no default constructor.");
		
		demoNoDefaultConstructor();
	}
}
