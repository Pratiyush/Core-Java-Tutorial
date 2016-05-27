package demo.generics.genericmethods;

import java.io.Serializable;

class MyNumber extends Number  implements Cloneable
{
	private static final long serialVersionUID = 1L;

	@Override
	public double doubleValue() {
		return 0;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}
}

/**
 * Demonstration of generic method.
 */
public class BoxGenericMethodsDemo<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	// The following method is a generic method, which can accept any type of 
	// object as its argument.
	public <U> void inspect(U u) {
		System.out.println("T: " + t.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
	public <V extends Number> void demoBoundedType(V v) {
		System.out.println("V: " + v.getClass().getName());
	}

	public <W extends Number & Cloneable> void demoMultipleBoundedType(W w) {
		System.out.println("W: " + w.getClass().getName());
	}
	
	public static void main(String[] args) {
		BoxGenericMethodsDemo<Integer> integerBox = new BoxGenericMethodsDemo<Integer>();
		integerBox.add(new Integer(10));
		integerBox.inspect("some text");
		integerBox.<String>inspect("Can also be invoked this way");
		
		BoxGenericMethodsDemo<Float> floatBox = new BoxGenericMethodsDemo<Float>();
		floatBox.demoBoundedType(new Float(11.7f));
// Uncommenting the below line will cause compiler error since the type that
// is passed should be derived from Number type whereas String is not. 
		floatBox.demoBoundedType("text");
		
		BoxGenericMethodsDemo<Integer> intBox = new BoxGenericMethodsDemo<Integer>();
		intBox.demoMultipleBoundedType(new MyNumber());
// Uncommenting the below line will cause compiler error since the type that
// is passed should be derived from Number type and also should implement
// the interface Cloneable.
//		intBox.demoMultipleBoundedType(new Integer(10));
	}
}
