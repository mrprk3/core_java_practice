package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SingleNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		for (int i = 0; i < arr.length; i++) {
			if (checkCount(arr, arr[i]) == 1) {
				System.out.println(arr[i]);
			}
		}

		mergeArr(arr, arr2);
	}

	public static int checkCount(int[] arr, int num) {
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if (num == arr[j]) {
				count = count + 1;
			}
		}
		return count;
	}

	public static int[] mergeArr(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 0) {
				list.add(arr1[i]);
			}
		}
		for (int j = 0; j < arr2.length; j++) {
			if (arr2[j] != 0) {
				list.add(arr2[j]);
			}
		}
		return null;
	}

}
