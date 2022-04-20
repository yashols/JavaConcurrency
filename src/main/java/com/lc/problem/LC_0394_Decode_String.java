package com.lc.problem;

import java.util.Stack;

public class LC_0394_Decode_String {

	public static void main(String[] args) {
		LC_0394_Decode_String obj = new LC_0394_Decode_String();
		String s = "100[leetcode]";
		String result = obj.decodeString(s);
		System.out.println(result);
	}
	
	public String decodeString(String s) {
		Stack<String> stack = new Stack<>();
		boolean topInt = false;
		for(int i=0; i<s.length(); ++i) {
			char c = s.charAt(i);
			if(c >= '0' && c <= '9') {
				if(topInt) {
					String top = stack.pop();
					int newInt = Integer.parseInt(top) * 10 + c - '0';
					stack.push(String.valueOf(newInt));
				} else {
					topInt = true;
					stack.push(String.valueOf(c));
				}
			} else if(c == ']') {
				StringBuffer sb = new StringBuffer();
				String top = stack.pop();
				while(!top.equals("[")) {
					sb.insert(0, top);
					top = stack.pop();
				}
				int value = Integer.valueOf(stack.pop());
				StringBuffer sb2 = new StringBuffer();
				for(int j=0; j<value; ++j) {
					sb2.append(sb.toString());
				}
				stack.push(sb2.toString());
				topInt = false;
			} else {
				stack.push(String.valueOf(c));
				topInt = false;
			}
			
		}
		StringBuffer sb3 = new StringBuffer();
		while(!stack.isEmpty()) {
			sb3.insert(0, stack.pop());
		}
		return sb3.toString();
    }
	
}
