package com.filehandling;
import java.io.*;
import java.util.Scanner;

public class WordCountExample {
	    public static void main(String[] args) {
	        int wordCount = 0;

	        try (Scanner sc = new Scanner(new File("sample.txt"))) {
	            while (sc.hasNext()) {
	                sc.next();
	                wordCount++;
	            }

	            System.out.println("Total words: " + wordCount);
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	        }
	    }
}
