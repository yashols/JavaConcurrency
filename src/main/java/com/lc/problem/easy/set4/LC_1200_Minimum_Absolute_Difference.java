package com.lc.problem.easy.set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class LC_1200_Minimum_Absolute_Difference {

	public static void main(String[] args) {
		LC_1200_Minimum_Absolute_Difference obj = new LC_1200_Minimum_Absolute_Difference();
		int[] arr = { 4, 2, 1, 3 };
		obj.minimumAbsDifference(arr);
	}

	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Map<Integer, List<List<Integer>>> nums = new HashMap<Integer, List<List<Integer>>>();
		for (int i = 1; i < arr.length; ++i) {
			int diff = arr[i] - arr[i - 1];
			pq.add(diff);
			if (nums.containsKey(diff)) {
				List<Integer> d = new ArrayList<>();
				d.add(arr[i - 1]);
				d.add(arr[i]);
				nums.get(diff).add(d);
			} else {
				List<List<Integer>> a = new ArrayList<>();
				List<Integer> d = new ArrayList<>();
				d.add(arr[i - 1]);
				d.add(arr[i]);
				a.add(d);
				nums.put(diff, a);
			}
		}
		int min = pq.poll();
		return nums.get(min);
	}

}
