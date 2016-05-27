package demo06.aboutflowcontrol;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoFlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of Flow Control.");
		
		demoIfElse();
		demoTernary();
		demoWhile();
		demoDoWhile();
		demoForLoop();
		demoEnhancedForLoop();
		demoSwitch();
	}

	static void demoIfElse() {
		int i=6;
		System.out.println("Only booleans can be tested in if and else if conditions.");
		// 1. Only booleans can be tested in if and else if conditions  
		if (i < 3) {
			System.out.println("i < 3");
		}
		else if (i >= 3 && i <=5 ) {
			System.out.println("i >= 3 and i <= 5");
		}
		else {
			System.out.println("i > 5");
		}
		
		// 2. Trying to check integers etc. will give compilation errors.
/*		if (i) {
			System.out.println("Non-boolean cannot be checked in if.")
		}
*/		
	}
	
	static void demoTernary() {
		System.out.print("\nDemo of Ternary Operator ?:");
		int j=-5;
		boolean bNegativeValue = (j < 0) ? true : false; 
		
		if (bNegativeValue)
			System.out.print("\nThe value is negative");
		else
			System.out.print("\nThe value is not negative");
	}
	
	static void demoWhile() {
		int i=0;
		System.out.print("\nWhile loop executes 0 or more times.");
		while (i>0) {
			System.out.print("\nIn while loop...");
			i--;
		}
	}
	
	static void demoDoWhile() {
		int i=0;
		System.out.print("\n\ndo-while loop executes 1 or more times.");
		do {
			System.out.print("\nIn do-while loop...");
			i--;
		} while (i>0);
	}
	
	static void demoForLoop() {
		// 1. Demo of primitive types [ for loop ]
		System.out.print("\n\n[array iteration] Normal For Loop...\n");
		int[] array = new int[]{1,2,3,4,5};
		for (int i=0; i<array.length; i++) {
			System.out.printf("Element at index %d = %d\n", i,array[i]);
		}
		
		// 2. Demo of Collection Framework - Iterator [ Normal Iterator ]
		System.out.print("\n[Collection iteration] Normal Iterator...\n");
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Mango");
		arrList.add("Orange");
		Iterator<String> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}
	
	static void demoEnhancedForLoop() {
		// 1. Demo of primitive types [ Enhanced for loop ]
		System.out.print("\n[array iteration] Enhanced For Loop...\n");
		int[] array = new int[]{1,2,3,4,5};
		for (int element : array) {
			System.out.printf("%d\n", element);
		}
		
		// 2. Demo of Collection Framework - Iterator [ Enhanced for loop ]
		System.out.print("\n[Collection iteration] Enhanced For Loop...\n");
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Mango");
		arrList.add("Orange");
		
		for (String element : arrList) {
			System.out.println(element);
		}
	}

	enum COLOR {RED, BLUE};
	static void demoSwitch() {
		System.out.print("\nDemo of Switch...");
		byte b=5;
		short s=6;
		char c='A';
		int i=7;
		long l=8;
		float f=9.1f;
		double d=10.7;
		COLOR r=COLOR.RED;

		switch (b) {
		}
		
		switch (s) {
		}
		
		switch (c) {
		}

		switch (i) {
			case 5: 
				System.out.print("\ncase 5");
				break;
			case 6:
				System.out.print("\ncase 6");
				break;
			default:
				System.out.print("\ndefault");
				break;
			case 7:
				System.out.print("\ncase 7");
				break;
		}

/*		switch (l) {
		}
		
		switch (f) {
		}
		
		switch (d) {
		}
*/
		switch(r) {
		
		}
	}
	
}
