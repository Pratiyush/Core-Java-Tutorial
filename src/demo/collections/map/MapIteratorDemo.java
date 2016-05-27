package demo.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorDemo {
	public static void main(String[] args) {
		String[] keys = {"ID", "Name", "Location", "Email"}; 
		String[] values = {"10676", "Ram", "Bangalore", "ram@wipro.com"}; 
		Map map = new HashMap();   // Instantiate a HashMap object
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}
		
		Iterator iterator = map.entrySet().iterator(); 		// Obtain an iterator
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key + " => " + value);
		}
	}
}
