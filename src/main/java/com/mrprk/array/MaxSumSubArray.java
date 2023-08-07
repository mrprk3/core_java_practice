package com.mrprk.array;

public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4, -13 };
		findMaxSubArray(arr);
	}

	public static int findMaxSubArray(int[] arr) {
		int maxSum = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				maxSum = Math.max(sum, maxSum);
			}
		}
		System.out.println(maxSum);
		return maxSum;
	}

}
