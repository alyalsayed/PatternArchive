package org.example.factory.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        if (shape1 != null) {
            shape1.draw();  // Output: Drawing a Circle.
        }

        // Get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        if (shape2 != null) {
            shape2.draw();  // Output: Drawing a Rectangle.
        }

        // Get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");
        if (shape3 != null) {
            shape3.draw();  // Output: Drawing a Square.
        }
    }
}
