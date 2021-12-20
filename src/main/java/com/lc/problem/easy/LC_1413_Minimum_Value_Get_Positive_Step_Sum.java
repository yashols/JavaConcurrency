package com.lc.problem.easy;

public class LC_1413_Minimum_Value_Get_Positive_Step_Sum {

    public static void main(String[] args) {
        LC_1413_Minimum_Value_Get_Positive_Step_Sum obj = new LC_1413_Minimum_Value_Get_Positive_Step_Sum();
        int[] nums = {-3, 6, 2, 5, 8, 6};
        int response = obj.minStartValue(nums);
        System.out.print(response);
    }


    public int minStartValue(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int sum = nums[0];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; ++i) {
            sum += nums[i];
            min = Math.min(min, sum);
            
        }
        return Math.abs(min) + 1;
    }
	
}
