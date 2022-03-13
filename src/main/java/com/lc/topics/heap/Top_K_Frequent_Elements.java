package com.lc.topics.heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class Top_K_Frequent_Elements {

	public static void main(String[] args) {
		Top_K_Frequent_Elements obj = new Top_K_Frequent_Elements();
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		obj.topKFrequent(nums, 2);
	}

	public int[] topKFrequent(int[] nums, int k) {
		PriorityQueue<Entry<Integer, Integer>> pq = new PriorityQueue<Entry<Integer, Integer>>(new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return Integer.compare(o2.getValue() , o1.getValue());
			}
		});
		Map<Integer, Integer> value = new HashMap<>();
		int[] result = new int[k];
		for (int i = 0; i < nums.length; ++i) {
			value.put(nums[i], value.getOrDefault(nums[i], 0) + 1);
		}
		for(Entry<Integer, Integer> a : value.entrySet()) {
			pq.offer(a);
		}
		
		for(int i =0; i<k; ++i) {
			Entry<Integer, Integer> v = pq.poll();
			result[i] = v.getKey();
		}
		return result;
	}
}
