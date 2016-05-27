package demo.generics.subtype;

class Box<T> {

    private T t; // T stands for "Type"          

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class SubtypeDemo {
	public static void main(String... args) {
		Box<Number> box = new Box<Number>();
		box.add(new Integer(10));
		box.add(new Double(10.15));
//		box.add("String");
	}
}
