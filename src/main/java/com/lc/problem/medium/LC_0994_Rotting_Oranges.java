package com.lc.problem.medium;

/**
 * LC_0994_Rotting_Oranges Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0994_Rotting_Oranges {

	public static void main(String args[]) {
		LC_0994_Rotting_Oranges obj = new LC_0994_Rotting_Oranges();
		int[][] grid1 = { { 2, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		print(grid1);
		print(grid);
		System.out.println("");
		System.out.println("");
		int response = obj.orangesRotting(grid);
		System.out.println("");
		System.out.println("");
		print(grid);
		System.out.println(response);
	}

	private static void print(int[][] grid) {
		for (int row = 0; row < grid.length; ++row) {
			for (int col = 0; col < grid[row].length; ++col) {
				System.out.print(grid[row][col] + " ");
			}
			System.out.println("");
		}
	}

	private int allOnes = 0;

	public int orangesRotting(int[][] grid) {

		int response = 0;
		int initial = 2;
		boolean allRotten = false;
		for (int row = 0; row < grid.length; ++row) {
			for (int col = 0; col < grid[row].length; ++col) {
				if (grid[row][col] == 1) {
					allOnes++;
				}
			}
		}
		while (!allRotten) {
			allRotten = true;
			boolean updated = false;
			for (int row = 0; row < grid.length; ++row) {
				for (int col = 0; col < grid[row].length; ++col) {
					if (grid[row][col] == 0) {
						continue;
					}
					if (grid[row][col] == initial) {
						updated = setAdjacentRotten(grid, row, col, initial) || updated;
					}
				}
			}
			if (updated) {
				++response;
				allRotten = false;
			}
			initial++;
		}
		if (allOnes != 0) {
			return -1;
		}
		return response;
	}

	public boolean setAdjacentRotten(int[][] grid, int row, int col, int initial) {
		boolean response = false;
		if (row > 0 && grid[row - 1][col] == 1) {
			grid[row - 1][col] = initial + 1;
			allOnes--;
			response = true;
		}
		if (row < grid.length - 1 && grid[row + 1][col] == 1) {
			grid[row + 1][col] = initial + 1;
			allOnes--;
			response = true;
		}
		if (col > 0 && grid[row][col - 1] == 1) {
			grid[row][col - 1] = initial + 1;
			allOnes--;
			response = true;
		}
		if (col < grid[row].length - 1 && grid[row][col + 1] == 1) {
			grid[row][col + 1] = initial + 1;
			allOnes--;
			response = true;
		}
		return response;
	}

}
