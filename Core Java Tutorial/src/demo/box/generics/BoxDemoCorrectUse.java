package demo.box.generics;

public class BoxDemoCorrectUse {
    public static void main(String[] args) {
    	// Box<Integer> integerBox tells that integerBox holds a reference to a "Box of Integer". 
        Box<Integer> integerBox = new Box<Integer>(); // Generic Type invocation
        integerBox.add(10);
        
        Integer someInteger = integerBox.get(); // no cast!
        System.out.println(someInteger);
        
        Box<Number> numberBox = new Box<Number>(); // Generic Type invocation
        numberBox.add(new Float(10.5f));
    }
}
