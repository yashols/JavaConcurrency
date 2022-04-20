package com.lc.problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LC_1029 {

	public static void main(String[] args) {
		LC_1029 obj = new LC_1029();
		// int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
		int[][] costs = { { 259, 770 }, { 448, 54 }, { 926, 667 }, { 184, 139 }, { 840, 118 }, { 577, 469 } };
		int result = obj.twoCitySchedCost(costs);
		System.out.println(result);
	}

	private Map<Integer, Integer> data = new HashMap<>();

	public int twoCitySchedCost(int[][] costs) {

		Arrays.sort(costs, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o1[1] - (o2[0] - o2[1]);
			}
		});
		int n = costs.length / 2;
		int total = 0;
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; ++i) {
			total += costs[i][0];
			total += costs[n + i][1];
		}
		
		return total;
	}

}
