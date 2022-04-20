package com.lc.problem;

import java.util.Stack;

public class LC_1249 {

	public static void main(String[] args) {
		LC_1249 obj = new LC_1249();
		String result = obj.minRemoveToMakeValid("lee(t(c)o)de)");
		System.out.println(result);
	}

	public String minRemoveToMakeValid(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuffer result = new StringBuffer(s.length());
		boolean stacked = false;
		for(int i=0; i<s.length(); ++i) {
			Character c = s.charAt(i);
			if(c == ')') {
				if(stack.isEmpty()) {
					continue;
				}
				StringBuffer sb = new StringBuffer(stack.size());
				stack.push(c);
				Character top = stack.pop();
				while(top != '(') {
					sb.insert(0,top);
					top = stack.pop();
				}
				sb.insert(0, top);
				result.append(sb.toString());
				if(stack.isEmpty()) {
					stacked = false;
				}
			} else if(c == '(') {
				stack.push(c);
				stacked = true;
			} else {
				if(stacked) {
					stack.push(c);
				} else {
					result.append(c);
				}
			}
		}
		
		
		
		return result.toString();
	}

}
