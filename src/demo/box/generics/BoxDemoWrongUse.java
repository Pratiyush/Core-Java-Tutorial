package demo.box.generics;

public class BoxDemoWrongUse {
	public static void main(String[] args) {
	    Box<Integer> integerBox = new Box<Integer>();
	    integerBox.add("10"); // Trying to add a String type 
	    
	    Integer someInteger = integerBox.get();
        System.out.println(someInteger);
    }
}
