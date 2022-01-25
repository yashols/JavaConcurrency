package com.lc.problem;

public class LC_0739_Daily_Temperatures {


    public static void main(String[] args) {
        LC_0739_Daily_Temperatures obj = new LC_0739_Daily_Temperatures();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = obj.dailyTemperatures(temperatures);
        System.out.println(result);
    }


    public int[] dailyTemperatures(int[] temperatures) {
        int[] response = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; ++i) {

            for (int j = i; j < temperatures.length; ++j) {
                if (temperatures[i] < temperatures[i]) {
                    response[i] = j - i;
                    break;
                }
            }
            
        }
        return response;
    }
}
