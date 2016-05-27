package demo04.aboutprimitiveconversions;

public class DemoWideningConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the widening conversion of primitive types.");
		System.out.println("Compiler allows widening conversion by default and there is no typecasting required because there is no loss of data.");
		demoWideningConversion();
	}

	static void demoWideningConversion() {
		double d=100.56;
		float f=90.67f;
		long l=50;
		int i=40;
		short s=30;
		char c='A';
		byte b=10;
		
		
		// byte << short << char << int << long << float << double 
		
		// Assigning of float, long, int, short, char, byte to double is widening conversion.
		System.out.print("Printing the values after assigning to double ==> ");
		// double ---> float
		d = f;
		System.out.print("d="+d+",f="+f);
		// double ---> long
		d = l;
		System.out.print(" d="+d+",l="+l);
		// double ---> int
		d = i;
		System.out.print(" d="+d+",i="+i);
		// double ---> short
		d = s;
		System.out.print(" d="+d+",s="+s);
		// double ---> char
		d = c;
		System.out.print(" d="+d+",c="+c);
		// double ---> byte
		d = b;
		System.out.println(" d="+d+",b="+b);
		
		// Assigning of long, int, short, char, byte to float is widening conversion.
		System.out.print("Printing the values after assigning to float ==> ");
		// float ---> double
		//Type mismatch: cannot convert from double to float
		//f = d;
		f = (float)d;
		System.out.print("f="+f+",l="+d);
		// float ---> long
		f = l;
		System.out.print("f="+f+",l="+l);
		// float ---> int
		f = i;
		System.out.print(" f="+f+",i="+i);
		// float ---> short
		f = s;
		System.out.print(" f="+f+",s="+s);
		// float ---> char
		f = c;
		System.out.print(" f="+f+",c="+c);
		// float ---> byte
		f = b;
		System.out.println(" f="+f+",b="+b);
		
		// Assigning of int, short, char, byte to long is widening conversion.
		System.out.print("Printing the values after assigning to long ==> ");
		// long ---> double
		//Type mismatch: cannot convert from double to long
		//l = d;
		l = (long)d;
		System.out.print("l="+l+",i="+d);
		// long ---> float
		//Type mismatch: cannot convert from float to long
		l =(long)f;
		System.out.print("l="+l+",i="+f);
		// long ---> int
		l = i;
		System.out.print("l="+l+",i="+i);
		// long ---> short
		l = s;
		System.out.print(" l="+l+",s="+s);
		// long ---> char
		l = c;
		System.out.print(" l="+l+",c="+c);
		// long ---> byte
		l = b;
		System.out.println(" l="+l+",b="+b);

		// Assigning of short, char, byte to int is widening conversion.
		System.out.print("Printing the values after assigning to int ==> ");
		// int ---> double
		//Type mismatch: cannot convert from double to int
		//i = d;
		i = (int)d;
		System.out.print("i="+i+",s="+s);
		// int ---> float
		//Type mismatch: cannot convert from float to int
		//i = f;
		i = (int) f;
		System.out.print("i="+i+",s="+f);
		// int ---> long
		//Type mismatch: cannot convert from long to int
		i = (int)l;
		System.out.print("i="+i+",s="+l);
		// int ---> short
		i = s;
		System.out.print("i="+i+",s="+s);
		// int ---> char
		i = c;
		System.out.print(" i="+i+",c="+c);
		// int ---> byte
		i = b;
		System.out.println(" i="+i+",b="+b);
		
		// Assigning of byte to short is widening conversion.
		System.out.print("Printing the values after assigning to short ==> ");
		s = b;
		System.out.println(" s="+s+",b="+b);
		//Type mismatch: cannot convert from char to short
		//s =c;
		//Type mismatch: cannot convert from char to byte
		//b= c;
		//Type mismatch: cannot convert from int to char
		//c =i;
		i =c;
	}
}
