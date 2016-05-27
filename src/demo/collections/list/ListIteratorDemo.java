package demo.collections.list;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static final int LAST_INDEX = 8;
	
	public static void main(String[] args) {
		List intList = new ArrayList();			// Instantiate a collection object
		int[] values = { 1, 5, 9, 11, 17, 31, 51, 99 };
		
		for (int i = 0; i < values.length; i++)
			intList.add(new Integer(values[i]));

		ListIterator listIterator = intList.listIterator(LAST_INDEX); 		// Obtain an iterator
		while (listIterator.hasPrevious()) { 					// Check if there is any more element
			Integer element = (Integer) listIterator.previous();// Obtain the element
			System.out.println(element); 				// Print the element
		}
	}
}