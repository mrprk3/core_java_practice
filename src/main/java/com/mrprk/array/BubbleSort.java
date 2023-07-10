package com.mrprk.array;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 8, 9, 7, 5, 6, 3, 2, 4, 1 };
		System.out.println(Arrays.toString(bubbleSort(arr)));
	}
	public static int[] bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
