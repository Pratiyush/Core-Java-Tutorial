package demo.enhanced.enhancediterator;

import java.util.ArrayList;

public class EnhancedIterator {
	
/*	static void method(String str1, String str2) {
		System.out.println("Non Varargs");
	}
	
	static void method(String... str1) {
		System.out.println("Varargs");
	}
*/
	
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Mango");
		arrList.add("Orange");
		
		for (String element : arrList) {
			System.out.println(element);
		}
		
//		method("Hello", "World","Test");
	}
}
