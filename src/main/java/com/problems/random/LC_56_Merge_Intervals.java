package com.problems.random;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class LC_56_Merge_Intervals {

	public static void main(String[] args) {
		LC_56_Merge_Intervals obj = new LC_56_Merge_Intervals();
		int[][] intervals = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };
		int[][] result = obj.merge(intervals);
		for (int i = 0; i < result.length; ++i) {
			System.out.print("[" + result[i][0] + "," + result[i][1] + "]");
		}
	}

	public int[][] merge(int[][] intervals) {
		LinkedList<int[]> result = new LinkedList<>();
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			};
		});
		result.add(intervals[0]);
		for (int i = 1; i < intervals.length; ++i) {
			int[] interval = intervals[i];
			if (interval[0] <= result.getLast()[1]) {
				result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
				continue;
			} else {
				result.add(interval);
			}
		}
		return result.toArray(new int[result.size()][]);
	}

}
