package com.mrprk;

public class PickElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 15, 12, 11, 10 };
		System.out.println(findPickElement(arr));
	}

	public static int findPickElement(int[] arr) {
		int low = 1;
		int high = arr.length - 2;
		if (arr.length == 1) {
			return arr[0];
		}
		if (arr[0] > arr[1]) {
			return arr[0];
		}
		if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr[arr.length - 1];
		}
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return arr[mid];
			}
			// check increasing order
			if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
}
