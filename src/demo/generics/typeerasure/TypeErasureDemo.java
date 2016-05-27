package demo.generics.typeerasure;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureDemo<T> {
	public static void myMethod(Object item) {
		if (item instanceof T) { // Compiler error
			System.out.println("item is an instance of " + T);
		}
		T item2 = new T(); // Compiler error
		T[] iArray = new T[10]; // Compiler error
		T obj = (T) new Object(); // Unchecked cast warning
	}
	
	static void demoTypeErasure() {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();
		if (list1.getClass() == list2.getClass()) {
			System.out.println("list1 and list2 belong to the same class");
		}
		System.out.println("Class of list1 ==> " + list1.getClass().getName());
		System.out.println("Class of list2 ==> " + list2.getClass().getName());
	}
	
	public static void main(String ... args) {
		System.out.println("\nDemo of Type Erasure");
		System.out.println("=====================");
		demoTypeErasure();
	}
}
