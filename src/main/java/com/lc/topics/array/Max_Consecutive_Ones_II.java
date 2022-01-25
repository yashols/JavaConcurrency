package com.lc.topics.array;

public class Max_Consecutive_Ones_II {

	public static void main(String[] args) {
		Max_Consecutive_Ones_II obj = new Max_Consecutive_Ones_II();
		int[] nums = {1,0,1,1,1,1,1,0,0,1,1,1,1,1};
		int result = obj.findMaxConsecutiveOnes(nums);
		System.out.println(result);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int result = 0;
		int v = 0;
		boolean zero = true;
		int index = 0;
		for (int i = 0; i < nums.length; ++i) {

			if (nums[i] == 1) {
				++v;
			} else if (zero) {
				zero = false;
				++v;
				index = i;
			} else {
				v = 0;
				zero = true;
				i=index;
			}
			result = Math.max(result, v);

		}
		return result;
	}
}
