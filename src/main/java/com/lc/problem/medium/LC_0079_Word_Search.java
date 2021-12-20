package com.lc.problem.medium;

public class LC_0079_Word_Search {

	public static void main(String[] args) {
		LC_0079_Word_Search obj = new LC_0079_Word_Search();
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean response = obj.exist(board, word);
		System.out.println(response);
	}

	public boolean exist(char[][] board, String word) {
		for (int row = 0; row < board.length; ++row)
		      for (int col = 0; col < board[0].length; ++col)
		        if (exist(board, row, col, word, 0))
		          return true;
		    return false;
	}

	public boolean exist(char[][] board, int row, int col, String word, int index) {
		if (index >= word.length())
			return true;

		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
				|| board[row][col] != word.charAt(index))
			return false;

		boolean ret = false;
		board[row][col] = '#';
		int[] rowOffsets = { 0, 0, 1, -1 };
		int[] colOffsets = { 1, -1, 0, 0 };

		for (int d = 0; d < 4; ++d) {
			ret = exist(board, row + rowOffsets[d], col + colOffsets[d], word, index + 1);
			if (ret) {
				break;
			}
		}
		board[row][col] = word.charAt(index);
		return ret;
	}

	protected boolean backtrack(char[][] board, int row, int col, String word, int index) {
		if (index >= word.length())
			return true;

		if (row < 0 || row == board.length || col < 0 || col == board[0].length
				|| board[row][col] != word.charAt(index))
			return false;

		boolean ret = false;
		board[row][col] = '#';

		int[] rowOffsets = { 0, 1, 0, -1 };
		int[] colOffsets = { 1, 0, -1, 0 };
		for (int d = 0; d < 4; ++d) {
			ret = this.backtrack(board, row + rowOffsets[d], col + colOffsets[d], word, index + 1);
			if (ret)
				break;
		}

		board[row][col] = word.charAt(index);
		return ret;
	}

}
