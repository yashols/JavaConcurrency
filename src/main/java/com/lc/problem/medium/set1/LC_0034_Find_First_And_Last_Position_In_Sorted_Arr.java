package com.lc.problem.medium.set1;

public class LC_0034_Find_First_And_Last_Position_In_Sorted_Arr {

	public static void main(String[] args) {
		LC_0034_Find_First_And_Last_Position_In_Sorted_Arr obj = new LC_0034_Find_First_And_Last_Position_In_Sorted_Arr();
		int[] arr = { 5, 7, 7, 8, 8, 10 };
		obj.searchRange(arr, 8);
	}

	public int[] searchRange(int[] nums, int target) {
		int leftBound = target - 1;
		int rightBound = target + 1;
		
		if (nums.length == 0) {
			return new int[] { -1, -1 };
		}
		
		int[] result = new int[2];
		
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		while(left <= right) {
			mid = left + (right - left) / 2;
			if(nums[mid] == leftBound) {
				if(mid-1 != left) {
					
				}
			}
		}
		
		
		return new int[] { -1, -1 };
	}

}
