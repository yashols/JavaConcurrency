package com.lc.problem.easy.set2;

import com.common.TreeNode;

/**
 * MaxDepthOfBinaryTreeRecursive Description.
 *
 * @author Yashol Sharma
 */
public final class MaxDepthOfBinaryTreeRecursive {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		MaxDepthOfBinaryTreeRecursive obj = new MaxDepthOfBinaryTreeRecursive();
		int response = obj.maxDepth(root);
		System.out.println(response);
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left) + 1;
		int rightDepth = maxDepth(root.right) + 1;
		return Math.max(leftDepth, rightDepth);
	}

}
