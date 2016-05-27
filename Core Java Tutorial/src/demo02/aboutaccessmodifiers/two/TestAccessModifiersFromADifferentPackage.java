package demo02.aboutaccessmodifiers.two;

import demo02.aboutaccessmodifiers.one.*;

public class TestAccessModifiersFromADifferentPackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the characteristics of various access modifiers.");
		System.out.println("Access is done from an object in a DIFFERENT package.");
		testPublicModifierFromADifferentPackage();
		testProtectedModifierFromADifferentPackage();
		testDefaultModifierFromADifferentPackage();
		testPrivateModifierFromADifferentPackage();
		
	}
	
	static void testPublicModifierFromADifferentPackage() {
		// Able to instantiate PublicModifer from a different package because it is a top level class with public class modifier. 
		PublicModifier pm = new PublicModifier();

		// Able to access pm.fieldPublic because the access modifier is public
		System.out.println("Accessing public field of an object in a different package is ALLOWED, value = " + pm.fieldPublic);
		
		// Able to access pm.methodPublic because the access modifier is public
		System.out.println("Accessing public method  of an object in a different package is ALLOWED ... ");
		pm.methodPublic();
	}

	static void testProtectedModifierFromADifferentPackage() {
		// Able to instantiate ProtectedModifer from a different package because it is a top level class with public class modifier. 
		ProtectedModifier pm = new ProtectedModifier();

		// Unable to access pm.fieldProtected because the access modifier is protected
		System.out.println("Accessing protected field of an object in a different package is NOT ALLOWED." + pm.fieldProtected);
		
		// Unable to access pm.methodProtected because the access modifier is protected
		// The method methodProtected() from the type ProtectedModifier is not visible
		System.out.println("Accessing protected method  of an object in a different package is NOT ALLOWED ... ");
		pm.methodProtected();
	}

	static void testDefaultModifierFromADifferentPackage() {
		// Able to instantiate DefaultModifer from a different package because it is a top level class with public class modifier. 
		DefaultModifier pm = new DefaultModifier();

		// Unable to access pm.fieldDefaultModifier because the access modifier is default
		System.out.println("Accessing default field of an object in a different package is NOT ALLOWED." + pm.fieldDefaultModifier);
		
		// Unable to access pm.methodDefaultModifier because the access modifier is default
		System.out.println("Accessing default method  of an object in a different package is NOT ALLOWED ... ");
		pm.methodDefaultModifier();
	}
	
	static void testPrivateModifierFromADifferentPackage() {
		// Able to instantiate PrivateModifer from a different package because it is a top level class with public class modifier. 
		PrivateModifier pm = new PrivateModifier();

		// Unable to access pm.fieldPrivate because the access modifier is private
		System.out.println("Accessing private field of an object in a different package is NOT ALLOWED." + pm.fieldPrivate);
		
		// Unable to access pm.methodPrivate because the access modifier is private
		System.out.println("Accessing private method  of an object in a different package is NOT ALLOWED ... ");
		pm.methodPrivate();
	}

}
