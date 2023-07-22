package com.mrprk;

import java.util.Arrays;

public class ReverseArray {
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;

	}

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 1 };
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			swap(arr, s, e);
			s = s + 1;
			e = e - 1;
		}
		System.out.println(Arrays.toString(arr));
	}

}
