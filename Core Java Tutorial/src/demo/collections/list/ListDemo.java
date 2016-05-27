package demo.collections.list;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListDemo {
	
	static void demoArrayList()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		List list = new ArrayList();   // Instantiate a ArrayList object
		for (int i = 0; i < values.length; i++) {
			list.add(new Integer(values[i]));
		}
		System.out.println("Contents of ArrayList ==> " + list); // Print the ArrayList
	}
		
	static void demoLinkedList()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		List list = new LinkedList();   // Instantiate a LinkedList object
		for (int i = 0; i < values.length; i++) {
			list.add(new Integer(values[i]));
		}
		System.out.println("Contents of LinkedList ==> " + list); // Print the LinkedList
	}

	static void demoVector()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		List list = new ArrayList();   // Instantiate a Vector object
		for (int i = 0; i < values.length; i++) {
			list.add(new Integer(values[i]));
		}
		System.out.println("Contents of Vector ==> " + list); // Print the Vector
	}
	
	static void demoListOperations()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		List list = new Vector();   // Instantiate a ArrayList object
		for (int i = 0; i < values.length; i++) {
			list.add(new Integer(values[i]));
		}
		System.out.println("add at index demo");
		System.out.print("Adding an element at index 2 to " + list + " ==> ");
		list.add(2, new Integer(6));
		System.out.println(list); // Print the ArrayList
		
		System.out.println("\nset at index demo");
		System.out.print("Setting element at index 2 in " + list + " ==> ");
		Object prevElement = list.set(2, new Integer(4));
		System.out.println(list); // Print the ArrayList
		System.out.println("NOTE: Previous element was --> " + prevElement);
		
		System.out.println("\nget at index demo");
		System.out.print("Getting element at index 2 in " + list + " ==> ");
		Object element = list.get(2);
		System.out.println(element); // Print the element at index 2.
		
		System.out.println("\nremove at index demo");
		System.out.print("Removing element at index 2 from " + list + " ==> ");
		list.remove(2);
		System.out.println(list); // Print the ArrayList
		
		System.out.println("\nindexOf demo");
		System.out.print("Index of 9 in " + list + " ==> ");
		int index = list.indexOf(new Integer(9));
		System.out.println(index); // Print the index of 9.

		System.out.println("\nlastIndexOf demo");
		System.out.print("Last Index of 9 in " + list + " ==> ");
		int lastIndex = list.lastIndexOf(new Integer(9));
		System.out.println(lastIndex); // Print the last index of 9.
	}

	static void demoLinkedListOperations()
	{
		int[] values = { 9, 1, 5, 11, 9, 17, 1 };
		LinkedList llist = new LinkedList();   // Instantiate a LinkedList object
		for (int i = 0; i < values.length; i++) {
			llist.add(new Integer(values[i]));
		}
		System.out.println("addFirst demo");
		System.out.print("Add an element at beginning to " + llist + " ==> ");
		llist.addFirst(new Integer(6));
		System.out.println(llist); // Print the LinkedList
		
		System.out.println("\naddLast demo");
		System.out.print("Add an element at end to " + llist + " ==> ");
		llist.addLast(new Integer(16));
		System.out.println(llist); // Print the LinkedList

		System.out.println("\ngetFirst demo");
		System.out.print("Get first element from " + llist + " ==> ");
		Object firstElement = llist.getFirst();
		System.out.println(firstElement); // Print the first element
		
		System.out.println("\ngetLast demo");
		System.out.print("Get last element from " + llist + " ==> ");
		Object lastElement = llist.getLast();
		System.out.println(lastElement); // Print the last element
		
		System.out.println("\nremoveFirst demo");
		System.out.print("Remove an element at beginning from " + llist + " ==> ");
		llist.removeFirst();
		System.out.println(llist); // Print the LinkedList
		
		System.out.println("\nremoveLast demo");
		System.out.print("Remove an element at end from " + llist + " ==> ");
		llist.removeLast();
		System.out.println(llist); // Print the LinkedList
		
	}
	
	public static void main(String[] args) {
		System.out.println("Demo of ArrayList feature");
		System.out.println("=========================");
		demoArrayList(); 		// Demonstrate ArrayList feature
		
		System.out.println("\nDemo of LinkedList feature");
		System.out.println("=================================");
		demoLinkedList(); 		// Demonstrate LinkedList feature
		
		System.out.println("\nDemo of Vector feature");
		System.out.println("=================================");
		demoVector(); 			// Demonstrate Vector feature
		
		System.out.println("\nDemo of List operations");
		System.out.println("========================");
		demoListOperations();	// Demonstrate List operations
		
		System.out.println("\nDemo of Linked List operations");
		System.out.println("========================");
		demoLinkedListOperations();	// Demonstrate LinkedList operations

	}
}
