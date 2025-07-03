package com.collectionframework;
import java.util.HashSet;
public class HashSet1 {
	
	    public static void main(String[] args) {
	        HashSet<String> names = new HashSet<>();

	        // Adding elements including duplicates
	        names.add("Alice");
	        names.add("Bob");
	        names.add("Charlie");
	        names.add("Alice"); // Duplicate
	        names.add("Bob");   // Duplicate

	        // Print set
	        System.out.println("HashSet Value Without Dupicate: " + names);
	    }
}
