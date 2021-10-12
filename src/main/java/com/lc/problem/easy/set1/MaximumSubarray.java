package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class MaximumSubarray
{

	public static void main(String args[])
	{
		MaximumSubarray obj = new MaximumSubarray();
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int response = obj.maxSubArray(nums);
		System.out.println(response);

		int[] nums2 = {1};
		response = obj.maxSubArray(nums2);
		System.out.println(response);

		int[] nums3 = {5, 4, -1, 7, 8};
		response = obj.maxSubArray(nums3);
		System.out.println(response);
	}


	public int maxSubArray(int[] nums)
	{
		int max = nums[0];
		for (int i = 0; i < nums.length; ++i)
		{
			int count = nums[i];
			int c = nums[i];
			for (int j = i + 1; j < nums.length; ++j)
			{
				c = nums[j] + c;
				if (c > count)
				{
					count = c;
				}
			}
			if (count > max)
			{
				max = count;
			}
		}
		return max;
	}


	public int maxSubArray2(int[] nums)
	{
		int max = nums[0];
		int first = nums[0];
		for (int i = 1; i < nums.length; ++i)
		{
			first = first + nums[i];
			if (first < nums[i])
			{
				first = nums[i];
			}
			if (max < first)
			{
				max = first;
			}
		}
		return max;
	}

}
