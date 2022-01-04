package com.lc.problem.medium.set1;

import java.util.HashSet;
import java.util.Set;

/**
 * LC_0003_LongestSubstringWORepeating Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0003_LongestSubstringWORepeating {

	public static void main(String args[]) {
		LC_0003_LongestSubstringWORepeating object = new LC_0003_LongestSubstringWORepeating();
		int response = object.lengthOfLongestSubstring("dvdf");
		System.out.println(response);
	}

	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Set<Character> set = new HashSet<Character>();
		int left_slide = 0;
		int right_slide = 0;
		int maxSize = 0;

		while (right_slide < s.length()) {
			if (set.contains(s.charAt(right_slide))) {
				set.remove(s.charAt(left_slide));
				left_slide++;
			} else {
				set.add(s.charAt(right_slide));
				right_slide++;
				maxSize = Math.max(set.size(), maxSize);
			}
		}
		return maxSize;
	}

}
