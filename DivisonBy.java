package com.exceptionhandling;

public class DivisonBy {
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 5;

	        try {
	            int result = a / b; // Will throw ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Division by zero is not allowed.");
	        }
	   }

}
