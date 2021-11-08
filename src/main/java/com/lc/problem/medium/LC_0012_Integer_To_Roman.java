package com.lc.problem.medium;

/**
 * LC_0012_Integer_To_Roman Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0012_Integer_To_Roman {

	public static void main(String args[]) {
		LC_0012_Integer_To_Roman obj = new LC_0012_Integer_To_Roman();
		String response = obj.intToRoman(901);
		System.out.println(response);
	}

	public String intToRoman(int num) {

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num -= values[i];
				sb.append(strs[i]);
			}
		}
		return sb.toString();
	}

}
