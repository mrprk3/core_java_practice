package com.mrprk.sorting;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int[] left = { 1, 5, 6 };
		int[] right = { 0,2, 4, 7 };
		int[] arr = new int[(left.length) + (right.length)];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			} else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;
		}
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
