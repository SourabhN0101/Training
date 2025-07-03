package com.polymorphism;

//Interface definition
interface Shape {
 double area();
 double perimeter();
}

//Circle class implementing Shape
class Circle implements Shape {
 double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 public double area() {
     return Math.PI * radius * radius;
 }

 public double perimeter() {
     return 2 * Math.PI * radius;
 }
}

//Rectangle class implementing Shape
class Rectangle implements Shape {
 double length, width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 public double area() {
     return length * width;
 }

 public double perimeter() {
     return 2 * (length + width);
 }
}

//Main class
public class ShapeDemo {
 public static void main(String[] args) {
     Shape circle = new Circle(4);
     Shape rectangle = new Rectangle(5, 3);

     System.out.println("Circle Area: " + circle.area());
     System.out.println("Circle Perimeter: " + circle.perimeter());

     System.out.println("Rectangle Area: " + rectangle.area());
     System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
 }
}

