package com.string;

public class FirstCaptial {
	    public static void main(String[] args) {
	        String sentence = "hey my name is sourabh";

	        // Split the sentence into words
	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();

	        // Loop through each word
	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter + rest of the word
	                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
	                result.append(capitalized).append(" ");
	            }
	        }

	        // Output the formatted sentence
	        System.out.println("Capitalized sentence: " + result.toString().trim());
	    }

}
