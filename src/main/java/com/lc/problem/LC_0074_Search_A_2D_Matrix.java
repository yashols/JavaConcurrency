package com.lc.problem;

public class LC_0074_Search_A_2D_Matrix {

	public static void main(String[] args) {
		LC_0074_Search_A_2D_Matrix obj = new LC_0074_Search_A_2D_Matrix();
		// int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		// int digit = 3;
		// int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		// int digit = 13;
		// int[][] matrix = { { 1, 1 } };
		// int digit = 0;
		// int[][] matrix = { { 1 } };
		// int digit = 1;
		int[][] matrix = { { 1, 1 } };
		int digit = 2;
		boolean result = obj.searchMatrix(matrix, digit);
		System.out.println(result);
	}

	public boolean searchMatrix(int[][] matrix, int target) {
		int row = matrix.length;
		int col = matrix[0].length;
		return search(matrix, target, 0, row * col - 1);
	}

	private boolean search(int[][] matrix, int target, int left, int right) {
		if (left > right) {
			return false;
		}
		int mid = left + (right - left) / 2;
		int row = mid / matrix[0].length;
		int col = mid % matrix[0].length;
		if (matrix[row][col] == target) {
			return true;
		}
		if (matrix[row][col] < target) {
			return search(matrix, target, mid + 1, right);
		} else {
			return search(matrix, target, left, mid - 1);
		}
	}

}
