package demo08.aboutString;

public class StringIntern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Rakesh";
		String s2 = "Rakesh";
		String s3 = "Rakesh".intern();
		String s4 = new String("Rakesh");
		String s5 = new String("Rakesh").intern();

	
		    System.out.println( s1 == s2);  //  1. true
		    System.out.println( s1 == s3 ); //  2. true
		    System.out.println( s1 == s4 ); //  3. false
		    System.out.println( s1 == s5 ); //  4. true
		    System.out.println( s1 == s4 ); //  3. false
		    System.out.println(s1.hashCode());
		    System.out.println(s2.hashCode());
		    System.out.println(s3.hashCode());
		    System.out.println(s4.hashCode());
		    System.out.println(s5.hashCode());

	}

}
