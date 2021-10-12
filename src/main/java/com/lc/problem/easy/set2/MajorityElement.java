package com.lc.problem.easy.set2;


import java.util.HashMap;
import java.util.Map;


/**
 * @author Yashol Sharma
 */
public final class MajorityElement
{

	public static void main(String args[])
	{
		MajorityElement obj = new MajorityElement();
		char[] a = {'c', 'a', 'a', 'a', 'c', 'b', 'b', 'a'};
		int[] b = {2147483647};
		char response = obj.majorityElement(a);
		System.out.println(response);
	}


	public char majorityElement(char[] num)
	{

		char major = num[0], count = 1;
		for (int i = 1; i < num.length; i++)
		{
			if (count == 0)
			{
				count++;
				major = num[i];
			}
			else if (major == num[i])
			{
				count++;
			}
			else
			{
				count--;
			}

		}
		return major;
	}


	public int majorityElement2(int[] nums)
	{
		Map<Integer, Integer> numbers = new HashMap<>();
		for (int i : nums)
		{
			if (numbers.containsKey(i))
			{
				numbers.put(i, numbers.get(i) + 1);
				if (numbers.get(i) > nums.length / 2)
				{
					return i;
				}
			}
			else
			{
				numbers.put(i, 1);
			}
		}
		return nums[0];
	}
}
