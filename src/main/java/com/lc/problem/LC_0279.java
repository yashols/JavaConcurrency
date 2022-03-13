package com.lc.problem;

import java.util.Arrays;
import java.util.LinkedList;

public class LC_0279 {

	private int result = Integer.MAX_VALUE;

	public static void main(String[] args) {
		LC_0279 obj = new LC_0279();
		int result = obj.numSquares1(12);
		System.out.println(result);
	}
	
	public int numSquares(int n) {
	    int dp[] = new int[n + 1];
	    Arrays.fill(dp, Integer.MAX_VALUE);
	    // bottom case
	    dp[0] = 0;

	    // pre-calculate the square numbers.
	    int max_square_index = (int) Math.sqrt(n) + 1;
	    int square_nums[] = new int[max_square_index];
	    for (int i = 1; i < max_square_index; ++i) {
	      square_nums[i] = i * i;
	    }

	    for (int i = 1; i <= n; ++i) {
	      for (int s = 1; s < max_square_index; ++s) {
	        if (i < square_nums[s])
	          break;
	        dp[i] = Math.min(dp[i], dp[i - square_nums[s]] + 1);
	      }
	    }
	    return dp[n];
	  }

	public int numSquares1(int n) {
		numSquares(n, new LinkedList<Integer>(), n);
		return result;
	}

	public void numSquares(int n, LinkedList<Integer> values, int remainder) {
		if(values.size() > 4) {
			return;
		}
		if (remainder < 0) {
			return;
		}
		if (remainder == 0) {
			result = Math.min(result, values.size());
			return;
		}
		for (int i = n; i >= 1; --i) {
			values.add(i);
			numSquares(n, values, (remainder - i * i));
			values.removeLast();
		}

	}

}
