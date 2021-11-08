package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class ValidPalindrome {

	public static void main(String[] args) {
		ValidPalindrome n = new ValidPalindrome();
		String s = "abba";
		boolean response = n.isPalindrome(s);
		System.out.println(response);
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int min = 0, max = s.length() - 1;
		while (min < max) {
			if (!isAlphanumeric(s.charAt(min))) {
				++min;
			} else if (!isAlphanumeric(s.charAt(max))) {
				--max;

			} else if (s.charAt(min++) != s.charAt(max--)) {
				return false;
			}
		}
		return true;
	}

	private boolean isAlphanumeric(char c) {
		if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
			return true;
		} else {
			return false;
		}
	}

}
