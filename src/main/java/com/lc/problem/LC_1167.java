package com.lc.problem;

import java.util.PriorityQueue;

public class LC_1167 {

	public static void main(String[] args) {
		LC_1167 obj = new LC_1167();
		int[] sticks = { 10, 11, 12, 13 };
		int result = obj.connectSticks(sticks);
		System.out.println(result);
	}

	public int connectSticks(int[] sticks) {
		int totalCost = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < sticks.length; ++i) {
			pq.offer(sticks[i]);
		}
		while (pq.size() != 1) {
			int i = pq.poll();
			int j = pq.poll();
			int newStick = i + j;
			totalCost += newStick;
			pq.offer(newStick);
		}
		return totalCost;
	}

}
