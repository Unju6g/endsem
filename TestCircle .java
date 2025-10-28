file 1
package com.geometry;

public class Circle {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
 file 2
import com.geometry.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        double area = c.calculateArea(5.0);
        System.out.println("Area of Circle: " + area);
    }
}
