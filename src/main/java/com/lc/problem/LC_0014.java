package com.lc.problem;

public class LC_0014 {

	public static void main(String[] args) {
		LC_0014 obj = new LC_0014();
		String[] strs = { "a" };
		obj.longestCommonPrefix(strs);
	}

	public String longestCommonPrefix(String[] strs) {
		boolean isEmpty = false;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while (!isEmpty) {
			char c = ' ';
			for (String s : strs) {
				if ("".equals(s) || s.length() == sb.length()) {
					isEmpty = true;
					break;
				}
				if (c == ' ') {
					c = s.charAt(i);
				} else {
					if (c != s.charAt(i)) {
						isEmpty = true;
						break;
					}
				}
			}
			if(!isEmpty) {
				++i;
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
