package com.lc.problem.medium.set2;

import java.util.ArrayList;

import com.common.TreeNode;

/**
 * LC_0129_Sum_Root_To_Leaf_Numbers Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0129_Sum_Root_To_Leaf_Numbers {

	public static void main(String args[]) {
		LC_0129_Sum_Root_To_Leaf_Numbers obj = new LC_0129_Sum_Root_To_Leaf_Numbers();
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(9);
		root.right = new TreeNode(0);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(1);
		int response = obj.sumNumbers(root);
		System.out.println(response);
	}

	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.val;
		}
		ArrayList<String> sums = new ArrayList<String>();
		dfs(root, sums, "");
		int sum = 0;
		for (String s : sums) {
			sum += Integer.valueOf(s);
		}
		return sum;
	}

	public void dfs(TreeNode current, ArrayList<String> values, String value) {
		if (current.left == null && current.right == null) {
			values.add(value);
			return;
		}
		value = value.concat(String.valueOf(current.val));
		// if(current.left != null) {
		dfs(current.left, values, value);
		// }
		// if(current.right != null) {
		dfs(current.right, values, value);
		// }
	}

}
