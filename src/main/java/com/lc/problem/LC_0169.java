package com.lc.problem;

public class LC_0169 {

	public static void main(String[] args) {
		LC_0169 obj = new LC_0169();
		int[] nums = { 7, 5, 2, 3, 1, 1, 1, 1, 1 };
		obj.majorityElement(nums);
	}

	public int majorityElement(int[] nums) {
		int count = 0;
		Integer candidate = null;

		for (int num : nums) {
			if (count == 0) {
				candidate = num;
			}
			count += (num == candidate) ? 1 : -1;
		}

		return candidate;
	}

}
