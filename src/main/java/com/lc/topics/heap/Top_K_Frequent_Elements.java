package com.lc.topics.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {

	public static void main(String[] args) {
		Top_K_Frequent_Elements obj = new Top_K_Frequent_Elements();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		obj.topKFrequent(nums, 2);
	}

	public int[] topKFrequent(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Map<Integer, Integer> value = new HashMap<>();
		int[] result = new int[k];

		return result;
	}
}
