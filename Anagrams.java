package com.string;
import java.util.Arrays;
public class Anagrams {
		    public static void main(String[] args) {
	        String str1 = "race";
	        String str2 = "care";

	        // Convert both strings to lowercase and char arrays
	        char[] arr1 = str1.toLowerCase().toCharArray();
	        char[] arr2 = str2.toLowerCase().toCharArray();

	        // Sort both arrays
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        if (Arrays.equals(arr1, arr2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }
}
