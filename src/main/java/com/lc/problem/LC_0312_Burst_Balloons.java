package com.lc.problem;

public class LC_0312_Burst_Balloons {

    public static void main(String[] args) {
        LC_0312_Burst_Balloons obj = new LC_0312_Burst_Balloons();
        int[] nums = {1, 5};
        int result = obj.maxCoins(nums);
        System.out.println(result);
    }

    public int maxCoins(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            int i = nums[0] * nums[1];
            i += Math.max(nums[0], nums[1]);
            return i;
        }
        int result = 0;
        int min = 0;
        int index = 0;
        for (int j = 1; j < nums.length - 1; ++j) {
            for (int i = 1; i < nums.length - 1; ++i) {
                if (nums[i] == -1) {
                    continue;
                }
                if (min == 0) {
                    min = nums[i];
                    index = i;
                } else if (min > nums[i]) {
                    min = nums[i];
                    index = i;
                }
            }
            result += findMultiple(nums, index);
            min = 0;
        }

        result += nums[0] * nums[nums.length - 1];
        result += Math.max(nums[0], nums[nums.length - 1]);
        return result;
    }


    public int findMultiple(int[] nums, int index) {
        int num = nums[index];
        int left = 1;
        int right = 1;
        for (int i = index - 1; i >= 0; --i) {
            if (nums[i] == -1) {
                continue;
            }
            left = nums[i];
            break;
        }
        for (int i = index + 1; i < nums.length; ++i) {
            if (nums[i] == -1) {
                continue;
            }
            right = nums[i];
            break;
        }
        nums[index] = -1;
        return num * left * right;
    }
}
