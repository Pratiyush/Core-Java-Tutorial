package demo02.aboutaccessmodifiers.two;

import demo02.aboutaccessmodifiers.one.*;

public class TestAccessModifiersFromADifferentPackageButASubClass extends ProtectedModifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the characteristics of protected access modifiers from a subclass.");
		testProtectedModifierFromADifferentPackageButASubClass();
		
	}
	
	static void testProtectedModifierFromADifferentPackageButASubClass() {
		// Able to instantiate ProtectedModifer from a different package because it is a top level class with public class modifier. 
		TestAccessModifiersFromADifferentPackageButASubClass tpm = new TestAccessModifiersFromADifferentPackageButASubClass();

		// Able to access tpm.fieldProtected because the access modifier is protected
		System.out.println("Accessing protected field of an object in a different package is ALLOWED." + tpm.fieldProtected);
		
		// Able to access tpm.methodProtected because the access modifier is protected
		System.out.println("Accessing protected method  of an object in a different package is ALLOWED ... ");
		tpm.methodProtected();
	}
}

class TestDefaultAccessModifiersFromADifferentPackageButASubClass extends DefaultModifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the characteristics of default access modifiers from a subclass.");
		testDefaultModifierFromADifferentPackageButASubClass();
		
	}
	
	static void testDefaultModifierFromADifferentPackageButASubClass() {
		// Able to instantiate DefaultModifer from a different package because it is a top level class with public class modifier. 
		TestDefaultAccessModifiersFromADifferentPackageButASubClass tdm = new TestDefaultAccessModifiersFromADifferentPackageButASubClass();

		// Unable to access tdm.fieldDefaultModifier because the access modifier is default
		System.out.println("Accessing default field of an object in a different package is NOT ALLOWED." + tdm.fieldDefaultModifier);
		
		// Unable to access tdm.methodProtected because the access modifier is protected
		System.out.println("Accessing default method of an object in a different package is NOT ALLOWED ... ");
		tdm.methodDefaultModifier();
	}
}
