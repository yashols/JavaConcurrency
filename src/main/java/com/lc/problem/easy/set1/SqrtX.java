package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class SqrtX {

	public static void main(String arg[]) {
		SqrtX obj = new SqrtX();
		int a = 2147395599;
		int v = obj.mySqrt(a);
		System.out.print(v);
	}

	public int mySqrt(int x) {
		return binary(1, x, x);
	}

	private int binary(int i, int j, int input) {
		if (i <= j) {
			int mid = i + ((j - i) / 2);
			int val = input / mid;
			if (mid == val) {
				return mid;
			}
			if (mid > val) {
				return binary(i, mid - 1, input);
			} else {
				return binary(mid + 1, j, input);
			}
		}
		return i - 1;
	}

}
