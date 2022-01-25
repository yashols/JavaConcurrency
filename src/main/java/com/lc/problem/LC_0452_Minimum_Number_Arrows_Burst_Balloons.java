package com.lc.problem;

import java.util.Arrays;

public class LC_0452_Minimum_Number_Arrows_Burst_Balloons {

	public static void main(String[] args) {
		LC_0452_Minimum_Number_Arrows_Burst_Balloons obj = new LC_0452_Minimum_Number_Arrows_Burst_Balloons();

		//int[][] points = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };
		//int[][] points = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		int[][] points = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
		int result = obj.findMinArrowShots(points);
		System.out.println(result);
	}

	public int findMinArrowShots(int[][] points) {
		int result = 0;
		// sort by shortest distance
		Arrays.sort(points, (a, b) -> Integer.compare(a[1] - a[0], b[1] - b[0]));
		for (int i = 0; i < points.length; ++i) {
			
			int[] p = points[i];
			if(p[0] == -1) {
				continue;
			}
			++result;
			int left = p[0];
			int right = p[1];
			for(int j=i+1; j<points.length; ++j) {
				int[] n = points[j];
				if((n[0] <= right && n[1] >= right) || (n[0] <= left && n[1] >= left)) {
					n[0] = -1;
				}
			}
		}
		return result;
	}

}
