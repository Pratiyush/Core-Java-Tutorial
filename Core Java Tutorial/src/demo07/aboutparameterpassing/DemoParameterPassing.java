package demo07.aboutparameterpassing;

class Car {
	String color = "red"; 
}

public class DemoParameterPassing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of passing parameters.");
		
		demoPrimitiveParamsPassing();
		demoObjectParamsPassing();
	}
	
	static void methodPrimitive(int param) {
		System.out.print("\nValue of parameter inside method = " + param);
		param++;
		System.out.print("\nValue of parameter inside method (after incrementing) = " + param);
	}
	
	static void demoPrimitiveParamsPassing() {
		System.out.print("\nDemo of primitive type params passing ....");
		int value = 10;
		
		System.out.print("\nValue of parameter BEFORE invoking method = " + value);
		methodPrimitive(value);
		System.out.print("\nValue of parameter AFTER invoking method = " + value);
		
	}

	static void repaint(Car c) {
		c.color = "blue";
		c = null;
	}
	
	static void demoObjectParamsPassing() {
		System.out.print("\n\nDemo of object params passing ....");
		Car myCar = new Car();
		System.out.print("\nColor of car BEFORE repainting: " + myCar.color);
		repaint(myCar);
		System.out.print("\nColor of car AFTER repainting: " + myCar.color);
	}
	
	
}