package com.lc.problem;

import java.util.LinkedList;
import java.util.Queue;

public class LC_0346 {

	public static void main(String[] args) {
		LC_0346 obj = new LC_0346(3);
		System.out.println(obj.next(1));
		System.out.println(obj.next(10));
		System.out.println(obj.next(3));
		System.out.println(obj.next(5));
	}
	
	private Queue<Integer> queue = null;
    private double total = 0;
    private int s = 0;
    
    public LC_0346(int size) {
        queue = new LinkedList<Integer>();
        s = size;
    }
    
    public double next(int val) {
        total += val;
        if(queue.size() == s) {
        	total -= queue.poll();
        }
        queue.offer(val);
        return total / queue.size();
    }
	
}
