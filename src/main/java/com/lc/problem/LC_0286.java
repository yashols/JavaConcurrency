package com.lc.problem;

import java.util.LinkedList;
import java.util.Queue;

public class LC_0286 {

	public static void main(String[] args) {
		LC_0286 obj = new LC_0286();
		int[][] rooms = { { 2147483647, -1, 0, 2147483647 }, { 2147483647, 2147483647, 2147483647, -1 },
				{ 2147483647, -1, 2147483647, -1 }, { 0, -1, 2147483647, 2147483647 } };
		obj.wallsAndGates(rooms);
		for (int i = 0; i < rooms.length; ++i) {
			for (int j = 0; j < rooms[i].length; ++j) {
				System.out.print(rooms[i][j] + " -> ");
			}
			System.out.println("");
		}
	}

	private int[][] v = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

	public void wallsAndGates(int[][] rooms) {
		Queue<int[]> q = new LinkedList<int[]>();
		for (int i = 0; i < rooms.length; ++i) {
			for (int j = 0; j < rooms[i].length; ++j) {
				if (rooms[i][j] == 0) {
					q.add(new int[] { i, j });
				}
			}
		}
		while (!q.isEmpty()) {
			int[] point = q.poll();
			for (int[] direction : v) {
				int r = direction[0] + point[0];
				int c = direction[1] + point[1];
				if (r < 0 || r >= rooms.length || c < 0 || c >= rooms[r].length || rooms[r][c] == -1
						|| rooms[r][c] != 2147483647) {
					continue;
				}
				rooms[r][c] = rooms[point[0]][point[1]] + 1;
				q.add(new int[] { r, c });
			}
		}
	}

}
