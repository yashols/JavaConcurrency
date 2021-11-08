package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		BestTimeToBuyAndSellStock n = new BestTimeToBuyAndSellStock();
		int[] v = { 4, 7, 2, 1 };
		int response = n.maxProfit(v);
		System.out.println(response);
	}

	public int maxProfit(int[] prices) {
		int profit = 0, min = prices[0], max = prices[0];
		for (int i = 1; i < prices.length; ++i) {
			if (prices[i] <= min) {
				profit = Math.max(max - min, profit);
				min = max = prices[i];
			} else if (prices[i] > max) {
				max = prices[i];
			}
		}
		return Math.max(max - min, profit);
	}

}
