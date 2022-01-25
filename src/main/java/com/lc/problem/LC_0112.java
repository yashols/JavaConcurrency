package com.lc.problem;

import com.common.TreeNode;

/**
 * @author Yashol Sharma
 */
public final class LC_0112 {

	public static void main(String arg[]) {
		LC_0112 obj = new LC_0112();
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(2);

		boolean v = obj.hasPathSum(t1, 1);
		System.out.print(v + " -> ");

	}

	public boolean hasPathSum(TreeNode root, int targetSum) {
		return hasPathSum(root, targetSum, 0);
	}

	public boolean hasPathSum(TreeNode root, int targetSum, int currentSum) {
		if (root == null) {
			return false;
		}
		currentSum = currentSum + root.val;
		if (root.left == null && root.right == null) {
			if (currentSum == targetSum) {
				return true;
			}
		}

		return hasPathSum(root.left, targetSum, currentSum) || hasPathSum(root.right, targetSum, currentSum);
	}
}
