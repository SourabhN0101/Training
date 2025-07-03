package com.collectionframework;
import java.util.HashMap;
public class HashMapExample {

	    public static void main(String[] args) {
	        HashMap<Integer, String> students = new HashMap<>();

	        // Adding entries
	        students.put(101, "Sourabh");
	        students.put(102, "Akash");
	        students.put(103, "Sushant");

	        System.out.println("All Students: " + students);

	        // Retrieving a value
	        System.out.println("Student with roll 102: " + students.get(102));

	        // Removing a student
	        students.remove(101);
	        System.out.println("Removing roll 101: " + students);
	    }
}
