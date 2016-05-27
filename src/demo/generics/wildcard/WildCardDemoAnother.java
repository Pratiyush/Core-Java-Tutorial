package demo.generics.wildcard;

import java.util.List;
import java.util.ArrayList;

public class WildCardDemoAnother {
	static void print(List <?> objectList)
	{
		for (Object o : objectList)
			System.out.println(o.toString());
	}
	
	public static void main(String... args) {
		 List<Integer> li=new ArrayList<Integer>();
		 li.add(new Integer(10));
		 
		 List<Float> lf=new ArrayList<Float>();
		 lf.add(new Float(10.9));
		 
		 print(li);
		 print(lf);
	}
}
