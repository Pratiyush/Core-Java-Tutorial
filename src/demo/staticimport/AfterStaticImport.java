package demo.staticimport;

import static java.lang.System.*; // Static import on the System class's out object
import static java.lang.Integer.*; // Static import of ALL the static members of the class 

public class AfterStaticImport {
	public static void main(String[] args) {
		System.out.println(MAX_VALUE);
		out.println(toHexString(26));
	}
}
