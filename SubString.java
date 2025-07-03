package com.string;

public class SubString {
	    public static void main(String[] args) {
	        String original = "My Name Is Sourabh";
	        String toReplace = "Sourabh";
	        String replacement = "Akash";

	        // Use replace() method to replace substring
	        String result = original.replace(toReplace, replacement);

	        // Output modified string
	        System.out.println("Modified string: " + result);
	    }

}
