package com.lc.problem.easy.set2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Yashol Sharma
 */
public final class ContainsDuplicate2
{

	public static void main(String args[])
	{
		ContainsDuplicate2 obj = new ContainsDuplicate2();
		int[] b = {1, 0, 1, 1};
		boolean response = obj.containsNearbyDuplicate(b, 1);
		System.out.println(response);
	}


	public boolean containsNearbyDuplicate(int[] nums, int k)
	{
		Map<Integer, ArrayList<Integer>> values = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < nums.length; ++i)
		{
			if (values.containsKey(nums[i]))
			{
				ArrayList<Integer> v = values.get(nums[i]);
				for (int m : v)
				{
					if (Math.abs(m - i) <= k)
					{
						return true;
					}
				}
				v.add(i);
			}
			else
			{
				ArrayList<Integer> l = new ArrayList<>();
				l.add(i);
				values.put(nums[i], l);
			}
		}
		return false;
	}

}
