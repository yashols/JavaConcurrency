package com.lc.problem.easy;

import com.common.TreeNode;

public class LC_0563_Binary_Tree_Tilt {

	public static void main(String[] args) {
		LC_0563_Binary_Tree_Tilt obj = new LC_0563_Binary_Tree_Tilt();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(7);
		obj.findTilt(root);
	}

	public int findTilt(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = findTilt(root.left) + root.val;
		int right = findTilt(root.right) + root.val;
		root.val = Math.abs(left - right);
		return root.val;
	}
}
