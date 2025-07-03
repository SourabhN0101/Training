package com.oops;

public class Book {
	    String title;
	    String author;
	    double price;

	    // Constructor to initialize all fields
	    public Book(String title, String author, double price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Method to display book details
	    public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price:" +" ₹" + price);
	        System.out.println("------------------------");
	    }

	    // Main method to create and display multiple books
	    public static void main(String[] args) {
	        Book b1 = new Book("Marathi", "Akash Patil", 229.29);
	        Book b2 = new Book("Hindi", "Omkar Desai", 639.34);
	        Book b3 = new Book("English", "Sushant Bhosale",290.98);

	        // Display details
	        b1.displayDetails();
	        b2.displayDetails();
	        b3.displayDetails();
	    }

}
