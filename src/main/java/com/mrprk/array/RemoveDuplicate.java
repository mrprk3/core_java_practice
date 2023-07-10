package com.mrprk.array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7 };
		removeDuplicate(arr);
	}

	public static void removeDuplicate(int[] arr) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
