package com.sample.problem.easy.set1;


import com.common.TreeNode;


/**
 * @author Yashol Sharma
 */
public final class SameTree
{

	public static void main(String arg[])
	{
		SameTree obj = new SameTree();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(1);
		t1.left = t2;
		t2.left = t3;

		TreeNode r1 = new TreeNode(2);
		TreeNode r2 = new TreeNode(3);
		TreeNode r3 = new TreeNode(11);
		r1.left = r2;
		r2.left = r3;
		boolean v = obj.isSameTree(t1, r1);

		System.out.print(v + " -> ");

	}


	public boolean isSameTree(TreeNode p, TreeNode q)
	{
		if (p == null && q == null)
		{
			return true;
		}
		if (p == null || q == null || p.val != q.val)
		{
			return false;
		}
		return isSameTree(p.left, q.left) ? isSameTree(p.right, q.right) ? true : false : false;
	}


}
