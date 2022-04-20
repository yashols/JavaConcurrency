package com.lc.problem;

public class LC_1007 {

	public static void main(String[] args) {
		LC_1007 obj = new LC_1007();
		int[] tops = { 1, 2, 1, 1, 1, 2, 2, 2 };
		int[] bottoms = { 2, 1, 2, 2, 2, 2, 2, 2 };
		int result = obj.minDominoRotations(tops, bottoms);
		System.out.println(result);
	}

	public int minDominoRotations(int[] tops, int[] bottoms) {
		int topNumber = tops[0];
		int downNumber = bottoms[0];
		int topMatch = 1;
		int downMatch = 1;
		int topShift = 0;
		int downShift = 0;
		for (int i = 1; i < tops.length; ++i) {
			if (tops[i] == topNumber) {
				++topMatch;
			} else if (bottoms[i] == topNumber) {
				++topMatch;
				++topShift;
			}
			if (bottoms[i] == downNumber) {
				++downMatch;
			} else if (tops[i] == downNumber) {
				++downMatch;
				++downShift;
			}
		}
		if (topMatch == tops.length) {
			return Math.min(topShift, tops.length - topShift);
		}
		if (downMatch == bottoms.length) {
			return Math.min(downShift, bottoms.length - downShift);
		}
		return -1;
	}

}
