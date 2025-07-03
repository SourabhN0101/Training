package com.inheritance;

public class ConstuctorChaining {
	    String name;
	    int age;

	    // Constructor 1
	    public ConstuctorChaining() {
	        this("Unknown", 0); // Call Constructor 2
	    }

	    // Constructor 2
	    public ConstuctorChaining(String name) {
	        this(name, 18); // Call Constructor 3
	    }

	    // Constructor 3
	    public ConstuctorChaining(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display info
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }

	    // Main method
	    public static void main(String[] args) {
	    	ConstuctorChaining s1 = new ConstuctorChaining();
	    	ConstuctorChaining s2 = new ConstuctorChaining("Sourabh");
	    	ConstuctorChaining s3 = new ConstuctorChaining("Sushant", 24);

	        s1.display();
	        s2.display();
	        s3.display();
	    }
	}
