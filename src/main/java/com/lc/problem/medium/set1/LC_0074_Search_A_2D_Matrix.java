package com.lc.problem.medium.set1;

public class LC_0074_Search_A_2D_Matrix {

	public static void main(String[] args) {
		LC_0074_Search_A_2D_Matrix obj = new LC_0074_Search_A_2D_Matrix();
		int[][] matrix = { { 1 } };
		obj.searchMatrix(matrix, 2);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int row = findRow(matrix, target);
		if(row == -1) {
			return false;
		}
		return findElement(matrix[row], target);
	}

	public boolean findElement(int[] row, int target) {
		int low = 0;
		int high = row.length;
		while (low <= high) {
			int element = low + (high - low) / 2;
			if (row[element] == target) {
				return true;
			}
			if (row[element] < target) {
				low = element + 1;
			} else {
				high = element - 1;
			}
		}
		return false;
	}

	private int findRow(int[][] matrix, int target) {

		int low = 0;
		int high = matrix.length;
		int row = 0;
		while (low < high) {
			row = low + (high - low) / 2;
			if (matrix[row][0] == target) {
				return row;
			}
			if (matrix[row][0] < target) {
				low = row + 1;
			} else {
				high = row - 1;
			}
		}
		return low;

	}

}
