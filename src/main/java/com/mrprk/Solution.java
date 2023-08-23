package com.mrprk;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public static void main(String[] args) {

		System.out.println(solution("abbcccddddcc"));
	}

	public static Map<Character, Integer> solution(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {   
			if (map.containsKey(charArray[i])) {
				int count = map.get(charArray[i]);
				map.put(charArray[i], count + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		int largest = -1;
		int secondLarge = -1;
		for (Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > largest) {
				secondLarge = largest;
				largest = m.getValue();
			} else if (m.getValue() < largest && m.getValue() > secondLarge) {
				secondLarge = m.getValue();
			}
		}
		System.out.println("SecondLarge : " + secondLarge);
		return map;
	}

}
