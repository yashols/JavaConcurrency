package com.lc.topics.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		Kth_Largest_Element_in_an_Array obj = new Kth_Largest_Element_in_an_Array();
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int result = obj.findKthLargest(nums, 2);
		System.out.println(result);
	}

	public int findKthLargest(int[] nums, int k) {
		if (nums.length == 0) {
			return 0;
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : nums) {
			pq.offer(i);
		}
		int counter = 0;
		while (counter++ <= k) {
			if(counter == k) {
				return pq.poll();
			}
			pq.poll();
		}
		return -1;
	}

}
