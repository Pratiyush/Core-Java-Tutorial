package demo.generics.boundedwildcard;

import java.util.ArrayList;
import java.util.Collection;

public class BoundedWildCardDemo {
	
	// Collection<? extends Number> denotes collection of unknown which is a subtype of Number
	// and matches collection of element types which are sub types of the class Number.
	static void printCollection(Collection<? extends Number> coll) {
		for (Object o : coll) {
			System.out.println(o);
		}
	}
	
	static void demoBoundedWildCard() {
		Collection<Integer> colli = new ArrayList<Integer>();
		colli.add(new Integer(1));
		Collection<Float> collf = new ArrayList<Float>();
		collf.add(new Float(3.75f));
		Collection<Boolean> collb = new ArrayList<Boolean>();
		collb.add(Boolean.valueOf(true));
		printCollection(colli);
		printCollection(collf);
		printCollection(collb);
	}
	
	public static void main(String... args) {
		System.out.println("\nDemo of Bounded WildCard");
		System.out.println("========================");
		demoBoundedWildCard();
	}
}
