package com.lc.topics.array;

public class DeletingItemFromAnArray {

	public static void main(String[] args) {
		DeletingItemFromAnArray obj = new DeletingItemFromAnArray();
		int[] nums = { 1, 2, 3 };
		int k = obj.removeDuplicates(nums);
		System.out.println(k);
	}

	public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int current = 0;
        int result = 1;
        for(int j = 1; j < nums.length; ++j) {
            int next = j;
            if(nums[current] == nums[next]) {
                continue;            
            }
            if(nums[current] > nums[next]) {
                continue;
            }
            if(nums[current] < nums[next]) {
                int temp = nums[current+1];
                nums[current+1] = nums[next];
                nums[next] = temp;
                current = current+1;
                ++result;
            }
        }
        return result;
    }
}
