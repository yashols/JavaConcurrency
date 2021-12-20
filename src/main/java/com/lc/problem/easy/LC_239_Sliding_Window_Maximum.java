package com.lc.problem.easy;

import java.util.LinkedList;

/**
 * LC_239_Sliding_Window_Maximum Description.
 *
 * @author Yashol Sharma
 */
public final class LC_239_Sliding_Window_Maximum {

	public static void main(String args[]) {
		LC_239_Sliding_Window_Maximum obj = new LC_239_Sliding_Window_Maximum();
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		System.out.println(obj.maxSlidingWindow(nums, 3));
	}

	public int[] maxSlidingWindow(int[] nums, int k) {
		LinkedList<Integer> q1 = new LinkedList<>();
		int[] response = new int[nums.length - k + 1];
		int maxSum = 0;
		int counter = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
			q1.add(nums[i]);
		}
		response[counter++] = sum;
		maxSum = sum;
		for (int i = k; i < nums.length; ++i) {
			sum += nums[i];
			q1.add(nums[i]);
			sum -= q1.remove(0);
			if (maxSum < sum) {
				maxSum = sum;
			}
			response[counter++] = maxSum;
		}
		return response; // [3,3,5,5,6,7]

	}

}
