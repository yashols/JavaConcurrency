package com.lc.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LC_0018 {

	public static void main(String[] args) {
		LC_0018 obj = new LC_0018();
		int[] four = { 1, 0, -1, 0, -2, 2 };
		obj.fourSum(four, 0);
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<Integer> numSet = new LinkedList<Integer>();
		for (int n : nums) {
			numSet.add(n);
		}
		Set<List<Integer>> duplicate = new HashSet<>();
		for (int a = 0; a < nums.length; ++a) {
			for (int b = a + 1; b < nums.length; ++b) {
				for (int c = b + 1; c < nums.length; ++c) {
					// for(int d=c+1; d<nums.length; ++d) {
					int remainder = target - nums[a] - nums[b] - nums[c];
					if (numSet.contains(remainder)) {
						List<Integer> four = Arrays.asList(nums[a], nums[b], nums[c], remainder);
						Collections.sort(four);
						if (duplicate.contains(four)) {
							continue;
						}
						duplicate.add(four);
					}
				}
			}
		}
		return new ArrayList(duplicate);
	}

}
