package com.mrprk;

import java.util.ArrayList;
import java.util.List;

public class ArrayExampleLeetcode {

	public static void main(String[] args) {
		int[] arr1 = { 1,2,3 };
		int[] arr2 = { 1,1,2};
		solution(arr1, arr2, 3);
	}

	public static List<List<Integer>> solution(int[] arr1, int[] arr2, int k) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				String res = "[" + arr1[i] + "," + arr2[j] + "]";
				list.add(res);
			}
		}
		System.out.println(list.subList(0, k));
		return null;
	}
}
