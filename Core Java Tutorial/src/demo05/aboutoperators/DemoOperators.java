package demo05.aboutoperators;

public class DemoOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("This is a demo of the operators.");
		
		demoIncrementDecrementOperators();
		demoShiftOperators();
		demoBitwiseOperators();
		demoShortCiruitOperators();
	}

	static void demoIncrementDecrementOperators() {
		int i=10;
		
		System.out.print("i="+i);
		int preIncrementValue = ++i;
		System.out.printf(", preIncrementValue=%d, i=%d", preIncrementValue, i);
		
		int j=10;
		System.out.print("\nj="+j);
		int postIncrementValue = j++;
		System.out.printf(", postIncrementValue=%d, j=%d\n", postIncrementValue, j);

		int k=20;
		System.out.print("k="+k);
		int preDecrementValue = --k;
		System.out.printf(", preDecrementValue=%d, k=%d", preDecrementValue, k);
		
		int l=20;
		System.out.print("\nl="+l);
		int postDecrementValue = l--;
		System.out.printf(", postDecrementValue=%d, l=%d\n", postDecrementValue, l);
	}
	
	static void demoShiftOperators() {
	// 1. Left Shift Operator
		int i1 = 3;
		int value1 = i1 << 1;
		int value2 = i1 << 2;
		int value3 = i1 << 3;
		System.out.printf("\n%d << 1 is %2d [ This is nothing but 3 * (2 power 1) ].\n", i1, value1);
		System.out.printf("%d << 2 is %2d [ This is nothing but 3 * (2 power 2) ].\n", i1, value2);
		System.out.printf("%d << 3 is %2d [ This is nothing but 3 * (2 power 3) ].\n", i1, value3);
  		
		int i2 = -3;
		int value4 = i2 << 1;
		int value5 = i2 << 2;
		int value6 = i2 << 3;
		System.out.printf("%d << 1 is %3d [ This is nothing but -3 * (2 power 1) ].\n", i2, value4);
		System.out.printf("%d << 2 is %3d [ This is nothing but -3 * (2 power 2) ].\n", i2, value5);
		System.out.printf("%d << 3 is %3d [ This is nothing but -3 * (2 power 3) ].\n", i2, value6);
		
	// 2. Right Shift Operator
		int j1 = 8;
		int value7 = j1 >> 1;
		int value8 = j1 >> 2;
		int value9 = j1 >> 3;
		System.out.printf("\n%d >> 1 is %2d [ This is nothing but 8 / (2 power 1) ].\n", j1, value7);
		System.out.printf("%d >> 2 is %2d [ This is nothing but 8 / (2 power 2) ].\n", j1, value8);
		System.out.printf("%d >> 3 is %2d [ This is nothing but 8 / (2 power 3) ].\n", j1, value9);
		
		int j2 = -8;
		int value10 = j2 >> 1;
		int value11= j2 >> 2;
		int value12 = j2 >> 3;
		System.out.printf("%d >> 1 is %3d [ This is nothing but -8 / (2 power 1) ].\n", j2, value10);
		System.out.printf("%d >> 2 is %3d [ This is nothing but -8 / (2 power 2) ].\n", j2, value11);
		System.out.printf("%d >> 3 is %3d [ This is nothing but -8 / (2 power 3) ].\n", j2, value12);
		
	// 3. Unsigned Right Shift Operator
		int k1 = 8;
		int value13 = k1 >>> 1;
		int value14 = k1 >>> 2;
		int value15 = k1 >>> 3;
		System.out.printf("\n%d >>> 1 is %2d [ This is nothing but 8 / (2 power 1) ].\n", k1, value13);
		System.out.printf("%d >>> 2 is %2d [ This is nothing but 8 / (2 power 2) ].\n", k1, value14);
		System.out.printf("%d >>> 3 is %2d [ This is nothing but 8 / (2 power 3) ].\n", k1, value15);
		
		int k2 = -8;
		int value16 = j2 >>> 1;
		int value17 = j2 >>> 2;
		int value18 = j2 >>> 3;
		System.out.printf("%d >>> 1 is %3d [ This is always positive ].\n", k2, value16);
		System.out.printf("%d >>> 2 is %3d [ This is always positive ].\n", k2, value17);
		System.out.printf("%d >>> 3 is %3d [ This is always positive ].\n", k2, value18);
		
	// 4. <<=, >>=, >>>= operator
		int m1 = 3;
		m1 <<= 3;
		m1 >>= 3;
		m1 >>>= 3;
		
	}
	
	static void demoBitwiseOperators() {
		int i = 4;
		int j = 5;
		
		int bitwiseAnd = i & j;
		int bitwiseOr = i | j;
		int bitwiseComplement = ~j;
		int bitwiseXor = i^j;
		
		System.out.printf("\nBitwise And of %d, %d yields %d", i,j,bitwiseAnd);
		System.out.printf("\nBitwise Or of %d, %d yields %d", i,j,bitwiseOr);
		System.out.printf("\nBitwise Complement of %d yields %d", j,bitwiseComplement);
		System.out.printf("\nBitwise Xor of %d, %d yields %d", i,j,bitwiseXor);
	}
	
	static void demoShortCiruitOperators() {
		String str1 = "Hello World";
		String str2 = null;
		
		System.out.print("\n\nDemo of Short Circuit Operators && and ||.");
		System.out.print("\nIn case of &&, if the first condition is false, second condition will not be executed.");
		System.out.print("\nIn case of &, both the conditions will be executed ALWAYS.");
		System.out.print("\nIn case of ||, if the first condition is true, second condition will not be executed.");
		System.out.print("\nIn case of |, both the conditions will be executed ALWAYS.");

		if ( (str1 != null ) && (str1.length() > 5)) {
			System.out.print("\nUsing &&. str1 = "+str1);
		}
		if ( (str1 != null ) & (str1.length() > 5)) {
			System.out.print("\nUsing &. str1 = "+str1);
		}
		
		if ( (str2 != null ) && (str2.length() > 5)) {
			System.out.print("\nUsing &&. Second condition will not be executed since 1st is FALSE.");
		}
		if ( (str2 != null ) & (str2.length() > 5)) {
			System.out.print("\nUsing &. Second condition will ALSO be executed resulting in NullPointerException.");
		}
		
		
		if ( (str2 == null ) || (str2.length() > 5)) {
			System.out.print("\nUsing ||. Second condition will not be executed since 1st is TRUE.");
		}
		if ( (str2 == null ) | (str2.length() > 5)) {
			System.out.print("\nUsing |. Second condition will ALSO be executed resulting in NullPointerException.");
		}
	}

}