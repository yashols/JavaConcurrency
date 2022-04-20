package com.lc.problem;

import java.util.Stack;

public class LC_0856 {

	public static void main(String[] args) {
		LC_0856 obj = new LC_0856();
		int result = obj.scoreOfParentheses("(()(()))");
		System.out.println(result);
	}

	public int scoreOfParentheses(String s) {
		int score = 0;
		Stack<Character> stack = new Stack<>();
		int current = 0;
		for(int i=0; i<s.length(); ++i) {
			char c = s.charAt(i);
			if(c == ')') {
				stack.pop();
				if(current == 0) {
					current = 1;
				} else {
					current *= 2;
				}
			} else {
				stack.push(c);
			}
			if(stack.isEmpty()) {
				score += current;
				current = 0;
			}
		}
		return score;
	}

}
