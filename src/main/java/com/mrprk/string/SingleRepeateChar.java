package com.mrprk.string;

import java.util.HashMap;

public class SingleRepeateChar {
	public static void main(String[] args) {
		String str = "prepinsta";
		findSingleCharUsingXor(str);
	}

	public static int findSingleChar(String str) {
		HashMap<Character, Integer> count = new HashMap<>();
		char sinleRepeate = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (count.containsKey(charArray[i])) {
				Integer integer = count.get(charArray[i]);
				count.put(charArray[i], integer + 1);
			} else {
				count.put(charArray[i], 1);
			}
			if (count.get(charArray[i]) < 2) {
				sinleRepeate = charArray[i];
			}
		}
		System.out.println(count);
		System.out.println(sinleRepeate);
		return 0;
	}

	public static void findSingleCharUsingXor(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (str.lastIndexOf(arr[i]) == str.indexOf(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

}
