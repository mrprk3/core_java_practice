package com.mrprk;

public class UpperBoundLowerBound {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 12, 34, 56, 61 };
		System.out.println(searchUpperBound(arr, 50));
	}

	public static int searchUpperBound(int[] arr, int target) {
		int ans = -1;
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > target) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public static int searchLowerBound(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] >= target) {
				ans = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

}
