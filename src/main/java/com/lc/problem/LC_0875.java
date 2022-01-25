package com.lc.problem;

public class LC_0875 {

	public static void main(String[] args) {
		LC_0875 obj = new LC_0875();
		// int[] piles = { 3, 6, 7, 11 };
		int[] piles = { 312884470 };
		int h = 312884469;

		int result = obj.minEatingSpeed(piles, h);
		System.out.println(result);
	}

	public int minEatingSpeed(int[] piles, int h) {
		int min = 1;
		int max = 1;

		for (int i : piles) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}

		while (min < max) {
			int hours = 0;
			int mid = min + (max - min) / 2;
			for (int i : piles) {
				hours += i / mid;
				if (i % mid != 0) {
					++hours;
				}
			}
			if (hours <= h) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		return max;
	}

}
