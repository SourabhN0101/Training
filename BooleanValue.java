//Day2

package com.training;
import java.util.Scanner;
public class BooleanValue {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        //boolean input
	        System.out.print("Are you a student? (true/false): ");
	        boolean isStudent = sc.nextBoolean();

	        // Print message 
	        if (isStudent) {
	            System.out.println("Welcome, student!");
	        } else {
	            System.out.println("Welcome, guest!");
	        }

	        sc.close();
	    }
	}
