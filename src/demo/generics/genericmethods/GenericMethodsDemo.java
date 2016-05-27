package demo.generics.genericmethods;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodsDemo {
	// Similar to generic type declarations, method declarations can also be generic.
	// The following method can accept any type of object.
	static <T> void arrayToCollection(T[] arr, Collection<T> coll)
	{
		for (T o : arr) {
			coll.add(o);
		}
	}
	
	public static void main(String... args) {
		Object[] objArray = new Object[10];
		Collection<Object> collo = new ArrayList<Object>();
		// Invoke the method with type "Object" 
		arrayToCollection(objArray, collo);
		
		// Now, invoke the method with type "Integer" 
		Integer[] intArray = new Integer[10];
		Collection<Integer> colli = new ArrayList<Integer>();
		arrayToCollection(intArray, colli);
		
	}

}
