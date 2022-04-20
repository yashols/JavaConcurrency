package com.lc.problem;

public class LC_0287 {

	public static void main(String[] args) {
		LC_0287 obj = new LC_0287();
		int[] nums = { 1, 3, 4, 2, 2 };
		obj.findDuplicate(nums);
	}

	public int findDuplicate(int[] nums) {
		for (int i = 0; i < nums.length; ++i) {
			int value = Math.abs(nums[i]);
			if (nums[value] < 0) {
				return value;
			}
			nums[value] = nums[value] * -1;
		}
		return -1;
	}
}
