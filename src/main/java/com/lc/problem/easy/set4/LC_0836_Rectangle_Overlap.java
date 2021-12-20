package com.lc.problem.easy.set4;

public class LC_0836_Rectangle_Overlap {

	public static void main(String[] args) {
		LC_0836_Rectangle_Overlap obj = new LC_0836_Rectangle_Overlap();
		int[] rec1 = { 0, 0, 1, 1 };
		int[] rec2 = { 1, 0, 2, 1 };
		obj.isRectangleOverlap(rec1, rec2);
	}

	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		int x1 = rec1[0];
		int y1 = rec1[1];
		int x2 = rec1[2];
		int y2 = rec1[3];

		int a1 = rec2[0];
		int b1 = rec2[1];
		int a2 = rec2[2];
		int b2 = rec2[3];

		if (x1 - x2 == 0 || y1 - y2 == 0) {
			return false;
		}
		if (a1 - a2 == 0 || b1 - b2 == 0) {
			return false;
		}

		if ((x1 >= a1 && x2 < a1) && (y1 <= a1 && y2 > a1) 
				|| (x1 <= a2 && x2 > a2) && (y1 <= a2 && y2 > a2)
				|| (x1 <= b1 && x2 > b1) && (y1 <= b1 && y2 > b1) || (x1 <= b2 && x2 > b2) && (y1 <= b2 && y2 > b2)) {
			return true;
		}
		return false;
	}

}
