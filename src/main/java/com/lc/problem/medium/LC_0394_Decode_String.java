package com.lc.problem.medium;

import java.util.Stack;

public class LC_0394_Decode_String {

	public static void main(String[] args) {
		LC_0394_Decode_String obj = new LC_0394_Decode_String();
		String s = "3[a2[c]]";
		obj.decodeString(s);
	}
	
	public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ']') {
                char c1 = stack.pop();
                String sb = new String();
                while(c1 != '[') {
                    sb = c1 + sb;
                    c1 = stack.pop();
                }
                int times = Integer.valueOf(stack.pop()+"");
                
                for(int i = 0; i< times; ++i) {
                	result = result.append(sb);
                }
            } else {
                stack.push(c);
            }
        }
        return result.toString();
    }
	
}
