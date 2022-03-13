package com.lc.problem;

import java.util.Stack;

public class LC_0200 {

	public static void main(String[] args) {
		LC_0200 obj = new LC_0200();
		char[][] grid = { 
				{ '1', '1', '0', '0', '0' }, 
				{ '1', '1', '0', '0', '0' }, 
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } 
				};
		int result = obj.numIslands(grid);
		System.out.println(result);
	}
	
	public int numIslands(char[][] grid) {
		int result = 0;
		for(int r=0; r<grid.length; ++r) {
			for(int c=0; c<grid[r].length; ++c) {
				if(grid[r][c] == '1') {
					++result;
					update(grid, r, c);
				}
			}
		}
		return result;
	}
	
	public void update(char[][]grid, int r, int c) {
		if(r >= grid.length || r < 0 || c >= grid[r].length || c < 0) {
			return;
		}
		if(grid[r][c] == '1') {
			grid[r][c] = '2';
			update(grid, r+1, c);
			update(grid, r, c+1);
			update(grid, r-1, c);
			update(grid, r, c-1);
		}
		
		
	}


}
