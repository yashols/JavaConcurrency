package com.lc.problem;

import java.util.LinkedList;
import java.util.Queue;

public final class LC_0733 {

	public static void main(String args[]) {
		LC_0733 obj = new LC_0733();

		int[][] image = { { 0, 0, 0 }, { 0, 1, 1 } };
		int sr = 1, sc = 1, newColor = 1;
		int[][] response = obj.floodFill(image, sr, sc, newColor);
		for (int i = 0; i < response.length; ++i) {
			for (int j = 0; j < response[i].length; ++j) {
				System.out.print(response[i][j] + " - ");
			}
			System.out.println("");
		}
	}

	private int[][] direction = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		if(image[sr][sc] == newColor) {
			return image;
		}
		Queue<int[]> queue = new LinkedList<>();
		int originalColor = image[sr][sc];
		queue.add(new int[] { sr, sc });

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; ++i) {
				int[] point = queue.poll();
				image[point[0]][point[1]] = newColor;
				for (int j = 0; j < direction.length; ++j) {
					int[] d = direction[j];
					boolean isValid = isValid(image, point[0] + d[0], point[1] + d[1], originalColor);
					if (isValid) {
						queue.add(new int[] { point[0] + d[0], point[1] + d[1] });
					}
				}
			}
		}

		return image;
	}

	private boolean isValid(int[][] image, int i, int j, int color) {
		if (i < 0 || i >= image.length || j < 0 || j >= image[i].length) {
			return false;
		}
		return image[i][j] == color;
	}

}
