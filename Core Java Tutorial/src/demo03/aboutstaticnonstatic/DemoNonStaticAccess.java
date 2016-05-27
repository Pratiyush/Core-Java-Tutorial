package demo03.aboutstaticnonstatic;

public class DemoNonStaticAccess {

	static int fieldStatic = 10;

	int fieldNonStatic = 20;

	static void methodStatic() {
		System.out.println("Accessing Static Method 'methodStatic' ...");
	}

	void methodNonStatic() {
		System.out.println("Accessing Non Static Method 'methodNonStatic' ...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of non-static (also known as instance) fields and methods.");

		DemoNonStaticAccess dnsa = new DemoNonStaticAccess();
		dnsa.demoNonStaticFieldAccessFromNonStaticMethod();
		dnsa.demoNonStaticMethodAccessFromNonStaticMethod();

		demoNonStaticFieldAccessFromStaticMethod();
		demoNonStaticMethodAccessFromStaticMethod();
	}

	void demoNonStaticFieldAccessFromNonStaticMethod() {
		// Demo of access of Non-Static fields from Instance method - in different ways
		System.out.println("Non-Static field can be accessed from a Non-Static method [ implicitly ], fieldNonStatic=" + fieldNonStatic);

		System.out.println("Non-Static field can also be accessed from a Non-Static method [ through this pointer ], this.fieldNonStatic="+ this.fieldNonStatic);
		//Static method call
		methodStatic();
	}

	void demoNonStaticMethodAccessFromNonStaticMethod() {
		// Demo of access of Non-Static methods from Instance method - in different ways
		System.out.print("\n\nNon-Static method can be invoked from a Non-static method [ implicitly ], invoking 'methodNonStatic()' -> ");
		methodNonStatic();

		System.out.print("Non-Static method can be invoked from a Non-static method [ through this pointer ], invoking 'this.methodNonStatic()' -> ");
		this.methodNonStatic();
		
		//Static method call
		methodStatic();
	}

	static void demoNonStaticFieldAccessFromStaticMethod() {
		// Demo of access of Non-Static fields from Static method - in different ways
		System.out.println("\n\nNon-Static field CANNOT be accessed from a static method, fieldNonStatic="+ fieldNonStatic);
		
		//Static method call
		methodStatic();
	}

	static void demoNonStaticMethodAccessFromStaticMethod() {
		// Demo of access of Non-Static methods from Static method - in different ways
		System.out.print("Non-Static method CANNOT be invoked from a static method, invoking 'methodNonStatic()' -> ");
		methodNonStatic();
		
		//Static method call
		methodStatic();
	}
}
