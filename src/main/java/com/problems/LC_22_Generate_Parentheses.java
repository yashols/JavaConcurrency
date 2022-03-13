package com.problems;

import java.util.ArrayList;
import java.util.List;

public class LC_22_Generate_Parentheses {

	public static void main(String[] args) {
		LC_22_Generate_Parentheses obj = new LC_22_Generate_Parentheses();
		List<String> result = obj.generateParenthesis(3);
		for (String s : result) {
			System.out.println(s);
		}
	}

	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<>();
		if (n == 0) {
			result.add("");
		} else {
			for (int i = 0; i < n; ++i) {
				for (String s1 : generateParenthesis(i)) {
					for (String s2 : generateParenthesis(n - i - 1)) {
						result.add("(" + s1 + ")" + s2);
					}
				}
			}
		}
		return result;
	}

}
