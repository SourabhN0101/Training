package com.collectionframework;
import java.util.ArrayList;

public class arrayList {
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding elements
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);
	        numbers.add(40);

	        System.out.println("Original List: " + numbers);

	        // Removing a specific value (e.g., 20)
	        numbers.remove(Integer.valueOf(20));

	        // Print updated list
	        System.out.println("After removing 30: " + numbers);
	    }
}
