package com.lc.problem.medium.set1;

import java.util.Arrays;

public class LC_0198_House_Robber {

	public static void main(String[] args) {
		LC_0198_House_Robber obj = new LC_0198_House_Robber();
		int[] nums = { 100, 2, 2, 100 };
		int response = obj.rob(nums);
		System.out.println(response);
	}

	private int[] memo;

	public int rob(int[] nums) {

		this.memo = new int[nums.length+1];

		// Fill with sentinel value representing not-calculated recursions.
		Arrays.fill(this.memo, -1);

		
		StringBuilder sb = new StringBuilder();
		sb.insert(0, 'c');
		System.out.println(sb.toString());
		return this.robFrom(0, nums);
	}

	private int robFrom(int i, int[] nums) {

		// No more houses left to examine.
		if (i >= nums.length) {
			return 0;
		}

		// Return cached value.
		if (this.memo[i] > -1) {
			return this.memo[i];
		}

		// Recursive relation evaluation to get the optimal answer.
		int ans = Math.max(this.robFrom(i + 1, nums), this.robFrom(i + 2, nums) + nums[i]);

		// Cache for future use.
		this.memo[i] = ans;
		return ans;
	}

}
