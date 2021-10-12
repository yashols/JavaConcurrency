package com.lc.problem.easy.set1;


import java.util.HashMap;
import java.util.Map;


/**
 * @author Yashol Sharma
 */
public final class ClimbingStairs
{

	private Map<Integer, Integer> v = new HashMap<>();


	public static void main(String arg[])
	{
		ClimbingStairs obj = new ClimbingStairs();
		int response = obj.climbStairs(45);
		System.out.print(response);
	}


	public int climbStairs(int n)
	{
		if (n == 0 || n == 1)
		{
			return 1;
		}
		if (!v.containsKey(n - 1))
		{
			int minus1 = climbStairs(n - 1);
			v.put(n - 1, minus1);
		}
		if (!v.containsKey(n - 2))
		{
			int minus2 = climbStairs(n - 2);
			v.put(n - 2, minus2);
		}

		return v.get(n - 1) + v.get(n - 2);
	}

}
