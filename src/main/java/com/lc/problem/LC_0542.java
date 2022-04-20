package com.lc.problem;

public class LC_0542 {

	public static void main(String[] args) {
		LC_0542 obj = new LC_0542();
		int[][] mat = { { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		int[][] result = obj.updateMatrix(mat);
		for (int r = 0; r < result.length; ++r) {
			for (int c = 0; c < result[r].length; ++c) {
				System.out.print(result[r][c] + " - ");
			}
			System.out.println("");
		}

	}

	public int[][] updateMatrix(int[][] mat) {
		for (int r = 0; r < mat.length; ++r) {
			for (int c = 0; c < mat[r].length; ++c) {
				if (mat[r][c] != 0) {
					int right = getValue(mat, r, c + 1);
					int down = getValue(mat, r + 1, c);
					mat[r][c] = Math.min(right, down) + 1;
				}
			}
		}
		for (int r = mat.length - 1; r >= 0; --r) {
			for (int c = mat[r].length - 1; c >= 0; --c) {
				if (mat[r][c] != 0) {
					int left = getValue(mat, r, c - 1);
					int up = getValue(mat, r - 1, c);
					mat[r][c] = Math.min(left, up) + 1;
				}
			}
		}
		return mat;
	}

	private int getValue(int[][] mat, int r, int c) {
		if (r >= mat.length) {
			return mat[r - 1][c];
		}
		if(r == -1) {
			r = 0;
		}
		if (c >= mat[r].length) {
			return mat[r][c - 1];
		}
		if (r < 0) {
			return mat[r + 1][c];
		}
		if (c < 0) {
			return mat[r][c + 1];
		}
		return mat[r][c];
	}

}
