package demo09.aboutconstructor.two;

class Base2 {
	Base2() {
		System.out.print("\nDefault Constructor Base2 invoked...");
	}
}
class Derived2 extends Base2 {
	Derived2(int i) {
		System.out.print("\nint Constructor Derived2 invoked...");
	}
}

public class DemoConstructorSuper2 {
	
	static void demoSuper2() {
		Derived2 d2 = new Derived2(1);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of constructor in base class derived class.");
		
		System.out.print("\n\nDemo of implicit super() invoked by non-default constructor of Derived class...");
		demoSuper2();
	}
}
