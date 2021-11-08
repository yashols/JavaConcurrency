package com.lc.problem.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * LC_0260_Single_Number_III Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0260_Single_Number_III {

	public static void main(String args[]) {
		LC_0260_Single_Number_III obj = new LC_0260_Single_Number_III();
		int[] response = obj.singleNumber(new int[] { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4 });
		System.out.println(response[0]);
		System.out.println(response[1]);
	}

	public int[] singleNumber(int[] nums) {
		Set<Integer> sets = new HashSet<>();
		for (int n : nums) {
			if (sets.contains(n)) {
				sets.remove(n);
			} else {
				sets.add(n);
			}
		}
		int[] response = new int[2];
		int i = 0;
		for (int a : sets) {
			response[i++] = a;
		}
		return response;
	}

}
