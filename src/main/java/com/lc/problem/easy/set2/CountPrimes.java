package com.lc.problem.easy.set2;


/**
 * @author Yashol Sharma
 */
public final class CountPrimes
{

	public static void main(String args[])
	{
		CountPrimes obj = new CountPrimes();
		int response = obj.countPrimes(10);

		System.out.println(response);
	}


	public int countPrimes(int n)
	{
		int count = 0;
		for (int i = 2; i < n; ++i)
		{
			if (isPrime(i))
			{
				count++;
			}
		}
		return count;
	}


	private boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
