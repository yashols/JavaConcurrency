package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class MergeSortedArray
{

	public static void main(String args[])
	{

		MergeSortedArray obj = new MergeSortedArray();
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 3;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		obj.merge2(nums1, m, nums2, n);
		for (int a : nums1)
		{
			System.out.println(a + " -> ");
		}


		int[] anums1 = {2, 0};
		int am = 1;
		int[] anums2 = {1};
		int an = 1;
		obj.merge2(anums1, am, anums2, an);
		for (int a : anums1)
		{
			System.out.println(a + " -> ");
		}

		int[] bnums1 = {0};
		int bm = 0;
		int[] bnums2 = {1};
		int bn = 1;
		obj.merge2(bnums1, bm, bnums2, bn);
		for (int a : bnums1)
		{
			System.out.println(a + " -> ");
		}
	}


	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int insert_counter = m + n - 1;
		while (m > 0 && n > 0)
		{
			if (nums1[m - 1] >= nums2[n - 1])
			{
				nums1[insert_counter--] = nums1[m - 1];
				m--;
			}
			if (nums1[m - 1] < nums2[n - 1])
			{
				nums1[insert_counter--] = nums2[n - 1];
				n--;
			}
		}
	}


	public void merge2(int[] nums1, int m, int[] nums2, int n)
	{
		int nums2_counter = n - 1;
		int nums1_counter = m - 1;
		int insert_counter = m + n - 1;
		while (nums1_counter >= 0 && nums2_counter >= 0)
		{
			if (nums1[nums1_counter] >= nums2[nums2_counter])
			{
				nums1[insert_counter--] = nums1[nums1_counter--];
			}
			else
			{
				nums1[insert_counter--] = nums2[nums2_counter--];
			}
		}
		while (nums2_counter >= 0)
		{
			nums1[insert_counter--] = nums2[nums2_counter--];
		}
	}

}
