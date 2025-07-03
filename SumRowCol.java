package com.array;

public class SumRowCol {

	    public static void main(String[] args) {
	        // Define a 2D array
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int rows = matrix.length; // Number of rows
	        int cols = matrix[0].length; // Number of columns

	        // Loop for row sums
	        for (int i = 0; i < rows; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < cols; j++) {
	                rowSum += matrix[i][j]; // Add each element in the row
	            }
	            System.out.println("Sum of row " + i + ": " + rowSum);
	        }

	        // Loop for column sums
	        for (int j = 0; j < cols; j++) {
	            int colSum = 0;
	            for (int i = 0; i < rows; i++) {
	                colSum += matrix[i][j]; // Add each element in the column
	            }
	            System.out.println("Sum of column " + j + ": " + colSum);
	        }
	    }
}