package com.oops;

public class Rectangle {
	    double length;
	    double width;

	    // Constructor to initialize length and width
	    public Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Method to calculate area
	    public double area() {
	        return length * width;
	    }

	    // Method to calculate perimeter
	    public double perimeter() {
	        return 2 * (length + width);
	    }

	    // Main method to create and test rectangle objects
	    public static void main(String[] args) {
	        Rectangle r1 = new Rectangle(21.0, 12.0);
	       

	        System.out.println("Area of Rectangl is:= " + r1.area() + ", Perimeter = " + r1.perimeter());
	       
	    }
}
