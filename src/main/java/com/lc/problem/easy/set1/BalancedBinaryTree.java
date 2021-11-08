package com.lc.problem.easy.set1;

import com.common.TreeNode;

/**
 * @author Yashol Sharma
 */
public final class BalancedBinaryTree {

	public static void main(String arg[]) {
		BalancedBinaryTree obj = new BalancedBinaryTree();
		TreeNode t1 = new TreeNode(3);
		TreeNode ta1 = new TreeNode(9);
		TreeNode ta2 = new TreeNode(20);
		TreeNode tb1 = new TreeNode(15);
		TreeNode tb2 = new TreeNode(7);
		// TreeNode st1 = new TreeNode(3);

		t1.left = ta1;
		t1.right = ta2;
		ta2.left = tb1;
		ta2.right = tb2;
		boolean v = obj.isBalanced(t1);
		System.out.print(v + " -> ");
	}

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		if (Math.abs(leftHeight - rightHeight) <= 1) {
			return isBalanced(root.left) && isBalanced(root.right);
		}
		return false;
	}

	private int getHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}
		return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
	}

}
