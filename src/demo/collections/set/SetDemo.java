package demo.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class DescendingComparator implements Comparator {
	public int compare (Object obj1, Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		return (i2-i1);
	}
}

public class SetDemo {

	static void demoAnotherHashSet() {
		String[] values = { "9", "1", "5", null, null };
		Set set = new HashSet();   // Instantiate a HashSet object
		for (int i = 0; i < values.length; i++) {
			boolean bAdded = set.add(values[i]);
			if (bAdded)
				System.out.println("Added " + values[i]);
			else
				System.out.println("Failed to add " + values[i]);
		}
		System.out.println("Contents of Another HashSet ==> " + set); // Print the set == Unordered
	}

	static void demoHashSet() {
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		Set set = new HashSet();   // Instantiate a HashSet object
		for (int i = 0; i < values.length; i++) {
			boolean bAdded = set.add(new Integer(values[i]));
			if (bAdded)
				System.out.println("Added " + values[i]);
			else
				System.out.println("Failed to add " + values[i]);
		}
		System.out.println("Contents of HashSet ==> " + set); // Print the set == Unordered
	}
	
	static void demoLinkedHashSet()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		Set set = new LinkedHashSet();       // Instantiate a LinkedHashSet object
		for (int i = 0; i < values.length; i++) {
			boolean bAdded = set.add(new Integer(values[i]));
			if (bAdded)
				System.out.println("Added " + values[i]);
			else
				System.out.println("Failed to add " + values[i]);
		}
		System.out.println("Contents of LinkedHashSet ==> " + set); // Print the set == Insertion Order
	}

	static void demoTreeSet()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		Set set = new TreeSet();       // Instantiate a TreeSet object
		for (int i = 0; i < values.length; i++) {
			boolean bAdded = set.add(new Integer(values[i]));
			if (bAdded)
				System.out.println("Added " + values[i]);
			else
				System.out.println("Failed to add " + values[i]);
		}
		System.out.println("Contents of TreeSet ==> " + set); // Print the set = Sorted Order
		
		Set descendingSet = new TreeSet(new DescendingComparator());       // Instantiate a TreeSet object
		for (int i = 0; i < values.length; i++) {
			boolean bAdded = descendingSet.add(new Integer(values[i]));
		}
		System.out.println("Contents of TreeSet (Descending) ==> " + descendingSet); // Print the set = Sorted but descending order

	}
	
	static void demoSetOperations()
	{
		Set a = new HashSet();
		Set b = new HashSet();
		Set c = new HashSet();

		int[] aValues = { 1, 3, 5, 7, 9, 11, 13, 15 };
		for (int i = 0; i < aValues.length; i++) {
			a.add(new Integer(aValues[i]));
		}
		int[] bValues = { 3, 6, 9, 12, 15, 18};
		for (int i = 0; i < bValues.length; i++) {
			b.add(new Integer(bValues[i]));
		}
		int[] cValues = { 6, 12, 18};
		for (int i = 0; i < cValues.length; i++) {
			c.add(new Integer(cValues[i]));
		}
		System.out.println("containsAll demo");
		boolean bContainsAllOfC = b.containsAll(c);
		System.out.println("b contains all elements of c ==> " + bContainsAllOfC);
		
		boolean cContainsAllOfB = c.containsAll(b);
		System.out.println("c contains all elements of b ==> " + cContainsAllOfB);

		System.out.println("\naddAll demo");
		System.out.print("Adding " + b + " to " + a + " ==> ");
		a.addAll(b);
		System.out.println(a);
		
		System.out.println("\nremoveAll demo");
		System.out.print("Removing " + c + " from " + a + " ==> ");
		a.removeAll(c);
		System.out.println(a);
		
		System.out.println("\nretainAll demo");
		System.out.print("Common between " + a + " and " + b + " ==> ");
		a.retainAll(b);
		System.out.println(a);
		
		System.out.println("\nclear demo");
		System.out.print("Content after clearing " + a + " ==> ");
		a.clear();
		System.out.println(a);
	}

	public static void main(String[] args) {
		System.out.println("Demo of Hash Set feature");
		System.out.println("========================");
		demoHashSet(); 			// Demonstrate hash set
		
		System.out.println("Demo of Another Hash Set feature");
		System.out.println("========================");
		demoAnotherHashSet(); 			// Demonstrate hash set
		
		System.out.println("\nDemo of Linked Hash Set feature");
		System.out.println("=================================");
		demoLinkedHashSet(); 	// Demonstrate linked hash set
		
		System.out.println("\nDemo of Tree Set feature");
		System.out.println("==========================");
		demoTreeSet();

		System.out.println("\nDemo of Set operations");
		System.out.println("========================");
		demoSetOperations();
	}
}

