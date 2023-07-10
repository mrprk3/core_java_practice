package com.mrprk.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void printMatrix() {
		int[][] arr = { { 1, 2, 3 }, { 3, 2, 4, 6 }, { 2, 4, 5 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[] swapTwoArrayIndex(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		return arr;
	}

	public static int[] reverseArray(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		while (startIndex < endIndex) {
			swapTwoArrayIndex(arr, startIndex, endIndex);
			startIndex++;
			endIndex--;
		}
		return arr;

	}

	public static void takeMatrixInput() {
		Scanner sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] reverseArray = reverseArray(arr);
		System.out.println(Arrays.toString(reverseArray));

		int[] swapArr = swapTwoArrayIndex(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(swapArr));
		printMatrix();
	}

}
