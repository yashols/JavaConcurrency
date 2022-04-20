package com.lc.problem;

import java.util.HashSet;
import java.util.Set;

public class LC_1102 {

	public static void main(String[] args) {
		LC_1102 obj = new LC_1102();
		int[][] grid = { { 2, 0, 2, 3, 1 }, { 0, 2, 2, 3, 3 }, { 2, 3, 0, 2, 3 }, { 1, 1, 2, 3, 1 },
				{ 2, 2, 0, 0, 1 } };
		int result = obj.maximumMinimumPath(grid);
		System.out.println(result);
	}

	private int min = Integer.MAX_VALUE;

	private Set<String> visited = new HashSet<>();

	private int[][] directions = { { 1, 0 }, { 0,1 }, { -1, 0 }, { 0, -1 } };

	public int maximumMinimumPath(int[][] grid) {
		int row = 0;
		int col = 0;
		int m = grid.length;
		int n = grid[0].length;
		visited.add("0-0");
		while (row < m - 1 || col < n - 1) {
			min = Math.min(min, grid[row][col]);
			int[] nextMove = getNextMove(grid, row, col, m, n);
			row = nextMove[0];
			col = nextMove[1];
		}
		return min;
	}

	private int[] getNextMove(int[][] grid, int row, int col, int m, int n) {
		int[] nextMove = new int[2];
		int max = -1;
		for (int[] direction : directions) {
			int val = getValue(grid, row, col, m, n, direction[0], direction[1]);
			if (max < val) {
				max = val;
				nextMove = new int[] { row + direction[0], col + direction[1] };
			}
		}
		return nextMove;
	}

	private int getValue(int[][] grid, int row, int col, int m, int n, int r, int c) {
		if (row + r < 0 || col + c < 0 || row + r >= m || col + c >= n) {
			return -1;
		}
		if (visited.contains((row + r) + "-" + (col + c))) {
			return -1;
		}
		visited.add((row + r) + "-" + (col + c));
		return grid[row + r][col + c];
	}
}
