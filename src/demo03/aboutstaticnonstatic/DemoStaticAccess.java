package demo03.aboutstaticnonstatic;

public class DemoStaticAccess {
	
	static int fieldStatic=10;
	
	int fieldNonStatic=20;
	
	static void methodStatic() 
	{
		System.out.println("Accessing Static Method 'methodStatic' ...");
	}
	
	void methodNonStatic() 
	{
		System.out.println("Accessing Non Static Method 'methodNonStatic' ...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of static fields and methods.");

		demoStaticFieldAccessFromStaticMethod();
		demoStaticMethodAccessFromStaticMethod();
		
		DemoStaticAccess dsa = new DemoStaticAccess();
		dsa.demoStaticFieldAccessFromInstanceMethod();
		dsa.demoStaticMethodAccessFromInstanceMethod();
	}
	
	static void demoStaticFieldAccessFromStaticMethod() {
				// Demo of access of Static fields - in different ways		
				System.out.println("Static field can be accessed from a static method [ implicitly ], fieldStatic=" + fieldStatic);

				System.out.println("Static field can be accessed from a static method [ through the class ], DemoStaticAccess.fieldStatic=" + DemoStaticAccess.fieldStatic);
				
				DemoStaticAccess dsa = new DemoStaticAccess();
				//But The static field DemoStaticAccess.fieldStatic should be accessed in a static way
				System.out.println("Static field can ALSO be accessed from a static method [ through the instance object ], dsa.fieldStatic=" + dsa.fieldStatic);
	}
	
	static void demoStaticMethodAccessFromStaticMethod() {
				// Demo of access of Static methods - in different ways		
				System.out.print("\n\nStatic method can be invoked from a static method [ implicitly ], invoking 'methodStatic()' -> ");
				methodStatic();

				System.out.print("Static method can be invoked from a static method [ through the class ], invoking 'DemoStaticAccess.methodStatic()' -> ");
				DemoStaticAccess.methodStatic();
				 
				DemoStaticAccess dsa = new DemoStaticAccess();
				System.out.print("Static method can ALSO be invoked from a static method [ through the instance object ], invoking 'dsa.methodStatic(()' -> " );
				//But The static method methodStatic() from the type DemoStaticAccess should be accessed in a static way
				dsa.methodStatic();
	}
	
	void demoStaticFieldAccessFromInstanceMethod() {
				// Demo of access of Static fields - in different ways		
				System.out.println("\n\nStatic field can be accessed from a instance method, fieldStatic=" + fieldStatic);
	}
	
	void demoStaticMethodAccessFromInstanceMethod() {
				// Demo of access of Static methods - in different ways		
				System.out.print("Static method can be invoked from a instance method, invoking 'methodStatic()' -> ");
				methodStatic();
	}

}