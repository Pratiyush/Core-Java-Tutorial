package demo09.aboutconstructor.one;

class ExplicitDefaultConstructor {
	int j;
	ExplicitDefaultConstructor() {
		j=1;
	}
	void display() {
		System.out.println("display method invoked from class ExplicitDefaultConstructor, j=" + j);
	}
}

public class DemoExplicitDefaultConstructor {
	
	static void demoExplicitDefaultConstructor() {
		ExplicitDefaultConstructor edc = new ExplicitDefaultConstructor();
		edc.display();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of explicit default constructor.");
		
		demoExplicitDefaultConstructor();
	}
}
