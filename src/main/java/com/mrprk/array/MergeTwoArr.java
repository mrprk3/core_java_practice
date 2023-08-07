package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArr {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 0, 0, 0 };
		int n = 3;
		int[] arr2 = { 2, 5, 6 };
		int m = 3;
		System.out.println(Arrays.toString(solution(arr1, m, arr2, n)));

	}

	public static int[] solution(int[] arr1, int m, int[] arr2, int n) {
		int left = m-1;
		int right = n - 1;
		int k = m+n - 1;
		while (left >= 0 && right >= 0) {
			if (arr1[left] > arr2[right]) {
				arr1[k] = arr1[left];
				k--;
				left--;
			} else {
				arr1[k] = arr2[right];
				k--;
				right--;
			}
		}
		while (left >= 0)

		{
			arr1[k] = arr1[left];
			k--;
			left--;
		}
		while (right >=0) {
			arr1[k] = arr2[right];
			k--;
			right--;
		}
		return arr1;
	}

	public static int[] sol(int[] arr1, int[] arr2) {
		int left = arr1.length - 1;
		int right = 0;
		while (left > 0 && right < arr2.length) {
			if (arr1[left] > arr2[right]) {
				int temp = arr1[left];
				arr1[left] = arr2[right];
				arr2[right] = temp;
			} else {
				break;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr1.length + arr2.length; i++) {
			if (i < arr1.length) {
				if (arr1[i] != 0) {
					list.add(arr1[i]);
				}
			} else {
				list.add(arr2[i - arr1.length]);
			}
		}
		System.out.println(list);

		return null;
	}

}
