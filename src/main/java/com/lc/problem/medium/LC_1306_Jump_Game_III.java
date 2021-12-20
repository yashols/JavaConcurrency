package com.lc.problem.medium;

import java.util.HashSet;
import java.util.Set;

public class LC_1306_Jump_Game_III {

	public static void main(String[] args) {
		LC_1306_Jump_Game_III obj = new LC_1306_Jump_Game_III();
		int[] arr = { 3, 0, 2, 1, 2 };
		int start = 2;
		boolean result = obj.canReach(arr, start);
		System.out.println(result);
	}
	
	public boolean canReach(int[] arr, int start) {
		return canReach(arr, start, new HashSet<>());
	}

	public boolean canReach(int[] arr, int start, Set<Integer> startIndex) {
		if (start < 0 || start >= arr.length) {
			return false;
		}
		if (startIndex.contains(start)) {
			return false;
		}
		startIndex.add(start);

		if (arr[start] == 0) {
			return true;
		}
		return canReach(arr, start - arr[start], startIndex) || canReach(arr, start + arr[start], startIndex);
	}

}
