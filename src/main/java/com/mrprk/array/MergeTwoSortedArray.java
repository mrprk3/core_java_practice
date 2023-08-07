package com.mrprk.array;

import java.util.Arrays;

public class MergeTwoSortedArray {
	public static void main(String[] args) {
		long[] arr1 = { 13, 17, 18, 19, 20, 22, 22, 27, 36, 39, 46, 48, 50 };
		long[] arr2 = { 4, 12, 45 };
		merge(arr1,arr2);

	}

	public static void merge(long arr1[], long arr2[]) {
		int left = arr1.length - 1;
		int right = 0;
		while (left >= 0 && right <= arr2.length) {
			if (arr1[left] > arr2[right]) {
				long temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
				left--;
				right++;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	}

}
