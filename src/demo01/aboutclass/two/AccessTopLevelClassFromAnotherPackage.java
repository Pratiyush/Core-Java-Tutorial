package demo01.aboutclass.two;

import demo01.aboutclass.one.*;

public class AccessTopLevelClassFromAnotherPackage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TopLevelClassPublicModifier tcpm = new TopLevelClassPublicModifier();
		//The type TopLevelClassDefaultModifier is not visible
		TopLevelClassDefaultModifier tcdm = new TopLevelClassDefaultModifier();

	}

}
