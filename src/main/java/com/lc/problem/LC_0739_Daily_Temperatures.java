package com.lc.problem;

import java.util.Stack;

public class LC_0739_Daily_Temperatures {


    public static void main(String[] args) {
        LC_0739_Daily_Temperatures obj = new LC_0739_Daily_Temperatures();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = obj.dailyTemperatures(temperatures);
        System.out.println(result);
    }


    public int[] dailyTemperatures(int[] temperatures) {
    	int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<temperatures.length; ++i) {
            if(stack.isEmpty()) {
                stack.push(new int[] {temperatures[i], i});
                continue;
            }
            int[] top = stack.peek();
            if(top[0] >= temperatures[i]) {
                stack.push(new int[] {temperatures[i], i});
            } else {
                while(top[0] < temperatures[i]) {
                    result[top[1]] = i-top[1];
                    stack.pop();
                    if(stack.isEmpty()) {
                    	break;
                    }
                    top = stack.peek();
                }
                stack.push(new int[] {temperatures[i], i});
            }
        }
        return result;
    }
}
