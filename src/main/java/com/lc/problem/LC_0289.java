package com.lc.problem;

public class LC_0289 {

	public static void main(String[] args) {
		LC_0289 obj = new LC_0289();
		int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		obj.gameOfLife(board);
	}

	public void gameOfLife(int[][] board) {
		int[][] result = new int[board.length][board[0].length];
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {

				result[i][j] = checkLive(i, j, board) ? 1 : 0;

			}
		}
		for (int i = 0; i < board.length; ++i) {
			for (int j = 0; j < board[i].length; ++j) {

				board[i][j] = result[i][j];

			}
		}
	}

	private boolean checkLive(int i, int j, int[][] board) {
		int[][] places = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
		int livePlaces = 0;
		int deadPlaces = 0;
		for (int p = 0; p < places.length; ++p) {

			int row = places[p][0]+i;
			int col = places[p][1]+j;

			if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
				continue;
			}
			if (board[row][col] == 1) {
				++livePlaces;
			}
			if (board[row][col] == 0) {
				++deadPlaces;
			}
		}
		if (livePlaces == 2 || livePlaces == 3 || deadPlaces == 3) {
			return true;
		}
		return false;
	}
}
