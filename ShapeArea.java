
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    void calculateArea() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

class Triangle extends Shape {
    double base = 8;
    double height = 6;

    void calculateArea() {
        System.out.println("Triangle Area: " + (0.5 * base * height));
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.calculateArea();

        s = new Rectangle();
        s.calculateArea();

        s = new Triangle();
        s.calculateArea();
    }
}

