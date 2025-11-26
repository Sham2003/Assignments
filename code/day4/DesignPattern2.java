package com.training.day4;

interface Shape {
    String toString();
}

class Circle implements Shape {
    @Override
    public String toString() {
        return "This is a Circle";
    }
}

class Square implements Shape {
    @Override
    public String toString() {
        return "This is a Square";
    }
}

class Rectangle implements Shape {
    @Override
    public String toString() {
        return "This is a Rectangle";
    }
}

class Triangle implements Shape {
    @Override
    public String toString() {
        return "This is a Triangle";
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                return null;
        }
    }
}

public class DesignPattern2 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        Shape square = factory.getShape("square");
        Shape rectangle = factory.getShape("rectangle");
        Shape triangle = factory.getShape("triangle ");

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(triangle);
    }
}
