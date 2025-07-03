package com.array;

public class SecondLarNum {
	    public static void main(String[] args) {
	        int[] arr = {12,56,32,89,01};

	        // Initialize largest and secondLargest with minimum value
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        // Loop through each element
	        for (int num : arr) {
	            // If current number is greater than largest
	            if (num > largest) {
	                secondLargest = largest; // Update secondLargest
	                largest = num; // Update largest
	            }
	            // If current number is not largest but greater than secondLargest
	            else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        // Output
	        System.out.println("Second largest element: " + secondLargest);
	    }
	}

