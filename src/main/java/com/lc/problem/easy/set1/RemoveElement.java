package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class RemoveElement {

	public static void main(String args[]) {
		RemoveElement obj = new RemoveElement();
		int[] nums = { 3, 2, 1 };
		int response = obj.removeElement(nums, 6);
		for (int i : nums) {
			System.out.println(i);
		}
		System.out.println(response);
	}

	public int removeElement(int[] nums, int val) {
		if ((nums == null || nums.length == 0) || (nums.length == 1 && nums[0] == val)) {
			return 0;
		}
		if (nums.length == 1) {
			return 1;
		}
		int i = 0;
		for (int k = 0; k < nums.length; ++k) {
			if (val != nums[k]) {
				nums[i++] = nums[k];
			}
		}
		return i;
	}

}
