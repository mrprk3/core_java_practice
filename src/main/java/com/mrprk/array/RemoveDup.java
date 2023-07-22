package com.mrprk.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDup {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDiplicate(arr));
	}

	public static ArrayList<Integer> removeDiplicate(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				list.add(arr[i + 1]);
			}
		}
		return list;
	}

}
