package demo10.aboutinheritance.example6_14;
// Example 6.14 Polymorphism and Dynamic Method Lookup
interface IDrawable {
    void draw();
}

class Shape implements IDrawable {
    public void draw() { System.out.println("Drawing a Shape."); }
}

class Circle extends Shape {
    public void draw() { System.out.println("Drawing a Circle."); }
}

class Rectangle extends Shape {
    public void draw() { System.out.println("Drawing a Rectangle."); }
}

class Square extends Rectangle {
    public void draw() { System.out.println("Drawing a Square."); }
}

class Map implements IDrawable {
    public void draw() { System.out.println("Drawing a Map."); }
}

public class PolymorphRefs {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Rectangle(), new Square()};   // (1)
        IDrawable[] drawables = {new Shape(), new Rectangle(), new Map()};// (2)

        System.out.println("Draw shapes:");
        for (int i = 0; i < shapes.length; i++)                           // (3)
            shapes[i].draw();

        System.out.println("Draw drawables:");
        for (int i = 0; i < drawables.length; i++)                        // (4)
            drawables[i].draw();
    }
}

/*
Output from the program:

Draw shapes:
Drawing a Circle.
Drawing a Rectangle.
Drawing a Square.
Draw drawables:
Drawing a Shape.
Drawing a Rectangle.
Drawing a Map.
*/