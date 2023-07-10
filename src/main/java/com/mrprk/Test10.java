package com.mrprk;

public class Test10 {

	/*
	 * Find the richest customer wealth ex given bellow : Input : accounts =
	 * [[1,2,3], [3,2,7]] output is 10 (1st customer has 1+2+3 and second customer
	 * has 3+2+7) [ [1, 2, 3], [4, 1, 6], [ [3, 3, 7] ] find max wealth
	 */
	public static int checkMaxWalth(int[][] arr) {
		int maxWalthCustomer = 0;
		for (int i = 0; i < arr.length; i++) {
			int maxWalth = 0;
			for (int j = 0; j < arr[i].length; j++) {
				maxWalth = maxWalth + arr[i][j];
			}
			if (maxWalth > maxWalthCustomer) {
				maxWalthCustomer = maxWalth;
			}

		}
		return maxWalthCustomer;
	}

	/*
	 * Given an int array check how many of them contain an even number of digit (ex
	 * : [12,345,2,6,7896] so o/p = 2 because 12 contains 2 digit and 7896 contain 4
	 * digit so o/p is 2 )
	 */

	public static boolean checkDegit(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}
		if (count % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int checkEvenNumberDigit(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean checkDegit = checkDegit(arr[i]);
			if (checkDegit) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// System.out.println(checkDegit(1233));
		int[][] arr = { { 1, 2, 3 }, { 4, 1, 45 }, { 3, 3, 7 } };
		int[] arr2 = { 12, 123, 4, 2, 11, 1, 4 , 23};
		 System.out.println(checkMaxWalth(arr));
		int res = checkEvenNumberDigit(arr2);
		System.out.println(res);
		// checkEvenNumberDigit(arr2);

	}

}
