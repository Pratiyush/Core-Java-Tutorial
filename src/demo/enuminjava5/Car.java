package demo.enuminjava5;

public class Car {
	public static enum Model {ALTO, ZEN, SWIFT, SX4};
	public static enum Color {RED, GREY, WHITE};

	private final Model model;
	private final Color color;
	
	public Car(Model model, Color color) {
		this.model = model;
		this.color = color;
	}

	public Model getModel() {
		return this.model;
	}
	
	public Color getColor() {
		return this.color;
	}

	public String toString() {
		return String.format("%s %s", this.color, this.model);
	}
	
	public static void main(String[] args) {
		
// 1. values() method in enums 		
		for (Model m : Model.values()) {
			System.out.println(m);
		}
		System.out.println("---");
		for (Color c : Color.values()) {
			System.out.println(c);
		}
		System.out.println("---");
// 2. enums are comparable to the same enum type 		
		if (Model.ALTO.compareTo(Model.SWIFT) < 0) {
			System.out.println("ALTO is lesser than SWIFT");
		}
		else {
			System.out.println("ALTO is greater than SWIFT");
		}
// 3. enums of different enum types cannot be compared.		
/*		if (Model.ALTO.compareTo(Color.RED) < 0) {
			System.out.println("ALTO is lesser than RED");
		}
		
*/		System.out.println("---");
	
// 4. Enums are type safe unlike the int based enum patterns		
		Car cm = new Car(Model.ALTO, Color.RED);
//		Car cm1 = new Car(0, 1);
//		Car cm2 = new Car(Color.RED, Model.ALTO);
		System.out.println(cm);
		System.out.println("---");
		
// 5. Enums can be used in switch-case
		switch(cm.color) {
			case RED:
				System.out.println("Case RED");
				break;
			case GREY:
				System.out.println("Case GREY");
				break;
			case WHITE:
				System.out.println("Case WHITE");
				break;
		}
	}
}
