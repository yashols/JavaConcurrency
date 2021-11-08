package com.problems;

import java.util.Stack;

class GetMinAtPopStack {
	public static void main(String args[]) {
		int[] arr = { 1, 6, 43, 1, 2, 0, 5 };

		Stack<Integer> mys = GetMin._push(arr, arr.length);
		GetMin._getMinAtPop(mys);
		System.out.println();

	}
}

/*
 * This is a function problem.You only need to complete the function given below
 */
//User function Template for Java
class GetMin {

	/*
	 * inserts elements of the array into stack and return the stackn
	 */
	public static Stack<Integer> _push(int arr[], int n) {
		Stack<Integer> normalStack = new Stack<Integer>();
		if (n == 0) {
			return normalStack;
		}
		for (int i = 0; i < n; ++i) {
			if (normalStack.isEmpty()) {
				normalStack.push(arr[i]);
				continue;
			}
			int top = normalStack.peek();
			if (arr[i] < top) {
				normalStack.push(arr[i]);
			} else {
				normalStack.push(top);
			}
		}

		return normalStack;
	}

	/*
	 * print minimum element of the stack each time after popping
	 */
	static void _getMinAtPop(Stack<Integer> s) {
		// your code here
		if (s.isEmpty()) {
			return;
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}
}