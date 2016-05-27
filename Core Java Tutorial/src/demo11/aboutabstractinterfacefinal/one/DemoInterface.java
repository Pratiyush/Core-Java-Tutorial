package demo11.aboutabstractinterfacefinal.one;

interface Interface1 {
	int i=10;
	final int j=11;
	public final int k=12;
	public static final int l=13;
	
	void method1();
	public void method2();
	abstract void method3();
//	protected void method4();
//  private void method5();	
}
interface Interface2 {
	void anotherMethod1();
}
interface Interface3 extends Interface1 {
}

class Class1 implements Interface1, Interface2 {
	public void method1() { }
	public void method2() { }
	public void method3() { }
	public void anotherMethod1() { }
}

public class DemoInterface {
	
	static void demoInterface1() {
		Class1 c1 = new Class1();
		//c1.i=20;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("\nDemo of interface ...");
		demoInterface1();
		
	}
}
