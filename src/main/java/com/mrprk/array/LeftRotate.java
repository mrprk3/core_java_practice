package com.mrprk.array;

import java.util.Arrays;

// Given an array you have to left rotate by n number
//1, 2, 3, 4, 5, 6, 7, 8, 9   n = 3
// 3,2,1  9,8,7,6,5,4 => 4,5,6,7,8,9,2,3,
//4, 5, 6, 7, 8, 9, 1, 2, 3
public class LeftRotate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(leftRotateByN(arr,1)));
	}

	public static int[] leftRotateByN(int[] arr, int n) {
		reverseArr(arr, 0, n - 1);
		reverseArr(arr, n, arr.length - 1);
		reverseArr(arr, 0, arr.length - 1);
		return arr;
	}

	public static int[] reverseArr(int[] arr, int index1, int index2) {
		while (index1 <= index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			index1++;
			index2--;
		}
		return arr;
	}
}
