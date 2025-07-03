package com.oops;

public class OverloadedConstructor {
	    double length;
	    double width;

	    // Constructor 1: With parameters
	    public OverloadedConstructor(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Constructor 2: No parameters (default rectangle)
	    public OverloadedConstructor() {
	        this.length = 12.0;
	        this.width = 12.0;
	    }

	    public double area() {
	        return length * width;
	    }

	    public static void main(String[] args) {
	    	OverloadedConstructor r1 = new OverloadedConstructor(4.0, 6.0); // Parameterized constructor
	    	OverloadedConstructor r2 = new OverloadedConstructor();         // Default constructor

	        System.out.println("Area of r1: " + r1.area());
	        System.out.println("Area of r2 (default): " + r2.area());
	    }
}
