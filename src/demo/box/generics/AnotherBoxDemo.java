package demo.box.generics;

// A generic type may have multiple type parameters, but each parameter 
// must be unique within its declaring class or interface.
// public class AnotherBox<T,T> 
class AnotherBox<T,U>
{
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	public T getT() {
		return t;
	}
	public U getU() {
		return u;
	}
}

public class AnotherBoxDemo {
	public static void main(String... args) {
		AnotherBox<Integer, String> intAndStrBox = new AnotherBox<Integer, String>();
		intAndStrBox.set(new Integer(1), "Hello");
		System.out.println("Integer ==> " + intAndStrBox.getT());
		System.out.println("String ==> " + intAndStrBox.getU());
	}
}