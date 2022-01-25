package com.lc.problem;

public class LC_0849_Maximize_Distance_Closest_Person {

	public static void main(String[] args) {
		LC_0849_Maximize_Distance_Closest_Person obj = new LC_0849_Maximize_Distance_Closest_Person();
		int[] seats = { 1, 0, 0, 0 };
		int result = obj.maxDistToClosest(seats);
		System.out.println(result);
	}

	public int maxDistToClosest(int[] seats) {
		int maxDistance = 1;
		for (int i = 0; i < seats.length; ++i) {
			if (seats[i] == 1) {
				continue;
			}
			int left = i - 1;
			boolean leftFound = false;
			while (left >= 0) {
				leftFound = true;
				if (seats[left] == 1) {
					break;
				}
				--left;
			}
			int leftDistance = i - left;

			int right = i + 1;
			boolean rightFound = false;
			while (right < seats.length) {
				rightFound = true;
				if (seats[right] == 1) {
					break;
				}
				++right;
			}
			int rightDistance = right - i;
			int d = 0;
			if (leftFound && rightFound) {
				d = Math.min(leftDistance, rightDistance);
			} else if(leftFound && !rightFound) {
				d = leftDistance;
			} else if(!leftFound && rightFound) {
				d = rightDistance;
			}
			maxDistance = Math.max(maxDistance, d);
		}
		return maxDistance;
	}
}
