package demo.generics.subtype;

import java.util.ArrayList;
import java.util.List;

public class UpcastingListDemo {
	
	public static void main(String... args) {
		String string = new String("Hello World");
 // Assigning a string object to a object reference is fine. A String is also an Object.
		Object object = string; 
		
		List<String> listString = new ArrayList<String>();
// But assigning a list of string to a list of object reference is not fine. 
// List of Strings is not a List of Objects.		
		List<Object> listObject = listString;
		
// If above assignment is allowed, then it should be allowed to add an Object to list
// as follows.
		listObject.add(new Object());

// Then since listObject is pointing to a list of Strings, we may attempt to do the 
// following assignment which would become illegal since an Object is not a String.
		String s = listObject.get(0);
	}
}
