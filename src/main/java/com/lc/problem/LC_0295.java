package com.lc.problem;

import java.util.PriorityQueue;

public class LC_0295 {

	private PriorityQueue<Integer> pq = new PriorityQueue<>();
	
	private PriorityQueue<Integer> pq2 = new PriorityQueue<>();

	public static void main(String[] args) {
		double result = 0;
		LC_0295 obj = new LC_0295();
		obj.addNum(1);
		obj.addNum(2);
		result = obj.findMedian();
		System.out.println(result);
		obj.addNum(3);
		result = obj.findMedian();
		System.out.println(result);
		obj.addNum(4);
		obj.addNum(5);
		obj.addNum(6);
		obj.addNum(7);
		obj.addNum(8);
		result = obj.findMedian();
		System.out.println(result);
		obj.addNum(9);
		result = obj.findMedian();
		System.out.println(result);
	}

	public void addNum(int num) {
		pq.offer(num);
	}

	public double findMedian() {
		double result = 0;
		int size = pq.size();
		int mid = size / 2;
		int counter = 0;
		if (size % 2 == 0) {
			
			while (++counter < mid) {
				pq2.offer(pq.poll());
			}
			if(!pq.isEmpty()) {
				pq2.offer(pq.peek());
				double first = pq.isEmpty() ? 0 : pq.poll();
	            double second = pq.isEmpty() ? 0 : pq.peek();
				result = (first + second) / 2;
				while(!pq2.isEmpty()) {
					pq.offer(pq2.poll());
				}
			}
		} else {
			
			while (++counter <= mid) {
				pq2.offer(pq.poll());
			}
			result = pq.peek();
			while(!pq2.isEmpty()) {
				pq.offer(pq2.poll());
			}
		}
		return result;
	}

}
