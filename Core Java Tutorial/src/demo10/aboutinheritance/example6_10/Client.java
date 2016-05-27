package demo10.aboutinheritance.example6_10;

// Example 6.10 Variables in Interfaces
interface Constants {
    double PI_APPROXIMATION = 3.14;
    String AREA_UNITS = " sq.cm.";
    String LENGTH_UNITS = " cm.";
}

public class Client implements Constants {
    public static void main(String[] args) {
        double radius = 1.5;
        System.out.println("Area of circle is " +
                           (PI_APPROXIMATION*radius*radius) +
                           AREA_UNITS);             // (1) Direct access.
        System.out.println("Circumference of circle is " +
                           (2*Constants.PI_APPROXIMATION*radius) +
                           Constants.LENGTH_UNITS); // (2) Fully qualified name.
    }
}

/*
Output from the program:

Area of circle is 7.0649999999999995 sq.cm.
Circumference of circle is 9.42 cm.
*/
