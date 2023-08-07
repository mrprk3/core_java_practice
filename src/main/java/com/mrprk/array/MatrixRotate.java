package com.mrprk.array;

// Rotate the matrix 90 degree
public class MatrixRotate {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		rotateMatrix(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rotateMatrix(int[][] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i].length - 1);
				int end = arr[i].length - 1;// 3
				int start = 0;
				while (start < end) {
					int temp = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = temp;
					start++;
					end--;
				}
			}
		}
	}

}
