package com.lc.problem;

import java.util.Arrays;

public class LC_0881 {

	public static void main(String[] args) {
		LC_0881 obj = new LC_0881();
		int[] people = { 3, 2, 3, 2, 2 };
		int limit = 6;
		int result = obj.numRescueBoats(people, limit);
		System.out.println(result);
	}

	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int totalWeight = 0;
		int totalBoats = 0;
		for (int i = people.length - 1; i >= 0; --i) {
			if (people[i] == 0) {
				continue;
			}
			totalWeight = people[i];
			people[i] = 0;
			if (totalWeight == limit) {
				++totalBoats;
				totalWeight = 0;
				continue;
			}
			for (int j = i - 1; j >= 0; --j) {
				if (people[j] != 0 && people[j] <= limit - totalWeight) {
					people[j] = 0;
					break;
				}
			}
			++totalBoats;
			totalWeight = 0;
		}
		return totalBoats;
	}
}
