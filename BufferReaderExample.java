package com.filehandling;
import java.io.*;
public class BufferReaderExample {
	    public static void main(String[] args) {
	        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);  // Print each line
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	    }
}
