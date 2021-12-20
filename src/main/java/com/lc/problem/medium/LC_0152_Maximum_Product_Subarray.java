package com.lc.problem.medium;

public class LC_0152_Maximum_Product_Subarray {

	public static void main(String[] args) {
		LC_0152_Maximum_Product_Subarray obj = new LC_0152_Maximum_Product_Subarray();
		int[] nums = { 2,-5,-2,-4,3 };
		int response = obj.maxProduct(nums);
		System.out.println(response);
	}

	public int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		int currentProduct = nums[0];
		int product = nums[0];
		for(int i=1; i<nums.length; ++i) {
			product = product * nums[i];
			currentProduct = Math.max(product, nums[i]);
			maxProduct = Math.max(maxProduct, currentProduct);
		}
		return maxProduct;
	}

}
