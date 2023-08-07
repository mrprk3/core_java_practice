package com.mrprk.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OverlapInterval {
	public static void main(String[] args) {
		int[][] intervals = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };
		int[][] interval = { { 1, 9 }, { 2, 4 }, { 4, 7 }, { 6, 8 } };
		Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
		overlappingIntervalSol(intervals);

	}

	public static int[][] overlappingIntervalSol(int[][] intervals) {
		Map<Integer, Integer> map = new HashMap<>();
		int start = intervals[0][0];
		int end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			int nextStart = intervals[i][0];
			int nextEnd = intervals[i][1];
			if (nextStart <= end) {
				end = Math.max(end, nextEnd);
			} else {
				System.out.println(start + " " + end);
				map.put(start, end);
				start = nextStart;
				end = nextEnd;
			}

		}
		System.out.println(start + " " + end);
		map.put(start, end);
		int[][] res = new int[map.size()][2];
		int i = 0;
		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + "  " + m.getValue());
			res[i][0] = m.getKey();
			res[i][1] = m.getValue();
			i++;

		}

		return res;
	}

}
