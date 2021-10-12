package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class BestTimeToBuyAndSellStock2
{

	public static void main(String[] args)
	{
		BestTimeToBuyAndSellStock2 n = new BestTimeToBuyAndSellStock2();
		int[] v = {1, 2, 3, 4, 5};
		int response = n.maxProfit(v);
		System.out.println(response);
	}


	public int maxProfit(int[] prices)
	{
		int profit = 0, min = prices[0], max = prices[0];
		int i = 1;
		while (i < prices.length)
		{
			while (i < prices.length && prices[i] > max)
			{
				max = prices[i];
				i = i + 1;
			}
			profit += max - min;
			min = max;
			while (i < prices.length && prices[i] <= min)
			{
				min = prices[i];
				max = prices[i];
				i = i + 1;
			}

		}
		return profit;
	}

}
