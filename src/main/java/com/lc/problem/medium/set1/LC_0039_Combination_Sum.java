package com.lc.problem.medium.set1;

import java.util.ArrayList;
import java.util.List;

public class LC_0039_Combination_Sum {

	public static void main(String args[]) {
		LC_0039_Combination_Sum obj = new LC_0039_Combination_Sum();
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> response = obj.combinationSum(candidates, target);
		for (List<Integer> l2 : response) {
			for (int l : l2) {
				System.out.print(l + " -> ");
			}
			System.out.println("");
		}
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> response = new ArrayList<>();
		combinationSum(candidates, response, new ArrayList<>(), target, 0);
		return response;
	}

	private void combinationSum(int[] candidates, List<List<Integer>> list, List<Integer> tempList, int remain,
			int index) {
		if (remain < 0) {
			return;
		} else if (remain == 0) {
			list.add(new ArrayList<>(tempList));
			return;
		} else {
			for (int i = index; i < candidates.length; i++) {
				tempList.add(candidates[i]);
				combinationSum(candidates, list, tempList, remain - candidates[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
