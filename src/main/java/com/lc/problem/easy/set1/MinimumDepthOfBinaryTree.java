package com.lc.problem.easy.set1;


import com.common.TreeNode;


/**
 * @author Yashol Sharma
 */
public final class MinimumDepthOfBinaryTree
{

	public static void main(String arg[])
	{
		MinimumDepthOfBinaryTree obj = new MinimumDepthOfBinaryTree();
		TreeNode t1 = new TreeNode(3);
		TreeNode ta1 = new TreeNode(9);
		TreeNode ta2 = new TreeNode(20);
		TreeNode tb1 = new TreeNode(15);
		TreeNode tb2 = new TreeNode(7);

		t1.left = ta1;
		t1.right = ta2;
		ta2.left = tb1;
		ta2.right = tb2;
		int v = obj.minDepth(t1);

		System.out.print(v + " -> ");

		TreeNode b1 = new TreeNode(2);
		TreeNode b2 = new TreeNode(3);
		TreeNode b3 = new TreeNode(4);
		TreeNode b4 = new TreeNode(5);
		TreeNode b5 = new TreeNode(6);
		b1.left = b2;
		b2.left = b3;
		b3.left = b4;
		b4.left = b5;

		v = obj.minDepth(b1);

		System.out.print(v + " -> ");
	}


	public int minDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		if (root.left == null && root.right == null)
		{
			return 1;
		}
		if (root.left == null)
		{
			return minDepth(root.right) + 1;
		}
		if (root.right == null)
		{
			return minDepth(root.left) + 1;
		}
		int left = minDepth(root.left) + 1;
		int right = minDepth(root.right) + 1;
		return left < right ? left : right;
	}


}
