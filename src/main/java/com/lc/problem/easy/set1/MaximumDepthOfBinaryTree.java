package com.lc.problem.easy.set1;


import com.common.TreeNode;


public final class MaximumDepthOfBinaryTree
{

	public static void main(String arg[])
	{
		MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;

		int v = obj.maxDepth(t1);

		System.out.print(v + " -> ");

	}


	public int maxDepth(TreeNode root)
	{
		if (root == null)
		{
			return 0;
		}
		return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
	}


}
