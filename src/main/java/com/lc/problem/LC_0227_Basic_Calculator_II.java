package com.lc.problem;

import java.util.Stack;

public class LC_0227_Basic_Calculator_II {

    public static void main(String[] args) {
        LC_0227_Basic_Calculator_II obj = new LC_0227_Basic_Calculator_II();
        int result = obj.calculate(" 3+5 / 2 ");
        System.out.println(result);
    }

    public int calculate(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            int first = 0;
            int second = 0;
            if (c == '+' || c == '-' || c == '/' || c == '*') {
                char p = stack.pop();
                first = (int) p - 48;
                second = (int) s.charAt(++i) - 48;
            }
            switch (c) {
                case '+':
                    result = first + second;
                    //stack.push(result);
                    break;
                case '-':
                    result = first - second;
                    break;
                case '/':
                    result = first / second;
                    break;
                case '*':
                    result = first * second;
                    break;
            }
            if (c >= '0' && c <= '9') {
                stack.push(c);
            }
        }
        return result;
    }

}
