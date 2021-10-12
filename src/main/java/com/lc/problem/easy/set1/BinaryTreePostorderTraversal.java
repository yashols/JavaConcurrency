package com.lc.problem.easy.set1;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;


/**
 * @author Yashol Sharma
 */
public final class BinaryTreePostorderTraversal
{

	public static void main(String arg[])
	{
		BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t1.right = t2;
		t2.left = t3;
		List<Integer> v = obj.postOrderTraversal(t1);
		for (int i : v)
		{
			System.out.print(i + " -> ");
		}
	}


	public List<Integer> postOrderTraversal(TreeNode root)
	{
		List<Integer> v = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while (cur != null || !stack.empty())
		{
			while (cur != null)
			{
				stack.push(cur);
				cur = cur.left;
			}
			if (cur.right != null)
			{
				stack.push(cur.right);
				cur = cur.right;
			}
			else
			{
				cur = stack.pop();
				v.add(cur.val);
			}


		}
		return v;
	}

}
