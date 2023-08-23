package com.mrprk;

public class UpperAndLowerBound {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 60;
		System.out.println(findLowerBound(arr, 5, target));
	}

	public static int findLowerBound(int[] arr, int n, int target) {
		int low = 0;
		int high = n - 1;
		int res = n;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= target) {
				res = arr[mid];
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return res;
	}

	public static int findUpperBound(int[] arr, int n, int target) {
		int low = 0;
		int high = n - 1;
		int res = n;
		return 0;
	}

}
