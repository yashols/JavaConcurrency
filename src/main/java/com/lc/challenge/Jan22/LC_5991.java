package com.lc.challenge.Jan22;

public class LC_5991 {

	public static void main(String[] args) {
		LC_5991 obj = new LC_5991();
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		obj.rearrangeArray(nums);
	}

	public int[] rearrangeArray(int[] nums) {
		if (nums == null) {
			return nums;
		}
		if (nums.length == 1) {
			return nums;
		}
		boolean sign = true;
		for (int i = 0; i < nums.length; ++i) {

			if (sign) {
				if (nums[i] > 0) {
					sign = false;
					continue;
				}
				for (int j = i + 1; j < nums.length; ++j) {
					if (nums[j] > 0) {
						int temp = nums[j];
						for (int k = j - 1; k >= i; --k) {
							nums[k + 1] = nums[k];
						}
						nums[i] = temp;
						sign = false;
						break;
					}
				}
			} else {
				if (nums[i] < 0) {
					sign = true;
					continue;
				}
				for (int j = i + 1; j < nums.length; ++j) {
					if (nums[j] < 0) {
						int temp = nums[j];
						for (int k = j - 1; k >= i; --k) {
							nums[k + 1] = nums[k];
						}
						nums[i] = temp;
						sign = true;
						break;
					}
				}
			}

		}
		return nums;
	}
}
