package com.mrprk.tp;

public class Main {
	public static void main(String[] args) {
		int largest = 0;
		int secondLargest = 0;
		int[] arr = { 1, 4, 3, 2, 5, 6, 12, 15, 14 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else {
				if (arr[i] < largest && arr[i] > secondLargest) {
					secondLargest = arr[i];
				}
			}
		}
		//System.out.println(secondLargest);

		int[] arr1 = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		String str = "AAT";

		System.out.println(findSinglrReapeatedString(str));
	}
	
	
	//================================================================================

	public static int findSingleNumReapeated(int[] arr1) {
		int res = 0;
		for (int i = 0; i < arr1.length; i++) {
			res = res ^ arr1[i];
		}
		return res;
	}
	
	//================================================================================

	public static char findSinglrReapeatedString(String str) {
		char[] charArr = str.toCharArray();
		int res = 0;
		for (int i = 0; i < charArr.length; i++) {
			res = res ^ charArr[i];
		}
		return (char) res;  // M
	}
}
