package demo09.aboutconstructor.one;

class ImplicitDefaultConstructor {
	int i;
	void display() {
		System.out.println("display method invoked from class ImplicitDefaultConstructor, i=" + i);
	}
}

public class DemoImplicitDefaultConstructor {
	
	static void demoImplicitDefaultConstructor() {
		ImplicitDefaultConstructor idc = new ImplicitDefaultConstructor();
		idc.display();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of implicit default constructor.");
		
		demoImplicitDefaultConstructor();
	}
}
