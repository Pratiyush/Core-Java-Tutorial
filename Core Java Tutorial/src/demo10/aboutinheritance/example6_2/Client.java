package demo10.aboutinheritance.example6_2;

// Example 6.2 Illustrating Inheritance
// String class is a subclass of Object class
class Client {
    public static void main(String[] args) {

        String stringRef = new String("Java");                    // (1)

        System.out.println("(2): " + stringRef.getClass());       // (2)
        System.out.println("(3): " + stringRef.length());         // (3)
        Object objRef = stringRef;                                // (4)
      //System.out.println("(5): " + objRef.length());            // (5) Not OK.
        System.out.println("(6): " + objRef.equals("Java"));      // (6)
        System.out.println("(7): " + objRef.getClass());          // (7)

        stringRef = (String)objRef;                              // (8)
        System.out.println("(9): " + stringRef.equals("C++"));    // (9)
    }
}

/*
Output from the program:

(2): class java.lang.String
(3): 4
(6): true
(7): class java.lang.String
(9): false

*/