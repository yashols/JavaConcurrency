package com.lc.problem;

public class LC_0153_Find_Minimum_In_Rotated_Sorted_Array {

	public static void main(String[] args) {
		LC_0153_Find_Minimum_In_Rotated_Sorted_Array obj = new LC_0153_Find_Minimum_In_Rotated_Sorted_Array();
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		obj.findMin(nums);
	}

	public int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int low = 0;
		int high = nums.length - 1;
		while (true) {

			int mid = low + (high - low) / 2;
			if (low == mid) {
				return Math.min(nums[low], nums[high]);
			}
			if (nums[mid] > nums[low]) {
				low = mid + 1;
			} else {
				high = mid;
			}
		}
	}

}
