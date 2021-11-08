package com.lc.problem.easy.set1;


/**
 * @author Yashol Sharma
 */
public final class SingleNumber
{

	public static void main(String[] args)
	{
		SingleNumber n = new SingleNumber();
		int[] v = {4, 1, 2, 1, 2};
		int response = n.singleNumber(v);
		System.out.println(response);
	}


	public int singleNumber(int[] nums)
	{
		int result = 0;
		for (int n : nums)
		{
			result ^= n;
		}
		return result;
	}

}
