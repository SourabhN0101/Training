package com.exceptionhandling;
import java.io.*;
public class FinallyBlock {
	    public static void main(String[] args) {
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader("test.txt"));
	            String line = reader.readLine();
	            System.out.println("Read line: " + line);
	        } catch (IOException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } finally {
	            // This block always runs
	            try {
	                if (reader != null) {
	                    reader.close(); // Resource closed
	                    System.out.println("Reader closed in finally block.");
	                }
	            } catch (IOException e) {
	                System.out.println("Error closing reader.");
	            }
	        }
	    }
}
