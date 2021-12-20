package com.lc.problem.easy;

public class LC_1640_Check_Array_Formation_Through_Concatenation {

	public static void main(String[] args) {
		LC_1640_Check_Array_Formation_Through_Concatenation obj = new LC_1640_Check_Array_Formation_Through_Concatenation();
		int[] arr = { 49, 18, 16 };
		int[][] pieces = { { 16, 18, 49 } };
		obj.canFormArray(arr, pieces);
	}

	public boolean canFormArray(int[] arr, int[][] pieces) {
		int checkArr = 0;

		for (int i = 0; i < arr.length; ++i) {

			for (int j = 0; j < pieces.length; ++j) {
				if (arr[checkArr] == pieces[j][0]) {

					for (int k = 0; k < pieces[j].length; ++k) {
						if (arr[checkArr] != pieces[j][k]) {
							return false;
						} else {
							++checkArr;
							if (checkArr == arr.length) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
}
