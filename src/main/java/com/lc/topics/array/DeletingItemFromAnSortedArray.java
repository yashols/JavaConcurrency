package com.lc.topics.array;

public class DeletingItemFromAnSortedArray {

	public static void main(String[] args) {
		DeletingItemFromAnSortedArray obj = new DeletingItemFromAnSortedArray();
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int k = obj.removeElement(nums, 2);
		System.out.println(k);
	}

	public int removeElement(int[] nums, int val) {
		int k = nums.length;
		for (int i = nums.length - 1; i >= 0; --i) {
			if (nums[i] == val) {
                --k;
				for (int j = i+1; j <= k; ++j) {
					nums[j - 1] = nums[j];
				}
			}
		}
		return k;
	}
}
