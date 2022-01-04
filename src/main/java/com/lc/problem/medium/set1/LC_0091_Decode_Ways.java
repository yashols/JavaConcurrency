package com.lc.problem.medium.set1;

public class LC_0091_Decode_Ways {

	public static void main(String[] args) {
		LC_0091_Decode_Ways obj = new LC_0091_Decode_Ways();
		obj.numDecodings("226");
	}

	public int numDecodings(String s) {
		return recursiveWithMemo(0, s);
	}

	private int recursiveWithMemo(int index, String str) {

		// If you reach the end of the string
		// Return 1 for success.
		if (index == str.length()) {
			return 1;
		}

		// If the string starts with a zero, it can't be decoded
		if (str.charAt(index) == '0') {
			return 0;
		}

		if (index == str.length() - 1) {
			return 1;
		}

		int ans = recursiveWithMemo(index + 1, str);
		if (Integer.parseInt(str.substring(index, index + 2)) <= 26) {
			ans += recursiveWithMemo(index + 2, str);
		}

		return ans;
	}
}
