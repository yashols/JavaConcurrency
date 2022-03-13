package com.lc.problem;

import java.util.PriorityQueue;

public class LC_1642 {

	public static void main(String[] args) {
		LC_1642 obj = new LC_1642();
		int[] heights = { 14, 3, 19, 3 };
		int result = obj.furthestBuilding(heights, 17, 0);
		System.out.println(result);
	}

	public int furthestBuilding(int[] heights, int bricks, int ladders) {
		PriorityQueue<Integer> pqLadders = new PriorityQueue<>();
		int i = 0;
		int laddersUsed = 0;
		for (i = 0; i < heights.length - 1; ++i) {
			int nextHeight = heights[i + 1] - heights[i];
			if (nextHeight <= 0) {
				continue;
			}
			if (laddersUsed < ladders) {
				++laddersUsed;
				pqLadders.add(nextHeight);
				continue;
			}

			int minLadderUsed = pqLadders.isEmpty() ? 0 : pqLadders.peek();

			if (!pqLadders.isEmpty() && nextHeight > minLadderUsed) {
				// --laddersUsed;
				bricks -= minLadderUsed;
				pqLadders.poll();
				pqLadders.offer(nextHeight);
				if (bricks < 0) {
					break;
				}
			} else if (bricks < nextHeight) {
				break;
			} else {
				bricks -= nextHeight;
			}
		}
		return i;
	}

}
