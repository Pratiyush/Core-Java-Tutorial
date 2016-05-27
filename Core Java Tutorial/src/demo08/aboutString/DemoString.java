package demo08.aboutString;

public class DemoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of String concepts.");
		
		demoStringComparisons();
		
		demoStringMethods();
	}
	
	static void demoStringComparisons() {
		String str1 = "Hello Java";
		String str2 = "Hello Java";
		String str3 = "Hello World";
		String str4 = new String("Hello Java");
		String str5 = new String("Hello Java");
		
		System.out.println("\nDemo of String comparisons...");
// 1. Comparing REFERENCES of same value strings from String constant pool.
		boolean bValue1 = (str1 == str2);//true "Hello Java" == "Hello Java"
		System.out.println("1) Comparing REFERENCES of same value strings from String constant pool ==> " + bValue1);
		
// 2. Comparing CONTENTS of same value strings from String constant pool.
		boolean bValue2 = (str1.equals(str2));//true "Hello Java" == "Hello Java"
		System.out.println("2) Comparing CONTENTS of same value strings from String constant pool ==> " + bValue2);
		
// 3. Comparing REFERENCES of different value strings from String constant pool.
		boolean bValue3 = (str1 == str3);//false "Hello Java" == "Hello World"
		System.out.println("3) Comparing REFERENCES of different value strings from String constant pool ==> " + bValue3);

// 4. Comparing CONTENTS of different value strings from String constant pool.
		boolean bValue4 = (str1.equals(str3));//false "Hello Java" == "Hello World"
		System.out.println("4) Comparing CONTENTS of different value strings from String constant pool ==> " + bValue4);
		
// 5. Comparing REFERENCES of a string from String constant pool with a string from HEAP [ Having SAME VALUE].
		boolean bValue5 = (str1 == str4);// false "Hello Java" == "Hello Java" (Onject)
		System.out.println("\n5) Comparing REFERENCES of a string from String constant pool with a string from HEAP [ Having SAME VALUE] ==> " + bValue5);
		
// 6. Comparing CONTENTS of a string from String constant pool with a string from HEAP [ Having SAME VALUE].
		boolean bValue6 = (str1.equals(str4));// true "Hello Java" == "Hello Java"
		System.out.println("6) Comparing CONTENTS of a string from String constant pool with a string from HEAP [ Having SAME VALUE] ==> " + bValue6);
		
// 7. Comparing REFERENCES of a string from HEAP with another string from HEAP [ Having SAME VALUE].
		boolean bValue7 = (str4 == str5);//false "Hello Java" == "Hello Java"
		System.out.println("\n7) Comparing REFERENCES of a string from HEAP with another string from HEAP [ Having SAME VALUE] ==> " + bValue7);
		
// 8. Comparing CONTENTS of a string from HEAP with another string from HEAP [ Having SAME VALUE].
		boolean bValue8 = (str4.equals(str5));// true "Hello Java" == "Hello Java"
		System.out.println("8) Comparing CONTENTS of a string from HEAP with another string from HEAP [ Having SAME VALUE] ==> " + bValue8);
	}
	
	static void demoStringMethods() {
		
		System.out.print("\nDemo of String methods...");
		// 1. toUpperCase
		String str1 = "Hello Java";
		System.out.printf("\n1) toUpperCase of '%s' = %s", str1, str1.toUpperCase());
		//HELLO JAVA
		
		// 2. toLowerCase//
		System.out.printf("\n2) toLowerCase of '%s' = %s", str1, str1.toLowerCase());
		//hello java
		
		// 3a. concat [ without assigning ]
		str1.concat(" World"); // "Hello Java"
		System.out.print("\n3a) Value of str1 after concatenating [without assigning ] = " + str1);
		//Hello Java
		
		// 3b. concat [ after assigning ]
		String str2 = str1.concat(" World");
		System.out.print("\n3b) Value after concatenating and assigning = " + str2);
		//Hello Java World
		
		// 4. charAt
		String str3 = "Java World";
		int index = 5;
		System.out.printf("\n4) Char At index %d in the string '%s' = %c", index, str3, str3.charAt(index));
		//W
		
		// 5a. indexOf - first occurrence
		String str4 = "Hello Java World";
		int firstIndexOfO = str4.indexOf('o');
		System.out.printf("\n5a) First Index of 'o' in the string '%s' = %d", str4, firstIndexOfO);
		//4
		
		// 5b. indexOf - next occurrence
		//"Hello Java World";
		int secondIndexOfO = str4.indexOf('o', firstIndexOfO+1);
		System.out.printf("\n5b) Index of 'o' in the string '%s' after the first 'o' = %d", str4, secondIndexOfO);
		//12
		
		// 6a. lastIndexOf - first occurrence from reverse
		//"Hello Java World";
		int lastIndexOfO = str4.lastIndexOf('o');
		System.out.printf("\n6a) Last Index of 'o' in the string '%s' = %d", str4, lastIndexOfO);
		//12
		
		// 6b. lastIndexOf - next occurrence
		//"Hello Java World";
		int nextLastIndexOfO = str4.lastIndexOf('o', lastIndexOfO-1);
		System.out.printf("\n6b) Last Index of 'o' in the string '%s' from the last 'o' already found = %d", str4, nextLastIndexOfO);
		//4
		
		// 7. substring
		String str5 = "Hello Java";
		String substr = str5.substring(7, 9);
		System.out.printf("\n7) Substring between the index 6 and 8 of the the string '%s' = %s", str5, substr);
		//av
		
		// 8. startsWith
		String str6 = "Hello World";
		boolean bStartsWith = str6.startsWith("Hello");
		System.out.printf("\n8) [Using startsWith method] The string '%s' starts with 'Hello' => %b", str6, bStartsWith);
		//true
		
		// 9. endsWith
		boolean bEndsWith = str6.endsWith("World");
		System.out.printf("\n9) [Using endsWith method] The string '%s' ends with 'World' => %b", str6, bEndsWith);
		//true
		
		// 10. compareTo
		String str7 = "Hello World";
		String str8 = new String("Hello world");
		int compareValue = str7.compareTo(str8);
		System.out.printf("\n10) [Using compareTo method] Difference when comparing '%s' and '%s' = %d", str7, str8, compareValue);
		//-31
		
		// 11a. compareToIgnoreCase
		int compareIgnoreCaseValue = str7.compareToIgnoreCase(str8);
		System.out.printf("\n11a) [Using compareToIgnoreCase method] Difference when comparing '%s' and '%s' = %d", str7, str8, compareIgnoreCaseValue);
		//0
		
		// 11b. compareToIgnoreCase
		int compareIgnoreCaseValueSameValue = str7.compareTo("Hello World");
		System.out.printf("\n11b) [Using compareToIgnoreCase method] Difference when comparing '%s' and '%s' = %d", str7, "Hello World", compareIgnoreCaseValueSameValue);
		//0
		
		// 12. equals
		boolean bEquals = str7.equals(str8);
		System.out.printf("\n12) [Using equals method] Comparing '%s' and '%s' = %b", str7, str8, bEquals);
		//false
		
		// 13. equalsIgnoreCase
		boolean bEqualsIgnoreCase = str7.equalsIgnoreCase(str8);
		System.out.printf("\n13) [Using equalsIgnoreCase method] Comparing '%s' and '%s' = %b", str7, str8, bEqualsIgnoreCase);
		//true
		
		
	}
}

