package com.lc.problem.easy.set1;


import java.util.Stack;

import com.common.TreeNode;


/**
 * @author Yashol Sharma
 */
public final class SymmetricTree
{

	private Stack<TreeNode> leftPath = new Stack<TreeNode>();
	private Stack<TreeNode> rightPath = new Stack<TreeNode>();


	public static void main(String arg[])
	{
		SymmetricTree obj = new SymmetricTree();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2a = new TreeNode(2);
		TreeNode t2b = new TreeNode(2);
		TreeNode t3a = new TreeNode(2);
		TreeNode t3b = new TreeNode(2);

		t1.left = t2a;
		t1.right = t2b;
		t2a.left = t3a;

		t2b.left = t3b;

		boolean v = obj.isSymmetric(t1);
		System.out.print(v);
	}


	public boolean isSymmetric(TreeNode root)
	{
		if (root == null)
		{
			return true;
		}
		return isSymmetric(root.left, root.right);
	}


	public boolean isSymmetric(TreeNode leftSide, TreeNode rightSide)
	{
		if (leftSide == null && rightSide == null)
		{
			return true;
		}

		if (leftSide == null || rightSide == null || leftSide.val != rightSide.val)
		{
			return false;
		}
		return isSymmetric(leftSide.left, rightSide.right) && isSymmetric(leftSide.right, rightSide.left);
	}

}
