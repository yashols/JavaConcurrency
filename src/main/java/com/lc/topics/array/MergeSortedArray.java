package com.lc.topics.array;

public class MergeSortedArray {

	public static void main(String[] args) {
		MergeSortedArray obj = new MergeSortedArray();
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		obj.merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int insertionIndex = m + n - 1;
		int n1 = m - 1;
		int n2 = n - 1;
		for (int i = insertionIndex; i >= 0; --i) {
			if (n2 < 0) {
				nums1[i] = nums1[n1];
				--n1;
			} else if (n1 < 0) {
				nums1[i] = nums2[n2];
				--n2;
			} else {
				if (nums2[n2] > nums1[n1]) {
					nums1[i] = nums2[n2];
					--n2;
				} else if (nums2[n2] <= nums1[n1]) {
					nums1[i] = nums1[n1];
					--n1;
				}
			}
		}
	}
}
