package demo.annotations;

import java.util.HashSet;
import java.util.Set;

// Demonstration of @Override annotation feature
@Override // Marker Annotation
class Rectangle extends Object {
	int length, width;
	
	@Override // Marker Annotation
	public int hasCode() {
		return 2*length + 4*width;
	}
}

//Demonstration of @Deprecated annotation feature
class Square extends Object {
	int length;
	
	public int area(int length) {
		return length * length;
	}
	@Deprecated
	public int oldArea(int length) {
		int area = 0;
		for (int i=0; i<length; i++) {
			area += length;
		}
		return area;
	}

}

// Demonstration of @SuppressWarnings annotation feature
class SuppressTest {
	@SuppressWarnings("unchecked")
	public void testMethod(String[] strArray)
	{
		Set set = new HashSet();
		
		for (String str : strArray) {
			set.add(str);
		}
	}
}


@Author(name="Ram", date="2009/08/18")
public class DemoAnnotations {
	public static void main(String[] args) {
		Square s = new Square();
		int area = s.area(10);
		System.out.println("area = " + area);
		int oldArea = s.oldArea(10);
		System.out.println("old area = " + oldArea);
	}
}
