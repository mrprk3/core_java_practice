package com.mrprk;

import java.util.HashMap;
import java.util.Map;

public class TestT {
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

//	i  j 
//	0  0,1,2,3,4     0 - 4
//	1  1,4            
//	2  1,4
//	3  1,4
//	4  0,1,2,3,4

	public static void startPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

//	i/p-aaabbccddefgg
//	o/p-3a2b2c2def2g

	public static String stringChk(String str) {
		Map<Character, Integer> res = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			Integer integer = res.get(charArray[i]);
			if (res.containsKey(charArray[i])) {
				res.put(charArray[i], integer + 1);
			} else {
				res.put(charArray[i], 1);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (Map.Entry<Character, Integer> e : res.entrySet()) {
			sb.append(e.getValue() + "" + e.getKey());
		}
		return sb.toString();
	}

	public static String primeCheck(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) { // 1 to 4
			if (num % i == 0) {
				count++;// 3
			}
		}
		System.out.println("count:" + count);
		if (count == 2) {
			return "prime number";
		} else {
			return "not a prime number";
		}
	}

	public static String primeCheck2(int num) {
		for (int i = 2; i < num; i++) { // 1 to 4
			if (num % i == 0) {
				return "Not a prime";
			} else {
				return "Prime";
			}
		}
		return null;
	}

	public static void main(String[] args) {
		String stringChk = stringChk("aaabbccddefgg");
		System.out.println(stringChk);
		String primeCheck = primeCheck2(16);
		System.out.println(primeCheck);

//		StringBuffer capitalizeFirstChar = capitalizeFirstChar("my name is atim");
//		System.out.println(capitalizeFirstChar);
//		//
//		int countChar = countChars(" name name");
//		System.out.println(countChar);
//
//		String str = " Atim P";
//		char[] charArray = str.toCharArray();
//		System.out.println(str.length());
//		System.out.println(charArray.length);
//
//		checkCharOccourance("fgfhsfhp", "Deep", "Atim");
//		startPattern();

	}

}
