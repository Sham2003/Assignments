package com.training.day8;


public interface Shape {
 double area();
}


class Circle implements Shape {
 private final double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}


class Rectangle implements Shape {
 private final double width;
 private final double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double area() {
     return width * height;
 }
}

class Square implements Shape {
 private final double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 public double area() {
     return side * side;
 }
}

