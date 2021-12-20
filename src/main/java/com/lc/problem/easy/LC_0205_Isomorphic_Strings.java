package com.lc.problem.easy;

import java.util.HashMap;
import java.util.Map;

public class LC_0205_Isomorphic_Strings {

	public static void main(String args[]) {
		LC_0205_Isomorphic_Strings obj = new LC_0205_Isomorphic_Strings();
		boolean response = obj.isIsomorphic1("paper", "title");
		System.out.print(response);

		boolean response2 = obj.isIsomorphic("paper", "title");
		System.out.print(response2);
	}

	public boolean isIsomorphic(String s, String t) {
		String transform = checkStrings2(s, t);
		return t.equals(transform);
	}

	public String checkStrings2(String first, String second) {
		StringBuilder sb = new StringBuilder();
		Map<Character, Character> match = new HashMap<>();
		for (int i = 0; i < first.length(); i++) {
			Character c = first.charAt(i);
			if (match.containsKey(c)) {
				sb.append(match.get(c));
			} else {
				match.put(c, second.charAt(i));
				sb.append(second.charAt(i));
			}
		}
		return sb.toString();
	}

	public boolean isIsomorphic1(String s, String t) {
		return checkStrings(s, t) && checkStrings(t, s);
	}

	public boolean checkStrings(String first, String second) {
		Map<Character, Character> match = new HashMap<>();
		for (int i = 0; i < first.length(); i++) {
			Character c = first.charAt(i);
			if (match.containsKey(c) && match.get(c) != second.charAt(i)) {
				return false;
			}
			match.put(c, second.charAt(i));
		}
		return true;
	}

}
