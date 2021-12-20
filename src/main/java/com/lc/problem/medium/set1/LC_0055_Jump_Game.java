package com.lc.problem.medium.set1;

public class LC_0055_Jump_Game {

	public static void main(String[] args) {
		LC_0055_Jump_Game obj = new LC_0055_Jump_Game();
		int[] nums = { 2, 3, 1, 1, 4 };
		obj.canJump(nums);
	}

	public boolean canJump(int[] nums) {
		int startIndex = 0;
		while (startIndex < nums.length - 1) {
			int value = nums[startIndex];
			if (value == 0) {
				return false;
			}
			startIndex += value;
			if (startIndex == nums.length - 1	) {
				return true;
			}
		}
		return false;
	}
}
