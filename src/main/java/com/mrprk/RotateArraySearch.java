package com.mrprk;

public class RotateArraySearch {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 1, 2, 3 };
		System.out.println(findInd(arr,2));
	}

	public static int findInd(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (low <= mid) {// left half is sorted
				if (target >= arr[low] && target <= arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {// right half is sorted
				if (target >= arr[mid] && target <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return 0;
	}

}
