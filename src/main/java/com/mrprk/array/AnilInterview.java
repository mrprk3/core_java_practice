package com.mrprk.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnilInterview {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 6, 5, 8, 7, 10 };
		System.out.println(findMissingNum(arr));
		String ss = "aaaabbbcd";
		solution(ss);

	}

	public static int findMissingNum(int[] arr) {
		int actual = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			actual = actual + arr[i];
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max * (max + 1) / 2 - actual;
	}

	public static String solution(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				Integer count = map.get(arr[i]);
				map.put(arr[i], count + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Entry<Character, Integer> m : map.entrySet()) {
			System.out.print(m.getKey() + "" + m.getValue());
		}
		return null;
	}
}
