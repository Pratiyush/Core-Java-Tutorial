package demo10.aboutinheritance.example6_4;

// Example 6.4 Overloaded Method Resolution
class Light { /* ... */ }

class TubeLight extends Light { /* ... */ }

public class OverloadResolution {
    boolean testIfOn(Light aLight)         { return true; }    // (1)
    boolean testIfOn(TubeLight aTubeLight) { return false; }   // (2)
    public static void main(String[] args) {

        TubeLight tubeLight = new TubeLight();
        Light     light     = new Light();
        Light     light1    = new TubeLight();

        OverloadResolution client = new OverloadResolution();
        System.out.println(client.testIfOn(tubeLight));// (3) ==> method at (2)
        System.out.println(client.testIfOn(light));    // (4) ==> method at (1)
    }
}

/*
Output from the program:

false
true

*/
