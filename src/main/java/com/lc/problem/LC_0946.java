package com.lc.problem;

import java.util.Stack;

public class LC_0946 {

	public static void main(String[] args) {
		LC_0946 obj = new LC_0946();
		int[] pushed = { 1, 2, 3, 4, 5 };
		int[] popped = { 4, 5, 3, 2, 1 };
		boolean result = obj.validateStackSequences(pushed, popped);
		System.out.println(result);
	}

	public boolean validateStackSequences(int[] pushed, int[] popped) {
		int poppedIndex = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < pushed.length; ++i) {
			stack.push(pushed[i]);
			if (stack.peek() == popped[poppedIndex]) {
				while(!stack.isEmpty() && stack.peek() == popped[poppedIndex]) {
					stack.pop();
					++poppedIndex;
				}
			}
		}
		if (!stack.isEmpty()) {
			while (!stack.isEmpty()) {
				int top = stack.pop();
				if (top != popped[poppedIndex++]) {
					return false;
				}
			}
		}
		return poppedIndex == popped.length;
	}

}
