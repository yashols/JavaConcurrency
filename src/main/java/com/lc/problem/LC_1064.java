package com.lc.problem;

public class LC_1064 {

	public static void main(String[] args) {
		LC_1064 obj = new LC_1064();
		int[] arr = { 0, 1, 3, 7, 8, 9 };
		int result = obj.fixedPoint(arr);
		System.out.println(result);
	}

	public int fixedPoint(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;
		while (left < right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == mid) {
				result = mid;
				right = mid;
			}
			if (arr[mid] < mid) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return result;
	}

}
