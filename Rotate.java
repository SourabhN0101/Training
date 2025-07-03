package com.array;

public class Rotate {
	    public static void main(String[] args) {
	        // Define a square 2D matrix
	        int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int n = matrix.length; // Size of matrix (n x n)

	        // Step 1: Transpose the matrix
	        // Swap matrix[i][j] with matrix[j][i]
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int temp = matrix[i][j];
	                matrix[i][j] = matrix[j][i];
	                matrix[j][i] = temp;
	            }
	        }

	        // Step 2: Reverse each row
	        // For each row, swap start and end elements
	        for (int i = 0; i < n; i++) {
	            int start = 0;
	            int end = n - 1;
	            while (start < end) {
	                int temp = matrix[i][start];
	                matrix[i][start] = matrix[i][end];
	                matrix[i][end] = temp;
	                start++;
	                end--;
	            }
	        }

	        // Print the rotated matrix
	        System.out.println("Matrix after 90-degree clockwise rotation:");
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println(); // Move to next line
	        }
	    }
}
