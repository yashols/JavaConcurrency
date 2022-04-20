package com.lc.problem;

import java.util.HashMap;
import java.util.Map;

public class LC_0746 {

	public static void main(String[] args) {
		LC_0746 obj = new LC_0746();
		int[] costs = { 10, 15, 20 };
		int result = obj.minCostClimbingStairs(costs);
		System.out.println(result);
	}

	public int minCostClimbingStairs(int[] cost) {
		int first = dp(cost, 0, new HashMap<Integer, Integer>());
		//int second = dp(cost, 1, new HashMap<Integer, Integer>());
		//return Math.min(first, second);
		return first;
	}

	public int dp(int[] cost, int i, Map<Integer, Integer> memo) {
		if (i >= cost.length) {
			return 0;
		}
		if (!memo.containsKey(i)) {
			memo.put(i, Math.min(dp(cost, i + 1, memo) + cost[i], dp(cost, i + 2, memo) + cost[i]));
		}
		return memo.get(i);
	}

}
