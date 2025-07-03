package com.exceptionhandling;
import java.io.*;
public class FileRead {
	
	    
	    // Method that may throw IOException
	    public static void readFile() throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
	        String line = reader.readLine();
	        System.out.println("File content: " + line);
	        reader.close();
	    }

	    public static void main(String[] args) {
	        try {
	            readFile(); // Calling method that throws IOException
	        } catch (IOException e) {
	            System.out.println("File not found or read error: " + e.getMessage());
	        }
	    }   
}
