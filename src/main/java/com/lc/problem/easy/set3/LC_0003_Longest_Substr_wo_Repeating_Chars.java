package com.lc.problem.easy.set3;

import java.util.Stack;

/**
 * LC_0003_Longest_Substr_wo_Repeating_Chars Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0003_Longest_Substr_wo_Repeating_Chars {
	public static void main(String args[]) {
		LC_0003_Longest_Substr_wo_Repeating_Chars obj = new LC_0003_Longest_Substr_wo_Repeating_Chars();
		int response = obj.lengthOfLongestSubstring("pwwkew");
		System.out.println(response);
	}

	public int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		Stack<Character> stack = new Stack<>();
		int totalLength = s.length();
		int counter = 0;
		int max = 0;
		while (counter < totalLength) {
			if (stack.contains(s.charAt(counter))) {
				stack.remove(0);
			} else {
				stack.add(s.charAt(counter));
				counter++;
			}
			if (max < stack.size()) {
				max = stack.size();
			}
		}
		return max;
	}

}
