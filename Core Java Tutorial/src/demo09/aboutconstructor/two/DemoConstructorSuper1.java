package demo09.aboutconstructor.two;

class Base1 {
	Base1() {
		System.out.print("\nDefault Constructor Base1 invoked...");
	}
}
class Derived1 extends Base1 {
	Derived1() {
		System.out.print("\nDefault Constructor Derived1 invoked...");
	}
}

public class DemoConstructorSuper1 {
	
	static void demoSuper1() {
		Derived1 d1 = new Derived1();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of constructor in base class derived class.");
		
		System.out.print("\nDemo of implicit super() invoked by default constructor of Derived class...");
		demoSuper1();
	}
}
