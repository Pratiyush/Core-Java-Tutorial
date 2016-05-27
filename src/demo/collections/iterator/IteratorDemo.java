package demo.collections.iterator;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection intList = new TreeSet();			// Instantiate a collection object
		int[] values = { 1, 5, 9, 11, 17, 31, 51, 99 };
		for (int i = 0; i < values.length; i++)
			intList.add(new Integer(values[i]));

		Iterator iterator = intList.iterator(); 		// Obtain an iterator
		while (iterator.hasNext()) { 					// Check if there is any more element
			Integer element = (Integer)iterator.next();// Obtain the element
			System.out.println(element); 				// Print the element
		}
	}
}
