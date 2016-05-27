package demo10.aboutinheritance.example6_3;

// Example 6.3 Overriding, Overloading, and Hiding
// Exceptions
class InvalidHoursException extends Exception {}
class NegativeHoursException extends InvalidHoursException {}
class ZeroHoursException extends InvalidHoursException {}
class Light {

    protected String billType = "Small bill";     // (1)

    protected double getBill(int noOfHours)
              throws InvalidHoursException {      // (2)
        if (noOfHours < 0)
            throw new NegativeHoursException();
        double smallAmount = 10.0,
               smallBill = smallAmount * noOfHours;
        System.out.println(billType + ": " + smallBill);
        return smallBill;
    }

    public static void printBillType() {          // (3)
        System.out.println("Small bill");
    }

}

class TubeLight extends Light {

    public static String billType = "Large bill"; // (4) Hiding static field.

    public double getBill(final int noOfHours)
           throws ZeroHoursException {     // (5) Overriding instance method.
        if (noOfHours == 0)
            throw new ZeroHoursException();
        double largeAmount = 100.0,
               largeBill = largeAmount * noOfHours;
        System.out.println(billType + ": " + largeBill);
        return largeBill;
    }

    public static void printBillType() {          // (6) Hiding static method.
        System.out.println(billType);
    }

    public double getBill() {                     // (7) Overloading method.
        System.out.println("No bill");
        return 0.0;
    }
}

public class Client {
    public static void main(String[] args)
            throws InvalidHoursException {        // (8)

        TubeLight tubeLight = new TubeLight();    // (9)
        Light     light1    = tubeLight;          // (10) Aliases.
        Light     light2    = new Light();        // (11)

        System.out.println("Invoke overridden instance method:");
        tubeLight.getBill(5);                     // (12) Invokes method at (5)
        light1.getBill(5);                        // (13) Invokes method at (5)
        light2.getBill(5);                        // (14) Invokes method at (2)
        System.out.println("Access hidden field:");
        System.out.println(tubeLight.billType);   // (15) Accesses field at (4)
        System.out.println(light1.billType);      // (16) Accesses field at (1)
        System.out.println(light2.billType);      // (17) Accesses field at (1)

        System.out.println("Invoke hidden static method:");
        tubeLight.printBillType();                // (18) Invokes method at (6)
        light1.printBillType();                   // (19) Invokes method at (3)
        light2.printBillType();                   // (20) Invokes method at (3)

        System.out.println("Invoke overloaded method:");
        tubeLight.getBill();                      // (21) Invokes method at (7)
    }
}

/*
Output from the program:

Invoke overridden instance method:
Large bill: 500.0
Large bill: 500.0
Small bill: 50.0
Access hidden field:
Large bill
Small bill
Small bill
Invoke hidden static method:
Large bill
Small bill
Small bill
Invoke overloaded method:
No bill
*/
