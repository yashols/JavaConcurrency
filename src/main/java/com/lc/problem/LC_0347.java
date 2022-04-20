package com.lc.problem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class LC_0347 {

	public static void main(String[] args) {
		LC_0347 obj = new LC_0347();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int[] result = obj.topKFrequent(nums, k);
		for(int n : result) {
			System.out.print(n + " ");
		}
	}

	public int[] topKFrequent(int[] nums, int k) {
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<Map.Entry<Integer, Integer>>(
				new Comparator<Map.Entry<Integer, Integer>>() {
					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						return Integer.compare(o2.getValue(), o1.getValue());
					}
				});
		Map<Integer, Integer> numsCount = new HashMap<Integer, Integer>();
		for (int n : nums) {
			numsCount.put(n, numsCount.getOrDefault(n, 0) + 1);
		}
		for (Entry<Integer, Integer> entry : numsCount.entrySet()) {
			pq.offer(entry);
		}
		int[] result = new int[k];
		for (int i = 0; i < k; ++i) {
			result[i] = pq.poll().getKey();
		}
		return result;
	}

}
