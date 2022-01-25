package com.lc.topics.array;

public class Third_Maximum_Number {

	public static void main(String[] args) {
		Third_Maximum_Number obj = new Third_Maximum_Number();
		int[] nums = { 2, 2, 3, 1 };
		obj.thirdMax(nums);
	}

	public int thirdMax(int[] nums) {
		Integer first = null;
		Integer second = null;
		Integer third = null;
		for (int i = 0; i < nums.length; ++i) {
			if ((first != null && nums[i] == first) || (second != null && nums[i] == second)
					|| (third != null && nums[i] == third)) {
				continue;
			}
			if (first == null || nums[i] > first) {
				third = second;
				second = first;
				first = nums[i];
			} else if (second == null || nums[i] > second) {
				third = second;
				second = nums[i];
			} else if (third == null || nums[i] > third) {
				third = nums[i];
			}
		}
		return third == null ? first : third;
	}
}
