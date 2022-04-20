package com.lc.problem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * LC_0003_Longest_Substr_wo_Repeating_Chars Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0003 {
	public static void main(String args[]) {
		LC_0003 obj = new LC_0003();
		int response = obj.lengthOfLongestSubstring("bbbbb");
		System.out.println(response);
	}

	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<>();
		Queue<Character> queue = new LinkedList<>();
		int result = 0;
		for (int i = 0; i < s.length(); ++i) {
			Character c = s.charAt(i);
			if (set.contains(c)) {
				Character qchar = queue.poll();
				set.remove(qchar);
				while (qchar != c) {
					qchar = queue.poll();
					set.remove(qchar);
				}
			}
			set.add(c);
			
			queue.add(c);
			result = Math.max(result, queue.size());
		}
		return Math.max(result, queue.size());
	}

}
