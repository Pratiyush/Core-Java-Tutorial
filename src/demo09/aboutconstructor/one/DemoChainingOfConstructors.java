package demo09.aboutconstructor.one;

class ChainingOfConstructors {
	int n;
	ChainingOfConstructors() {
		this(15);
		System.out.println("Test it");
	}
	ChainingOfConstructors(int value) {
		System.out.printf("Value %d set by chaining constuctor\n", value);
		n = value;
	}
	void display() {
		System.out.println("display method invoked from class ChainingOfConstructors, n=" + n);
	}
}

public class DemoChainingOfConstructors {
	
	static void demoChainingOfConstructors() {
		ChainingOfConstructors coc1 = new ChainingOfConstructors();
		coc1.display();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of chaining of constructors.");
		
		demoChainingOfConstructors();
	}
}
