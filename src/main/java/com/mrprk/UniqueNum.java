package com.mrprk;

public class UniqueNum {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };

		int[] arr2 = { 1, 2, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7 };

		System.out.println(getuniqueNo(arr2));

	}

	public static int getuniqueNo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[i + 1]) {
				return arr[i];
			}
		}
		return -1;
	}

}
