package com.training;
import java.util.Scanner;
public class Typecasting {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Enter double value
	        System.out.print("Enter a double value: ");
	        double doubleValue = sc.nextDouble();

	        // Convert to int
	        int intValue = (int) doubleValue;

	        // Print values
	        System.out.println("Double value: " + doubleValue);
	        System.out.println("Converted to Integer: " + intValue);

	        sc.close();
	    }
	}
