package com.lc.problem.medium.set2;

/**
 * LC_0130_Surrounded_Regions Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0130_Surrounded_Regions {

	public static void main(String[] args) {
		LC_0130_Surrounded_Regions obj = new LC_0130_Surrounded_Regions();

		final char[][] board = {{'O', 'O'}, {'O', 'O'}};
		obj.solve(board);
	}

	public void solve(char[][] board) {
		int rows = board.length;
		int columns = board[0].length;
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < columns; ++col) {
				if ((row == 0 || col == 0 || row == rows - 1 || col == columns - 1) && (board[row][col] == 'O')) {
					setAdjusent(row, col, rows, columns, board);
				}
			}
		}

		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < columns; ++col) {
				if (board[row][col] == 'O') {
					board[row][col] = 'X';
				}
				if (board[row][col] == 'N') {
					board[row][col] = 'O';
				}
			}
		}
	}

	public void setAdjusent(int row, int col, int rowLength, int colLength, char[][] board) {
		if (row < 0 || row >= rowLength || col < 0 || col >= colLength) {
			return;
		}
		board[row][col] = 'N';
		if (row < rowLength - 1 && board[row + 1][col] == 'O') {
			setAdjusent(row + 1, col, rowLength, colLength, board);
		}
		if (row > 0 && board[row - 1][col] == 'O') {
			setAdjusent(row - 1, col, rowLength, colLength, board);
		}
		if (col < colLength - 1 && board[row][col + 1] == 'O') {
			setAdjusent(row, col + 1, rowLength, colLength, board);
		}
		if (col > 0 && board[row][col - 1] == 'O') {
			setAdjusent(row, col - 1, rowLength, colLength, board);
		}
	}

}
