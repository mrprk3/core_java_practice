package com.mrprk;

import java.util.Arrays;

public class Girmiti {
	public static void main(String[] args) {
		int[] arr3 = { 1, 3, 5, 7, 8, 9, 13, 16 };
		int[] arr4 = { 23, 21, 19, 15, 11, 8, 5, 3, 1 };
		int res = findCeilingNum(arr3, 2);
		// System.out.println(res);

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };

		double ress = checkMedianArray(arr1, arr2);
		System.out.println("Median of Two Sorted Arrays : " + ress);
	}

	// Median of Two Sorted Arrays
	public static double checkMedianArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[(arr1.length) + (arr2.length)];
		int i = 0;
		int j = 0;
		int k = 0;
		while (k != arr3.length) {
			if (i < arr1.length) {
				arr3[k] = arr1[i];
				k++;
				i++;
			}
			if (j < arr2.length) {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		Arrays.sort(arr3);
		System.out.println("Sorted Array : " + Arrays.toString(arr3));
		if ((arr3.length) % 2 != 0) {
			int mid = arr3.length / 2;
			System.out.println("Mid : " + mid);
			return arr3[mid];
		}
		if ((arr3.length) % 2 == 0) {
			// arr3.length/2 = 6
			int secondMiddle = (arr3.length) / 2;
			int firstMiddle = secondMiddle - 1;
			float median = (arr3[secondMiddle] + arr3[firstMiddle]) / 2.0f;
			return median;
		}
		return -1;
	}

	/*
	 * Ceiling of a number explations given bellow int [] arr = {1,
	 * 3,5,7,8,9,13,16}for example input is 3 then ottput is 3, let suppose input is
	 * 4 the check the 4 is present or not if not present then which is next
	 * smallest number answer will be 5 because 5,7,8,9,13,16 is bigger than 4 and
	 * among of those 5 is smallest
	 */

	public static int findCeilingNum(int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		boolean checkArrayOrder = arr[0] < arr[arr.length - 1];
		while (start <= end) {
			if (arr[mid] == num) {
				return arr[mid];
			}
			if (checkArrayOrder == true) {
				if (num > arr[mid]) {
					start = mid + 1;
				}
				if (num < arr[mid]) {
					end = mid - 1;
				}
			} else {
				if (num > arr[mid]) {
					end = mid - 1;
				}
				if (num < arr[mid]) {
					start = mid + 1;
				}
			}
			mid = (start + end) / 2;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				return arr[i];
			}
		}
		return -1;
	}

}
