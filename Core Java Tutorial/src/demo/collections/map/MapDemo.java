package demo.collections.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;

class DescendingComparator implements Comparator {
	public int compare (Object obj1, Object obj2) {
		String str1 = (String)obj1;
		String str2 = (String)obj2;
		return (str2.compareToIgnoreCase(str1));
	}
}

public class MapDemo {
	
	static void demoHashMap() {
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Map map = new HashMap();   // Instantiate a HashMap object
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		System.out.println("Contents of HashMap ==> " + map); // Print the map == Unordered
	}
	
	static void demoHashtable() {
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Hashtable ht = new Hashtable();   // Instantiate a HashTable object
		for (int i = 0; i < keys.length; i++) {
			ht.put(keys[i], values[i]);
		}
		System.out.println("Contents of Hashtable ==> " + ht); // Print the set == Unordered
	}
	
	static void demoLinkedHashMap()
	{
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Map map = new LinkedHashMap();   // Instantiate a LinkedHashMap object
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		System.out.println("Contents of LinkedHashMap ==> " + map); // Print the map == Insertion Order
	}

	static void demoTreeMap()
	{
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Map map = new TreeMap();   // Instantiate a TreeMap object
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		System.out.println("Contents of TreeMap ==> " + map); // Print the map == Sorted Order
		
		Map descendingMap = new TreeMap(new DescendingComparator());   // Instantiate a TreeMap object
		for (int i = 0; i < keys.length; i++) {
			descendingMap.put(keys[i], values[i]);
		}
		System.out.println("Contents of TreeMap (Descending) ==> " + descendingMap); // Print the map == Sorted but Descending Order

	}
	
	static void demoMapOperations()
	{
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Map map = new HashMap();   // Instantiate a HashMap object
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		
		System.out.println("containsKey demo");
		boolean bContainsKey = map.containsKey("Location");
		System.out.println("map contains the key 'Location' ==> " + bContainsKey);
		
		System.out.println("\ncontainsValue demo");
		boolean bContainsValue = map.containsValue("Bangalore");
		System.out.println("map contains the value 'Bangalore' ==> " + bContainsValue);
		
		System.out.println("\nsize demo");
		int mapSize = map.size();
		System.out.println("Size of the map ==> " + mapSize);
		
		Map emptyMap = new HashMap();   // Instantiate a HashMap object and let it be empty
		System.out.println("\nisEmpty demo");
		boolean bEmptyMap = emptyMap.isEmpty();
		System.out.println("isEmpty on 'emptyMap' returns " + bEmptyMap);
		boolean bMap = map.isEmpty();
		System.out.println("isEmpty on 'map' returns " + bMap);

		System.out.println("\nputAll demo");
		Map newMap = new HashMap();
		newMap.putAll(map);
		System.out.println("Contents of new map ==> " + newMap); // Print the contents of new map
		
		System.out.println("\nclear demo");
		newMap.clear();
		System.out.println("Contents of new map (after clearing) ==> " + newMap); // Print the contents of new map after clearing
		
		System.out.println("\nkeySet demo");
		Set keySet = map.keySet();
		System.out.println("Set of keys present in the map ==> " + keySet);
		
		System.out.println("\nvalues demo");
		Collection values1 = map.values();
		System.out.println("Collection of values present in the map ==> " + values1);
		
		System.out.println("\nentrySet demo");
		Set entrySet = map.entrySet();
		System.out.println("Set of entries present in the map ==> " + entrySet);
	}

	public static void main(String[] args) {
		System.out.println("Demo of Hash Map feature");
		System.out.println("========================");
		demoHashMap(); 			// Demonstrate hash map
		
		System.out.println("\nDemo of Hash Table feature");
		System.out.println("========================");
		demoHashtable(); 			// Demonstrate hash table
		
		System.out.println("\nDemo of Linked Hash Map feature");
		System.out.println("=================================");
		demoLinkedHashMap(); 	// Demonstrate linked hash map
		
		System.out.println("\nDemo of Tree Map feature");
		System.out.println("==========================");
		demoTreeMap();			// Demonstrate tree map

		System.out.println("\nDemo of Map operations");
		System.out.println("========================");
		demoMapOperations();	// Demonstrate various map operations
	}
}

