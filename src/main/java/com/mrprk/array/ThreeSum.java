package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		int arr[] = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2 };
		System.out.println(findThreeSum(arr));
	}

	public static List<List<Integer>> findThreeSum(int[] arr) {
		List<List<Integer>> ll = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				ArrayList<Integer> list = new ArrayList<>();
				int sum = arr[i] + arr[j] + arr[k];
				if (sum > 0) {
					k--;
				} else if (sum < 0) {
					j++;
				} else {
					list.add(arr[i]);
					list.add(arr[j]);
					list.add(arr[k]);
					ll.add(list);
					j++;
					k--;
					while (j < k && arr[j] == arr[j - 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k + 1]) {
						k--;
					}
				}
			}
		}
		return ll;
	}

}
