package com.lc.problem;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LC_0733_Flood_Fill Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0733_Flood_Fill {

	public static void main(String args[]) {
		LC_0733_Flood_Fill obj = new LC_0733_Flood_Fill();

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

	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int currentColor = image[sr][sc];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(sr);
		queue.offer(sc);
		while (!queue.isEmpty()) {
			int new_sr = queue.poll();
			int new_sc = queue.poll();
			if (image[new_sr][new_sc] == currentColor) {
				image[new_sr][new_sc] = newColor;
			}
			if (new_sr > 0 && image[new_sr - 1][new_sc] == currentColor) {
				queue.offer(new_sr - 1);
				queue.offer(new_sc);
			}
			if (new_sr < image.length - 1 && image[new_sr + 1][new_sc] == currentColor) {
				queue.offer(new_sr + 1);
				queue.offer(new_sc);
			}
			if (new_sc > 0 && image[new_sr][new_sc - 1] == currentColor) {
				queue.offer(new_sr);
				queue.offer(new_sc - 1);
			}
			if (new_sc < image[0].length - 1 && image[new_sr][new_sc + 1] == currentColor) {
				queue.offer(new_sr);
				queue.offer(new_sc + 1);
			}
		}
		return image;
	}

}
