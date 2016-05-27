package demo04.aboutprimitiveconversions;

public class DemoNarrowingConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the narrowing conversion of primitive types.");
		System.out.println("Compiler does not allow NARROWING conversion by default and TYPECASTING is required because there is loss of data.");
		demoNarrowingConversion();
	}

	static void demoNarrowingConversion() {
		byte b=25;
		char c='C';
		short s=45;
		int i=65;
		long l=75;
		float f=85.43f;
		double d=95.78;
		
		// Assigning of char, short, int, long, float, double to byte is narrowing conversion.
		b = c;//Type mismatch: cannot convert from char to byte
		b = s;
		b = i;
		b = l;
		b = f;
		b = d;
		
		// Assigning of short, int, long, float, double to char is narrowing conversion.
		c = s;//Type mismatch: cannot convert from short to char
		c = i;
		c = l;
		c = f;
		c = d;
		
		// Assigning of int, long, float, double to short is narrowing conversion.
		s = i;//Type mismatch: cannot convert from int to short
		s = l;
		s = f;
		s = d;
		
		// Assigning of long, float, double to int is narrowing conversion.
		i = l;//Type mismatch: cannot convert from long to int
		i = f;
		i = d;
		
		// Assigning of float, double to long is narrowing conversion.
		l = f;//Type mismatch: cannot convert from float to long
		l = d;
		
		// Assigning of double to float is narrowing conversion.
		f = d;//Type mismatch: cannot convert from double to float
	}

}
