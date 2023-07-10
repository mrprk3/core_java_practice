package com.mrprk.string;

import java.util.HashMap;
import java.util.Map;

public class StringExample {

	public static boolean checkDuplicateChar(String str) {
		boolean val = false;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] == charArray[j]) {
					val = true;
				}
			}
		}
		return val;
	}

	public static String findMaxCombintionOfSubString(String str) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length() - 2; i++) {
			for (int j = 0; j < str.length() - 2; j++) {
				String substring = str.substring(i, i + j);
				if (!substring.isEmpty()) {
					if (!checkDuplicateChar(substring)) {
						map.put(substring, substring.length());
					}
				}
			}
		}
		int temp = 0;
		String value = "";
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (temp < m.getValue()) {
				temp = m.getValue();
				value = m.getKey();
			}
		}
		// System.out.println(value + "" + temp);
		// System.out.println(map);
		return value;
	}

	public static StringBuffer capitalizeFirstChar(String str) {
		StringBuffer sb;
		String[] arr = str.split(" ");
		sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].replace(arr[i].substring(0, 1), arr[i].substring(0, 1).toUpperCase()) + " ");
		}
		return sb;
	}

	public static int countChar(String str) {
		int count = 0;
		String[] split = str.split(" ");
		for (String s : split) {
			char[] charArray = s.toCharArray();
			count += charArray.length;
		}
		return count;
	}

	public static int countChars(String str) {
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				count = count + 1;
			}
		}
		return count;
	}

	public static String checkCharOccourance(String str1, String str2, String str3) {
		char[] charArray1 = str1.toCharArray();
		// char[] charArray2 = str2.toCharArray();
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == charArray1[i]) {
				System.out.println(str2.charAt(i));
			}
		}

		return null;
	}

//================================================================================================================================
	// string reverse approach 1
	public static String getReverse1(String str) {
		int length = str.length();
		if (length == 0) {
			return "";
		}
		return str.charAt(length - 1) + getReverse1(str.substring(0, length - 1));
	}

	// string reverse approach 2
	public static String getReverse2(String str) {
		char[] charArray = str.toCharArray();
		String rev = "";
		for (int i = charArray.length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		return rev;
	}

	// string reverse approach 3
	public static String getReverse3(String str) {
		StringBuilder sb = new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		return reverse.toString();
	}

//================================================================================================================================

	// To remove duplicate char in a string
	public static String revomeDuplicateChar(String str) {
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach((e) -> sb.append((char) e));
		return sb.toString();
	}
// ================================================================================================================================

	// To find no of char occurrence in a string
	public static Map<Character, Integer> checkOccouranceChar(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				Integer rep = map.get(charArray[i]);
				map.put(charArray[i], rep + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		return map;
	}
//================================================================================================================================

	public static String revString(String str) {
		int length = str.length();
		if (length == 0) {
			return "";
		}
		return str.charAt(length - 1) + revString(str.substring(0, length - 1));
	}
//================================================================================================================================

	public static Map<Character, Integer> getCharOccourance(String str) {
		char[] charArray = str.toCharArray();
		Map<Character, Integer> data = new HashMap<>();
		for (int i = 0; i < charArray.length; i++) {
			if (data.containsKey(charArray[i])) {
				Integer integer = data.get(charArray[i]);
				data.put(charArray[i], integer + 1);
			} else {
				data.put(charArray[i], 1);
			}
		}
		return data;
	}
//================================================================================================================================

	public static boolean checkPalindrome(String str) {
		boolean res = false;
		if (str.length() != 0) {
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			if (str.equals(sb.toString())) {
				res = true;
				return res;
			}
		}
		return res;
	}
//================================================================================================================================

	public static int checkSingleCharOccurance(String str, Character ch) {
		int count = 0;
		if (str.length() != 0) {
			char[] charArray = str.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				if (ch.equals(charArray[i])) {
					count++;
				}
			}
		}
		return count;
	}
//================================================================================================================================

	public static int countTotalChar(String str) {
		int count = 0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				count++;
			}
		}
		return count;

	}
//================================================================================================================================

	public static void main(String[] args) {
		//// https://leetcode.com/problems/longest-substring-without-repeating-characters/
		String res = findMaxCombintionOfSubString("abcahf");
		System.out.println(res);
//		System.out.println(checkDuplicateChar("AtiA"));
//		Map<Character, Integer> checkOccouranceChar = checkOccouranceChar("AGYGGRSDSJWTRWB");
//		checkOccouranceChar.entrySet().stream().forEach((e) -> {
//			System.out.println(e);
//		});
//
//		String s1 = "Atim";
//		String s2 = "Atim";
//		s2.concat("Pramanik");
//		System.out.println(s1.equals(s2));
//		System.out.println(s1 == s2);
//		System.out.println(s2);
//
//		String revString = revString("Atim Pramanik");
//		System.out.println("=============================" + revString);
//
//		Map<Character, Integer> charOccourance = getCharOccourance("Atim Pramanik");
//		charOccourance.entrySet().forEach((e) -> {
//			System.out.println(e);
//		});
//
//		boolean checkPalindrome = checkPalindrome("ABAC");
//		System.out.println(checkPalindrome);
//
//		int res = checkSingleCharOccurance("ATI M A", 'A');
//		System.out.println(res);
//
//		int res1 = countTotalChar("Atim Pr");
//		System.out.println(res1);

	}

}
