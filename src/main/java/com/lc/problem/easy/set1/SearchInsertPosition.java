package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class SearchInsertPosition
{

	public static void main(String args[])
	{
		SearchInsertPosition obj = new SearchInsertPosition();
		int[] nums = {1, 3, 5, 6};
		int response = obj.searchInsert(nums, 0);
		System.out.println(response);
	}


	public int searchInsert(int[] nums, int target)
	{

		if (nums == null || nums.length == 0)
		{
			return 0;
		}
		for (int i = 0; i < nums.length; ++i)
		{
			if (nums[i] >= target)
			{
				return i;
			}
		}
		return nums.length;
	}

}
