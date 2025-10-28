// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract double calculatePerimeter();
}

// Subclass for Square
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    // Implement abstract method
    double calculatePerimeter() {
        return 4 * side;
    }
}

// Subclass for Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main class to test
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Square(5);
        Shape s2 = new Circle(3);

        System.out.println("Perimeter of Square: " + s1.calculatePerimeter());
        System.out.println("Perimeter of Circle: " + s2.calculatePerimeter());
    }
}
