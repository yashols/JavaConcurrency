package com.lc.problem;

public class LC_1663 {

	public static void main(String[] args) {
		LC_1663 obj = new LC_1663();
		String result = obj.getSmallestString(5, 73);
		System.out.println(result);
	}

	public String getSmallestString(int n, int k) {
		StringBuffer sb = new StringBuffer(n);
		for (int i = n - 1; i >= 0; --i) {
			sb.append('a');
		}
		k -= n;
		for (int i = n - 1; i >= 0; --i) {
			if (k > 25) {
				sb.setCharAt(i, 'z');
				k -= 25;
			} else {
				sb.setCharAt(i, (char) ('a' + k));
				break;
			}
		}

		return sb.toString();
	}
}
