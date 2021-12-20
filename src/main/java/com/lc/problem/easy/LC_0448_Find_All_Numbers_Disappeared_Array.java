package com.lc.problem.easy;

import java.util.ArrayList;
import java.util.List;

public class LC_0448_Find_All_Numbers_Disappeared_Array {

	public static void main(String[] args) {
		LC_0448_Find_All_Numbers_Disappeared_Array obj = new LC_0448_Find_All_Numbers_Disappeared_Array();
		int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> result = obj.findDisappearedNumbers(nums);
		System.out.println(result);
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[(nums[i] - 1) % n] += n;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= n) {
				res.add(i + 1);
			}
		}
		return res;
	}

}
