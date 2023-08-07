package com.mrprk;

import java.util.ArrayList;

public class SprialMatrix {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(printSprialMatrix(arr));

	}

	public static ArrayList<Integer> printSprialMatrix(int[][] matrix) {
		ArrayList<Integer> list = new ArrayList<>();
		int left = 0;
		int top = 0;
		int right = matrix[top].length - 1;
		int bottom = matrix.length - 1;
		while (left <= right && top <= bottom) {
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			for (int i = right; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			bottom--;
			for (int i = bottom; i >= top; i--) {
				list.add(matrix[i][left]);
			}
			left++;
		}
		return list;
	}
}
