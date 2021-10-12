package com.lc.problem.easy.set2;

import com.common.TreeNode;


/**
 * SymmetricTree Description.
 *
 * @author Yashol Sharma
 */
public final class SymmetricTree
{

	public static void main(String args[])
	{
		TreeNode root = new TreeNode(2);
		root.left  = new TreeNode(3);
		root.right = new TreeNode(3);
		root.left.left  = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left  = new TreeNode(5);
		SymmetricTree st = new SymmetricTree();
		boolean response = st.isSymmetric(root);
		System.out.println(response);
	}


	public boolean isSymmetric(TreeNode root)
	{
		if (root == null)
		{
			return false;
		}
		return isSymmetric(root.left, root.right);
	}


	public boolean isSymmetric(TreeNode left, TreeNode right)
	{
		if (left == null && right == null)
		{
			return true;
		}
		if ((left == null && right != null) || (left != null && right == null))
		{
			return false;
		}
		if (left.val != right.val)
		{
			return false;
		}
		return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
	}

}
