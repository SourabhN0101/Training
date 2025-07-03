//day3

package com.training;
import java.util.Scanner;

public class Conditional1 {
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: "); //input1
	        int a = sc.nextInt();

	        System.out.print("Enter second number: "); //input 2
	        int b = sc.nextInt();

	        System.out.print("Enter third number: ");  //input3
	        int c = sc.nextInt();

	        if (a >= b && a >= c) {
	            System.out.println("Largest number is: " + a);
	        } else if (b >= a && b >= c) {
	            System.out.println("Largest number is: " + b);
	        } else {
	            System.out.println("Largest number is: " + c);
	        }

	        sc.close();
	    }
	}
