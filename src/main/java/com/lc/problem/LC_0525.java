package com.lc.problem;

import java.util.Arrays;

public class LC_0525 {

	public static void main(String[] args) {
		LC_0525 obj = new LC_0525();
		// int[] nums = { 0, 0, 1, 0, 0, 0, 1, 1 };
		int[] nums = { 1, 1, 1, 1, 1, 1, 1 };
		int result = obj.findMaxLength(nums);
		System.out.println(result);
	}

	public int findMaxLength(int[] nums) {
		int[] arr = new int[2 * nums.length + 1];
		Arrays.fill(arr, -2);
		arr[nums.length] = -1;
		int maxlen = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = count + (nums[i] == 0 ? -1 : 1);
			if (arr[count + nums.length] >= -1) {
				maxlen = Math.max(maxlen, i - arr[count + nums.length]);
			} else {
				arr[count + nums.length] = i;
			}

		}
		return maxlen;
	}

}
