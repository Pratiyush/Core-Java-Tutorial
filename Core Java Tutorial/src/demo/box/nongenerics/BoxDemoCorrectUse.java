package demo.box.nongenerics;

public class BoxDemoCorrectUse {

	public static void main(String[] args) {

		// ONLY place Integer objects into this box!
		Box integerBox = new Box();
		integerBox.add(new Integer(10));
		
		Integer someInteger = (Integer)integerBox.get();
		System.out.println(someInteger);
	}
}
