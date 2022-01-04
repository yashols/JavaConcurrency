package com.lc.problem.medium.set1;

public class LC_0033_Search_In_Rotated_Sorted_Array {

	public static void main(String[] args) {
		LC_0033_Search_In_Rotated_Sorted_Array obj = new LC_0033_Search_In_Rotated_Sorted_Array();
		int[] nums = {4,5,6,7,0,1,2};
		int result = obj.search(nums, 0);
		System.out.println(result);
	}

	public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;
        while(left <= right) {
            pivot = left + (right - left) / 2;
            if(pivot == left) {
                break;
            }
            if(nums[pivot] < nums[pivot - 1]) {
                break;
            }
            if(nums[pivot] > nums[left]) {
                left = pivot;
            }
            if(nums[pivot] < nums[right]) {
                right = pivot;
            }
        }
        int leftSearch = find(nums, 0, pivot-1, target);
        if(leftSearch != -1) {
            return leftSearch;
        }
        int rightSearch = find(nums, pivot, nums.length - 1, target);
        if(rightSearch != -1) {
            return rightSearch;
        }
        return -1;
    }
    
    public int find(int[] nums, int left, int right, int target) {
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                left = mid + 1;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
	
}
