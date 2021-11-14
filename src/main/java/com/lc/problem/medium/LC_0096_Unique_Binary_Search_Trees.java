package com.lc.problem.medium;

/**
 * LC_0096_Unique_Binary_Search_Trees Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0096_Unique_Binary_Search_Trees {

	public static void main(String[] args) {
		LC_0096_Unique_Binary_Search_Trees obj = new LC_0096_Unique_Binary_Search_Trees();
		int response = obj.numTrees(3);
		System.out.println(response);
	}

	public int numTrees(int n) {
		if (n == 0 || n == 1) {
			return 0;
		}

		int response = 0;
		int[] nums = new int[n];
		for(int i = 1; i <= n; ++i) {
			nums[i-1] = i;
		}
		response = numTrees(nums);
		return response;
	}
	
	public int numTrees(int[] nums) {
		
		for(int i=0; i<nums.length; ++i) {
			int[] left = new int[i-1];
			int[] right = new int[nums.length - i - 1];
			numTrees(left);
			numTrees(right);
		}
		return 0;
	}

}
