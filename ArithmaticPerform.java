//Day2
package com.training;
import java.util.Scanner;
public class ArithmaticPerform {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Enter two number
	        System.out.print("Enter first number: ");
	        int num1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = sc.nextInt();

	        //Perform operations
	        int sum = num1 + num2;
	        int diff = num1 - num2;
	        int prod = num1 * num2;
	        int quotient = num1 / num2;
	        int remainder = num1 % num2;

	        //results
	        System.out.println("Sum: " + sum);
	        System.out.println("Difference: " + diff);
	        System.out.println("Product: " + prod);
	        System.out.println("Quotient: " + quotient);
	        System.out.println("Remainder: " + remainder);

	        sc.close();
	    }
	}
