package com.lc.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LC_0253 {

	public static void main(String[] args) {
		LC_0253 obj = new LC_0253();
		// int[][] intervals = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		int[][] intervals = { { 13, 15 }, { 1, 13 } };
		int result = obj.minMeetingRooms(intervals);
		System.out.println(result);
	}

	public int minMeetingRooms(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			};
		});
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			};
		});
		pq.offer(intervals[0]);
		for (int i = 1; i < intervals.length; ++i) {
			int[] top = pq.peek();
			if (top[1] <= intervals[i][0]) {
				pq.poll();
				pq.offer(intervals[i]);
			} else {
				pq.offer(intervals[i]);
			}
		}
		return pq.size();
	}

}
