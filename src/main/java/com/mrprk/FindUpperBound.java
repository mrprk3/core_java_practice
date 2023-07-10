package com.mrprk;

public class FindUpperBound {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 10, 11, 17, 80, 91 };
		int res = findLpperBoundNum(arr, 20);
		System.out.println(res);

	}

	public static int findLpperBoundNum(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;
		int res = arr.length;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] >= num) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	public static int findLowerBoundNum(int[] arr, int num) {
		int res = arr.length;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= num) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

}
