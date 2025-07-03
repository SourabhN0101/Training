//Day3

package com.training;
import java.util.Scanner;

public class Conditional3Vowel {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char ch = sc.next().toLowerCase().charAt(0);

	        if ((ch >= 'a' && ch <= 'z')) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch + " is a vowel.");
	            } else {
	                System.out.println(ch + " is a consonant.");
	            }
	        } else {
	            System.out.println("Invalid character. Please enter an alphabet.");
	        }

	        sc.close();
	    }
	}
