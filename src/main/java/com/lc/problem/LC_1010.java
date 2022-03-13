package com.lc.problem;

public class LC_1010 {

	public static void main(String[] args) {
		LC_1010 obj = new LC_1010();
		int[] time = { 418, 204, 77, 278, 239, 457, 284, 263, 372, 279, 476, 416, 360, 18 };
		obj.numPairsDivisibleBy60(time);
	}

	public int numPairsDivisibleBy60(int[] time) {
		int result = 0;
		for (int i = 0; i < time.length; ++i) {
			if (time[i] % 60 == 0) {
				++result;
				continue;
			}
			for (int j = i + 1; j < time.length; ++j) {
				int sum = time[i] + time[j];
				if (sum % 60 == 0) {
					++result;
				}
			}
		}
		return result;
	}

}
