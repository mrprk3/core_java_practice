package com.mrprk;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static int longestUniqueSubsttr(String input) {
		// Creating a map to store the last positions of occurrence
		Map<Character, Integer> visited = new HashMap<>();
		int maximum_length = 0;

		// starting the initial point of window to index 0
		int start = 0;

		for (int end = 0; end < input.length(); end++) {
			// Getting the current character
			char currChar = input.charAt(end);

			// Checking if we have already seen the element or not
			if (visited.containsKey(currChar)) {
				// If we have seen the number, move the start pointer
				// to position after the last occurrence
				start = Math.max(visited.get(currChar) + 1, start);
			}

			// Updating the last seen value of the character
			visited.put(currChar, end);
			maximum_length = Math.max(maximum_length, end - start + 1);
		}
		return maximum_length;
	}

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		System.out.println("The input string is " + input);
		int length = longestUniqueSubsttr(input);
		System.out.println("The length of the longest non-repeating character substring is " + length);
	}
}
