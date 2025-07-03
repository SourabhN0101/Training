package com.filehandling;
import java.io.*;
public class TryCatchResources {
	    public static void main(String[] args) {
	        // Auto-closes BufferedReader after try block
	        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);  // Print each line
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
}
