package com.lc.problem.easy.set3;

public class LC_0035_Search_Insert_Position {

	public static void main(String[] args) {
		LC_0035_Search_Insert_Position obj = new LC_0035_Search_Insert_Position();
		int[] nums = {1,3,5,6};
		System.out.println(obj.searchInsert(nums , 2));
	}
	
	
	public int searchInsert(int[] nums, int target) {
        return searchBinary(nums, 0, nums.length - 1, target);
    }
    
    public int searchBinary(int[] nums, int left, int right, int target) {
        
        if(left > right) {
            return left;
        }
        
        int mid = left + (right - left)/2;
        
        if(nums[mid] == target) {
            return mid;
        }
        
        if(nums[mid] > target) {
            return searchBinary(nums, left, mid-1, target);
        } else {
            return searchBinary(nums, mid+1, right, target);
        }
        
    }
}
