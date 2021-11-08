package com.lc.problem.easy.set2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Yashol Sharma
 */
public final class ContainsDuplicate {

	public static void main(String args[]) {
		ContainsDuplicate obj = new ContainsDuplicate();
		int[] b = { 1, 2, 3, 4, 1 };
		boolean response = obj.containsDuplicate(b);
		System.out.println(response);
	}

	public boolean containsDuplicate(int[] nums) {
		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			if (values.contains(nums[i])) {
				return true;
			}
			values.add(nums[i]);
		}
		return false;
	}

}
