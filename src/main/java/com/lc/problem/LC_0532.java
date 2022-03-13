package com.lc.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_0532 {

	public static void main(String[] args) {
		LC_0532 obj = new LC_0532();
		int[] nums = {1,2,4,4,3,3,0,9,2,3};
		obj.findPairs(nums, 3);
	}
	
	public int findPairs(int[] nums, int k) {
        Set<Integer> checkDup = new HashSet<>();
        int result = 0;
        Arrays.sort(nums);
        for(int i =0; i<nums.length; ++i) {
            if(checkDup.contains(nums[i])) {
                continue;
            } else {
                checkDup.add(nums[i]);
            }
            for(int j=i+1; j<nums.length; ++j) {
            	if(nums[j] == nums[j-1]) {
                    continue;
                } 
                if(Math.abs(nums[j]-nums[i]) == k) {
                	System.out.println("i " + nums[i] + " j " + nums[j]);
                    ++result;
                }
            }
        }
        return result;
    }
}
