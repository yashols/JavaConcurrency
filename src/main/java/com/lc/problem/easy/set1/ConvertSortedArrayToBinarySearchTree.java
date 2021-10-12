package com.lc.problem.easy.set1;


import java.util.List;

import com.common.TreeNode;


/**
 * @author Yashol Sharma
 */
public final class ConvertSortedArrayToBinarySearchTree
{

	public static void main(String arg[])
	{
		BinaryTreeInorderTraversal t = new BinaryTreeInorderTraversal();
		ConvertSortedArrayToBinarySearchTree obj = new ConvertSortedArrayToBinarySearchTree();
		int[] nums = {-10, -3, 0, 5, 9};
		TreeNode n = obj.sortedArrayToBST(nums);
		List<Integer> v = t.inorderTraversal(n);
		for (int i : v)
		{
			System.out.print(i + " -> ");
		}
	}


	public TreeNode sortedArrayToBST(int[] nums)
	{
		TreeNode t = sortedArrayToBST(nums, 0, nums.length - 1);
		return t;
	}


	public TreeNode sortedArrayToBST(int[] nums, int left, int right)
	{
		if (left > right)
		{
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode t = new TreeNode(nums[mid]);
		t.left = sortedArrayToBST(nums, left, mid - 1);
		t.right = sortedArrayToBST(nums, mid + 1, right);
		return t;
	}


	public String search(int[] a, int l, int r, int search)
	{
		if (l > r)
		{
			return "not found";
		}
		int mid = l + (r - l) / 2;
		if (a[mid] == search)
		{
			return "found";
		}
		if (a[mid] > search)
		{
			return search(a, l, mid - 1, search);
		}
		else
		{
			return search(a, mid + 1, r, search);
		}
	}

}
