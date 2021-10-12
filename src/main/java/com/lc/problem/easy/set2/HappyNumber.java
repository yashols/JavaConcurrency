package com.lc.problem.easy.set2;

import java.util.HashSet;
import java.util.Set;


/**
 * @author Yashol Sharma
 */
public final class HappyNumber
{

	public static void main(String args[])
	{
		HappyNumber obj = new HappyNumber();
		int n = 2;
		boolean response = obj.isHappy(n);
		System.out.println(response);

	}


	public boolean isHappy(int n)
	{
		Set<Integer> nums = new HashSet<Integer>();
		return isHappy(nums, n);
	}


	public boolean isHappy(Set<Integer> nums, int n)
	{
		if (nums.contains(n))
		{
			return false;
		}
		if (n == 1)
		{
			return true;
		}
		int sum = 0;
		int curr = n;
		while (curr > 9)
		{
			int reminder = curr % 10;
			sum += reminder * reminder;
			curr /= 10;
		}
		sum += curr * curr;
		nums.add(n);
		return isHappy(nums, sum);
	}
}
