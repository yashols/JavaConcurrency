package com.lc.problem.easy.set2;

/**
 * @author Yashol Sharma
 */
public final class TwoSumIIInputArrayIsSorted
{

	public static void main(String args[])
	{
		TwoSumIIInputArrayIsSorted obj = new TwoSumIIInputArrayIsSorted();
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] response = obj.twoSum(numbers, target);
		System.out.println(response);
	}


	public int[] twoSum(int[] numbers, int target)
	{
		int left = 1;
		int right = numbers.length;
		for (int i = 0; i < numbers.length; ++i)
		{
			int sum = numbers[left - 1] + numbers[right - 1];
			if (sum == target)
			{
				return new int[] {left, right};
			}
			else if (sum > target)
			{
				right--;
			}
			else if (sum < target)
			{
				left++;
			}
		}
		return null;
	}
}
