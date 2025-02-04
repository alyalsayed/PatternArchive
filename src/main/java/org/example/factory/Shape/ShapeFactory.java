package org.example.factory.Shape;

// The ShapeFactory class is responsible for creating instances of Shapes based on a given type.
public class ShapeFactory {

    // Use getShape method to get object of type Shape.
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        // Convert shapeType to uppercase to ensure case-insensitive comparison.
        switch(shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
