package demo11.aboutabstractinterfacefinal.one;

abstract class Abstract1 {
	abstract void method1();
}

abstract class Abstract2 {
	abstract void method1();
	void method2() { System.out.println("Abstract class can contain non-abstract methods also"); }
}

abstract class BaseAbstract3 {
	abstract void method1();
	abstract void method2();
}
class DerivedAbstract3 extends BaseAbstract3 {
	void method1() { }
	void method2() { }
}

class BaseNonAbstract4 {
	void method1() { System.out.println("A non abstract base class"); }
}
abstract class DerivedAbstract4 extends BaseNonAbstract4 {
	abstract void method2();
}


public class DemoAbstract {
	
	static void demoAbstract1() {
		Abstract1 a1 = new Abstract1();
	}

	static void demoAbstract2() {
		Abstract2 a2 = new Abstract2();
	}
	
	static void demoAbstract3() {
		DerivedAbstract3 d3 = new DerivedAbstract3();
	}

	static void demoAbstract4() {
		DerivedAbstract4 d4 = new DerivedAbstract4();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("\nDemo of abstract class having abstract methods ...");
		demoAbstract1();
		
		System.out.print("\nDemo of abstract class having abstract methods as well as non-abstract methods ...");
		demoAbstract2();
		
		System.out.print("\nDemo of a derived class extending from an abstract base class ...");
		demoAbstract3();
		
		System.out.print("\nDemo of a abstract derived class extending from a non-abstract base class ...");
		demoAbstract4();
	}
}
