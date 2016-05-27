package demo02.aboutaccessmodifiers.one;

public class TestAccessModifiersFromSamePackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the characteristics of various access modifiers.");
		System.out.println("Access is done from an object in the SAME package.");
		testPublicModifierFromSamePackage();
		testProtectedModifierFromSamePackage();
		testDefaultModifierFromSamePackage();
		testPrivateModifierFromSamePackage();
		
	}
	
	static void testPublicModifierFromSamePackage() {
		// Instantiating PublicModifer object. 
		PublicModifier pm = new PublicModifier();

		// Able to access pm.fieldPublic because the access modifier is public
		System.out.println("Accessing public field of an object in the same package is ALLOWED, value = " + pm.fieldPublic);
		
		// Able to access pm.methodPublic because the access modifier is public
		System.out.println("Accessing public method  of an object in the same package is ALLOWED ... ");
		pm.methodPublic();
	}

	static void testProtectedModifierFromSamePackage() {
		// Instantiating ProtectedModifer object. 
		ProtectedModifier pm = new ProtectedModifier();

		// Unable to access pm.fieldProtected because the access modifier is protected
		System.out.println("Accessing protected field of an object in the same package is ALLOWED, value = " + pm.fieldProtected);
		
		// Unable to access pm.methodProtected because the access modifier is protected
		System.out.println("Accessing protected method  of an object in the same package is ALLOWED ... ");
		pm.methodProtected();
	}

	static void testDefaultModifierFromSamePackage() {
		// Instantiating DefaultModifer object. 
		DefaultModifier pm = new DefaultModifier();

		// Unable to access pm.fieldDefaultModifier because the access modifier is default
		System.out.println("Accessing default field of an object in the same package is ALLOWED, value = " + pm.fieldDefaultModifier);
		
		// Unable to access pm.methodDefaultModifier because the access modifier is default
		System.out.println("Accessing default method  of an object in a different package is ALLOWED ... ");
		pm.methodDefaultModifier();
	}
	
	static void testPrivateModifierFromSamePackage() {
		// Instantiating PrivateModifer object. 
		PrivateModifier pm = new PrivateModifier();

		// Unable to access pm.fieldPrivate because the access modifier is private
		System.out.println("Accessing private field of an object in a different package is NOT ALLOWED." + pm.fieldPrivate);
		
		// Unable to access pm.methodPrivate because the access modifier is private
		System.out.println("Accessing private method  of an object in a different package is NOT ALLOWED ... ");
		pm.methodPrivate();
	}

}
