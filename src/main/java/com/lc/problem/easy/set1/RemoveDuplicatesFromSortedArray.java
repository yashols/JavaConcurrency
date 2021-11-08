package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class RemoveDuplicatesFromSortedArray {

	public static void main(String args[]) {
		RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int response = obj.removeDuplicates(nums);
		System.out.println(response);
	}

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int i = 0, j = 1, count = 1;
		while (j < nums.length) {
			if (nums[i] != nums[j]) {
				++count;
				nums[++i] = nums[j];
			}
			++j;
		}
		return count;
	}

}
