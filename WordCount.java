package com.string;

public class WordCount {
	    public static void main(String[] args) {
	        String sentence = "Hey, My name is Sourabh";

	        // Split the sentence by spaces into words
	        String[] words = sentence.trim().split("\\s+");  //split("\\s+") splits the sentence by one or more spaces

	        // Count is the length of the array
	        System.out.println("Number of words: " + words.length);
	    }
}
