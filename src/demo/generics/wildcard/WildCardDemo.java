package demo.generics.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WildCardDemo {
	static void printNonGenericCollection(Collection coll) {
		Iterator iter = coll.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	static void demoNonGenericCollection() {
		Collection coll = new ArrayList();
		coll.add(new String("Hello"));
		coll.add(new String("World"));
		coll.add(new Integer(1));
		coll.add(new Integer(2));
		coll.add(Boolean.valueOf(true));
		coll.add(Boolean.valueOf(false));
		printNonGenericCollection(coll);
	}
	
	// Collection<?> denotes collection of unknown and matches collection of any element type and
	// therefore called wildcard type.
	static void printGenericCollection(Collection<?> coll) {
		for (Object o : coll) {
			System.out.println(o);
		}
	}

	static void demoGenericCollection() {
		Collection<String> colls = new ArrayList<String>();
		colls.add(new String("Hello"));
		colls.add(new String("World"));
		Collection<Integer> colli = new ArrayList<Integer>();
		colli.add(new Integer(1));
		colli.add(new Integer(2));
		Collection<Boolean> collb = new ArrayList<Boolean>();
		collb.add(Boolean.valueOf(true));
		collb.add(Boolean.valueOf(false));
		printGenericCollection(colls);
		printGenericCollection(colli);
		printGenericCollection(collb);
		
	}

	public static void main(String... args) {
		System.out.println("\nDemo of Non Generic Collection");
		System.out.println("==============================");
		demoNonGenericCollection();
		System.out.println("\nDemo of Generic Collection");
		System.out.println("==========================");
		demoGenericCollection();
	}
}
