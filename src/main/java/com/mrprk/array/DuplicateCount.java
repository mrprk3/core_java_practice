package com.mrprk.array;

public class DuplicateCount {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2, 3, 3, 4, 5, 5 };
		System.out.println(countDuplicate(arr));
	}

	public static int countDuplicate(int[] arr) {
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j = j + 1;
				arr[j] = arr[i];
			}
		}

		return j;
	}

}
