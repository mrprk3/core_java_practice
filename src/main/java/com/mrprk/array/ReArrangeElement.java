package com.mrprk.array;

import java.util.Arrays;

public class ReArrangeElement {
	public static void main(String[] args) {
		int[] arr = { 3, 1, -2, -5, 2, -4 };
		System.out.println(Arrays.toString(reArrangeElement(arr)));

	}


	public static int[] reArrangeElement(int[] arr) {
		int[] res = new int[arr.length];
		int positive = 0;
		int negative = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				res[positive] = arr[i];
				positive = positive + 2;
			} else {
				res[negative] = arr[i];
				negative = negative + 2;
			}
		}
		return res;
	}

}
