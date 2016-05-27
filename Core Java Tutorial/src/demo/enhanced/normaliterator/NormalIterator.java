package demo.enhanced.normaliterator;

import java.util.ArrayList;
import java.util.Iterator;

public class NormalIterator {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Apple");
		arrList.add("Mango");
		arrList.add("Orange");
		Iterator<String> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
