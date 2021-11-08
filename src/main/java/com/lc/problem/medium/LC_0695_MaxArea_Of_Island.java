package com.lc.problem.medium;

/**
 * LC_0695_MaxArea_Of_Island Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0695_MaxArea_Of_Island {

	public static void main(String args[]) {
		LC_0695_MaxArea_Of_Island obj = new LC_0695_MaxArea_Of_Island();
		int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 } };

		int[][] grid2 = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		int response = obj.maxAreaOfIsland(grid2);
		System.out.println(response);
		System.out.println(grid);
	}

	public int maxAreaOfIsland(int[][] grid) {
		int response = 0;

		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j < grid[i].length; ++j) {
				if (grid[i][j] == 1) {
					System.out.println("-------------");
					print(grid);
					int counter = search(grid, i, j);
					response = Math.max(response, counter);
				}
			}
		}

		return response;
	}

	private void print(final int[][] grid) {
		for (int i = 0; i < grid.length; ++i) {
			for (int j = 0; j < grid[i].length; ++j) {
				System.out.print(grid[i][j] + ", ");
			}
			System.out.println("");
		}

	}

	private int search(final int[][] grid, final int i, final int j) {

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
			return 0;
		}
		if (grid[i][j] == 1) {
			grid[i][j] = 0;
		}
		return 1 + search(grid, i + 1, j) + search(grid, i - 1, j) + search(grid, i, j + 1) + search(grid, i, j - 1);
	}
}
