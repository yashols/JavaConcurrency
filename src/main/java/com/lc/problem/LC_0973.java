package com.lc.problem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LC_0973 {

	public static void main(String[] args) {
		LC_0973 obj = new LC_0973();
		int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		obj.kClosest(points, 2);
	}

	public int[][] kClosest(int[][] points, int k) {
		int[][] result = new int[k][];
		PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare((o2[0] * o2[0]) + (o2[1] * o2[1]), (o1[0] * o1[0]) + (o1[1] * o1[1]));
			}
		});
		for (int i = 0; i < points.length; ++i) {
			pq.offer(points[i]);
			if (pq.size() > k) {
				pq.poll();
			}
		}
		int counter = 0;
		while (!pq.isEmpty()) {
			result[counter++] = pq.poll();
		}
		return result;
	}

}
