package com.lc.problem;

import java.util.LinkedList;
import java.util.List;

public class LC_0039 {
	private List<List<Integer>> result = new LinkedList<>();

	public static void main(String[] args) {
		LC_0039 obj = new LC_0039();
		int[] candidates = { 2, 3, 5 };
		obj.combinationSum(candidates, 8);
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		combinationSum(candidates, target, 0, candidates.length, new LinkedList<Integer>());
		return result;

	}

	private void combinationSum(int[] candidates, int target, int start, int end, LinkedList<Integer> current) {
		if (!current.isEmpty()) {
			int c = 0;
			for (Integer i : current) {
				c += i;
			}
			if (c == target) {
				result.add(new LinkedList<>(current));
			}
			return;
		}
		for (int i = 0; i < candidates.length; ++i) {
			current.add(candidates[i]);
			combinationSum(candidates, target, i, end, current);
			current.removeLast();
		}
	}

}
