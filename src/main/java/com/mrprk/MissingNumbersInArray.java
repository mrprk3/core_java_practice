package com.mrprk;

public class MissingNumbersInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 7, 9 }; // 1,2,3,4,5,6,7,8,9 ans will be 1, 4, 5, 6, 8
		findMissingNumber(arr);
	}

	public static void findMissingNumber(int[] arr) {
		int i = 1;
		int low = 0;
		int length = arr.length;
		while (low < length) {
			if (arr[low] == i) {
				low++;
			} else {
				System.out.println(i);
			}
			i++;
		} 
	}
}
