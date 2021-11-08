package com.problems.random;

import java.util.ArrayList;
import java.util.List;

/**
 * AllString Description.
 *
 * @author Yashol Sharma
 */
public final class AllString {

	public static void main(String[] args) {
		int num = 123;
		System.out.println(getStrings(num));
	}

	private static List<String> getStrings(int num) {
		List<String> res = new ArrayList<>();
		dfs(Integer.toString(num), res, 0, new StringBuilder());
		return res;
	}

	private static void dfs(String num, List<String> res, int cur, StringBuilder sb) {
		if (cur > num.length()) {
			return;
		}
		if (cur == num.length()) {
			res.add(sb.toString());
			return;
		}
		sb.append((char) (num.charAt(cur) - '0' - 1 + 'a'));
		dfs(num, res, cur + 1, sb);
		sb.deleteCharAt(sb.length() - 1);
		if (cur < num.length() - 1 && Integer.valueOf(num.substring(cur, cur + 2)) < 26) {
			char next = (char) (Integer.parseInt(num.substring(cur, cur + 2)) - 1 + 'a');
			sb.append(next);
			dfs(num, res, cur + 2, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
