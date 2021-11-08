package com.lc.problem.easy.set3;

import java.util.HashMap;


/**
 * LC_167_TwoSum2 Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0167_TwoSum2
{

	public static void main(String args[]) {
		LC_0167_TwoSum2 obj = new LC_0167_TwoSum2();
		int[] numbers = {2,7,11,15};
		int target = 9;
		int[] response = obj.twoSum(numbers, target);
		System.out.println(response[0]);
		System.out.println(response[1]);
	}


	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> tracker = new HashMap<>();
		int[] response = new int[2];
		for(int i=0; i<numbers.length; ++i) {
			if(tracker.get(numbers[i]) != null) {
				response[0] = tracker.get(numbers[i]);
				response[1] = i+1;
			}
			tracker.put(target - numbers[i], i+1);
		}
		return response;
	}

}
