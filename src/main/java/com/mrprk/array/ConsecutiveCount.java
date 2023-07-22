package com.mrprk.array;

public class ConsecutiveCount {
	public static void main(String[] args) {
		int[] arr = { 99, 101, 102, 3, 4, 5, 6, 7, 8, 9, 101, 1, 2, 9, 10, 11, 12, 13, 14 };
		System.out.println(findMaxConsecutiveCount(arr));

	}

	public static int findMaxConsecutiveCount(int[] arr) {
		int nextSmall = -10000;
		int count = 0;
		int maxLength = 1;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i] - 1 == nextSmall) {
				count = count + 1;
				nextSmall = arr[i];
			} else if (arr[i] != nextSmall) {
				nextSmall = arr[i];
				count = 1;
			}
			maxLength = Math.max(maxLength, count);
		}
		return maxLength;
	}

}
