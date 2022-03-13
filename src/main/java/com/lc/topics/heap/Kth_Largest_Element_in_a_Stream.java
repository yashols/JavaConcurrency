package com.lc.topics.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Kth_Largest_Element_in_a_Stream {

	public static void main(String[] args) {
		Kth_Largest_Element_in_a_Stream obj = new Kth_Largest_Element_in_a_Stream();
		int[] nums = { 0 };
		obj.kthLargest(2, nums);

		int result = obj.add(-1); // return 4
		System.out.println(result);
		result = obj.add(1); // return 5
		System.out.println(result);
		result = obj.add(-2); // return 5
		System.out.println(result);
		result = obj.add(-4); // return 8
		System.out.println(result);
		result = obj.add(3); // return 8
		System.out.println(result);
	}

	private Queue<Integer> pq = new PriorityQueue<>();

	public void kthLargest(int k, int[] nums) {
		for (int i = 0; i < nums.length; ++i) {
			if (pq.size() == k) {
				if (nums[i] > pq.peek()) {
					pq.poll();
					pq.offer(nums[i]);
				}
			} else {
				pq.offer(nums[i]);
			}
		}
	}

	public int add(int val) {
		if (pq.isEmpty()) {
			pq.offer(val);
		}
		if (val > pq.peek()) {
			pq.poll();
			pq.offer(val);
			return pq.peek();
		} else {
			return pq.peek();
		}
	}

}
