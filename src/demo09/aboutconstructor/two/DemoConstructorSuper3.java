package demo09.aboutconstructor.two;

class Base3 {
	Base3(int i) {
		System.out.print("\nint Constructor Base2 invoked...");
	}
}
class Derived3 extends Base3 {
	Derived3(int i) {
		System.out.println("\nint Constructor Derived3 invoked...");
	}
}

public class DemoConstructorSuper3 {
	
	static void demoSuper3() {
		Derived3 d3 = new Derived3(2);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of constructor in base class derived class.");
		
		System.out.print("\n\nDemo of the problem which occurs when there is no default constructor in the Base class...");
		demoSuper3();
	}
}
