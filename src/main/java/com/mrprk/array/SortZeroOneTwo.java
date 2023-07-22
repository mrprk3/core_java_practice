package com.mrprk.array;

import java.util.Arrays;

public class SortZeroOneTwo {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 0, 0, 0 };
		System.out.println(Arrays.toString(sort(arr)));
	}

	public static int[] sort(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		while (mid <= high) {
			if (arr[mid] == 0) {
				// swap arr[low] and arr[mid], low++, mid++
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				// swap arr[mid] with arr[high] and high--
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}

		return arr;
	}

}
