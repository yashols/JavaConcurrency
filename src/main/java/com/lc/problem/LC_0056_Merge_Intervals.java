package com.lc.problem;

import java.util.Arrays;
import java.util.LinkedList;

public class LC_0056_Merge_Intervals {

	public static void main(String[] args) {
		LC_0056_Merge_Intervals obj = new LC_0056_Merge_Intervals();
		int[][] intervals = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
		int[][] response = obj.merge(intervals);
		for (int i = 0; i < response.length; ++i) {
			System.out.println(response[i][0] + " - " + response[i][1]);
		}

	}

	public int[][] merge(int[][] intervals) {
		LinkedList<int[]> response = new LinkedList<>();
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0]));
		response.add(intervals[0]);
		for(int i=1; i<intervals.length; ++i) {
			if(response.getLast()[1] >= intervals[i][0]) {
				response.getLast()[1] = Math.max(response.getLast()[1],intervals[i][1]);
			} else {
				response.add(intervals[i]);
			}
		}
		return response.toArray(new int[response.size()][]);
		
		
	}

}
