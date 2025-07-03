package com.training;

public class Array1 {
	    public static void main(String[] args) {
	        int[] arr = {12,32,54,67,89,102};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        System.out.println("Second largest element is: " + secondLargest);
	    }
	}
