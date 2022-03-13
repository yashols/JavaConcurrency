package com.lc.problem;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LC_0692 {

	private Map<String, Integer> freq = new HashMap<String, Integer>();

	public static void main(String[] args) {
		LC_0692 obj = new LC_0692();
		String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
		obj.topKFrequent(words, 2);
	}

	public List<String> topKFrequent(String[] words, int k) {

		for (String w : words) {
			freq.put(w, freq.getOrDefault(w, 0) + 1);
		}

		Queue<String> queue = new PriorityQueue<String>(new Comparator<String>() {
			public int compare(String a1, String a2) {
				int r = Integer.compare(freq.get(a2), freq.get(a1));
                return r == 0 ? a1.compareTo(a2) : r;
			}
		});
		for(String s : freq.keySet()) {
			queue.offer(s);
		}
		List<String> result = new LinkedList<String>();
		for (int i = 0; i < k; ++i) {
			result.add(queue.poll());
		}
		return result;
	}

}
