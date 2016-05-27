package demo01.aboutclass.one;

public class TopLevelClassPublicModifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the access modifier for the top level class.");
		System.out.println("Only public and default access modifiers are allowed for top level class.");
		System.out.println("Other than that abstract and final are allowed.");
	}

}

//default access modifier allowed for a top level class
class TopLevelClassDefaultModifier {
}


// protected access modifier not allowed for a top level class
//Illegal modifier for the class Class4; only public, abstract & final are permitted
protected class Class4 {
}

//private access modifier not allowed for a top level class
//Illegal modifier for the class Class5; only public, abstract & final are permitted
private class Class5 {
}


// abstract modifier allowed
abstract class Class6 {
}

//final modifier allowed
final class Class7 {}

