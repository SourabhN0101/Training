package com.exceptionhandling;

public class MultipleException {
	    public static void main(String[] args) {
	        try {
	            int[] arr = {1, 2, 3};
	            int result = 10 / 0;           // ArithmeticException
	            System.out.println(arr[5]);    // ArrayIndexOutOfBoundsException
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic error: " + e.getMessage());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index error: " + e.getMessage());
	        }
	    }
}