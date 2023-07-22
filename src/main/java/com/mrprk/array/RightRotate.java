package com.mrprk.array;

public class RightRotate {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = 5;
		if (n > arr.length) {
			n = n % arr.length;
		}
	}

	public static int[] rightRotateByN(int[] arr, int n) {
		reverseArr(arr, 0, arr.length - (n + 1));
		reverseArr(arr, arr.length - n, arr.length - 1);
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
