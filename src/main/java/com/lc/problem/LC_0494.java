package com.lc.problem;

public class LC_0494 {

	public static void main(String[] args) {
		LC_0494 obj = new LC_0494();
		int[] nums = { 1, 1, 1, 1, 1 };
		int result = obj.findTargetSumWays(nums, 3);
		System.out.println(result);
	}

	public int findTargetSumWays(int[] nums, int target) {
		findTargetSumWays(nums, target, 0, 0);
		return total;
	}
	
	private int total = 0;
	public void findTargetSumWays(int[] nums, int target, int startIndex, int currentTotal) {
		if(startIndex == nums.length) {
			if(currentTotal == target) {
				++total;
			}
			
		} else {
			findTargetSumWays(nums, target, startIndex+1, currentTotal + nums[startIndex]);
			findTargetSumWays(nums, target, startIndex+1, currentTotal - nums[startIndex]);
		}
	}

}
