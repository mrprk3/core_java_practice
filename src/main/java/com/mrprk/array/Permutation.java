package com.mrprk.array;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		findPermutation(arr, 0);
	}

	public static void findPermutation(int[] arr, int fi) {
		if (fi == arr.length - 1) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = fi; i < arr.length; i++) {
			swap(arr, fi, i);
			findPermutation(arr, fi + 1);
			swap(arr, fi, i);

		}

	}

	private static void swap(int[] arr, int fi, int i) {
		int temp = arr[fi];
		arr[fi] = arr[i];
		arr[i] = temp;
	}

}
