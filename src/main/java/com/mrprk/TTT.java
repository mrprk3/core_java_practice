package com.mrprk;

public class TTT {
	public static void main(String[] args) {
// Define the size of the pattern
		int size = 5;
// Create a 2D array to store the pattern
		int[][] pattern = new int[size][size];
// Fill the array with 0s and 1s according to the pattern
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
// The middle row and column are filled with 1s
				if (i == size / 2 || j == size / 2) {
					pattern[i][j] = 1;
				}
// The diagonal elements are filled with 1s
				else if (i == j || i + j == size - 1) {
					pattern[i][j] = 1;
				}
// The rest are filled with 0s
				else {
					pattern[i][j] = 0;
				}
			}
		}
// Print the array
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(pattern[i][j] + " ");
			}
			System.out.println();
		}
	}
}
