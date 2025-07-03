package com.filehandling;
import java.io.*;
import java.util.Scanner;
public class WriteUserInput {
	    public static void main(String[] args) {
	        try (FileWriter writer = new FileWriter("output.txt")) {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter lines (type 'exit' to stop):");

	            while (true) {
	                String input = sc.nextLine();
	                if (input.equalsIgnoreCase("exit")) break;
	                writer.write(input + "\n");
	            }

	            System.out.println("Text written to output.txt");
	        } catch (IOException e) {
	            System.out.println("Write error: " + e.getMessage());
	           
	        }
	    } 
}
