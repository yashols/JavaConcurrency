package com.lc.topics.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class The_K_Weakest_Rows_In_A_Matrix {

	public static void main(String[] args) {
		The_K_Weakest_Rows_In_A_Matrix obj = new The_K_Weakest_Rows_In_A_Matrix();
		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		obj.kWeakestRows(mat, 3);
	}

	public int[] kWeakestRows(int[][] mat, int k) {
		int[] result = new int[k];
		PriorityQueue<Tracker> pq = new PriorityQueue<Tracker>(new Comparator<Tracker>() {
			@Override
			public int compare(Tracker o1, Tracker o2) {
				return o1.soldiers == o2.soldiers ? o1.rowIndex - o2.rowIndex : o1.soldiers - o2.soldiers;
			}
		});

		for (int i = 0; i < mat.length; ++i) {
			int soldiers = 0;
			for (int j = 0; j < mat[i].length; ++j) {
				if (mat[i][j] == 1) {
					++soldiers;
				} else {
					break;
				}
			}
			Tracker t = new Tracker(i, soldiers);
			pq.add(t);
		}

		for (int i = 0; i < k; ++i) {
			result[i] = pq.poll().rowIndex;
		}

		return result;
	}

}

class Tracker {
	public int rowIndex;
	public int soldiers;

	public Tracker(int row, int s) {
		this.rowIndex = row;
		this.soldiers = s;
	}
}
