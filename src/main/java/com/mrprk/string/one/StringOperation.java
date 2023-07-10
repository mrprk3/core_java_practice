package com.mrprk.string.one;

import java.util.HashMap;
import java.util.Map;

public class StringOperation {
	public static Map<Character, Integer> getCount(String str) {
		char[] s = str.toCharArray();
		Map<Character, Integer> res = new HashMap<>();
		for (int i = 0; i < s.length; i++) {
			if (res.containsKey(s[i])) {
				Integer count = res.get(s[i]);
				res.put(s[i], count + 1);
			} else {
				res.put(s[i], 1);
			}
		}
		return res;
	}

	public static String revString(String str) {
		int length = str.length();
		if (length == 0) {
			return "";
		}
		return str.charAt(length - 1) + revString(str.substring(0, length - 1));
	}

	public static void main(String[] args) {
		Map<Character, Integer> res = getCount("AJDDHUHGGAHFSAHUHSASHHAHHDA");
		res.entrySet().forEach((e) -> {
			System.out.println(e);
		});
		
		String revString = revString("ABCD");
		System.out.println(revString); 
	}

}
