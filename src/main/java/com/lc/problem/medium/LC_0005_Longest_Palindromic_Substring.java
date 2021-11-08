package com.lc.problem.medium;

/**
 * LC_0005_Longest_Palindromic_Substring Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0005_Longest_Palindromic_Substring {

	public static void main(String args[]) {
		LC_0005_Longest_Palindromic_Substring obj = new LC_0005_Longest_Palindromic_Substring();
		String s = "a";
		String response = obj.longestPalindrome(s);
		System.out.println(response);
	}


	public String longestPalindrome(String s) {
		String response = "";
		int max = 0;
		for (int i = 0; i < s.length(); ++i) {
			for (int j = i; j < s.length(); ++j) {
				String sub = s.substring(i, j);
				if (isPalindrome(sub)) {
					if (max < sub.length()) {
						max = sub.length();
						response = sub;
					}
				}
			}
		}
		return response;
	}


	private boolean isPalindrome(final String sub) {
		for (int i = 0; i < sub.length() / 2; ++i) {
			if (sub.charAt(i) != sub.charAt(sub.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
