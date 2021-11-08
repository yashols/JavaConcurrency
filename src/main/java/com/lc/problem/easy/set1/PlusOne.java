package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class PlusOne {

	public static void main(String arg[]) {
		PlusOne obj = new PlusOne();
		int[] arr = { 9, 9, 9 };
		int[] v = obj.plusOne(arr);
		for (int i : v) {
			System.out.print(i);
		}
	}

	public int[] plusOne(int[] digits) {
		boolean overflow = true;
		for (int i = digits.length - 1; i >= 0; --i) {
			if (digits[i] == 9) {
				digits[i] = 0;
				continue;
			}
			overflow = false;
			digits[i] = digits[i] + 1;
			break;
		}
		if (overflow) {
			int[] new1 = new int[digits.length + 1];
			new1[0] = 1;
			return new1;
		}
		return digits;
	}

}
