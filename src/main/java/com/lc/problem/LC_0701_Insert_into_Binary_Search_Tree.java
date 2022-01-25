package com.lc.problem;

import com.common.PrintBST;
import com.common.TreeNode;

public class LC_0701_Insert_into_Binary_Search_Tree {

	public static void main(String[] args) {
		LC_0701_Insert_into_Binary_Search_Tree obj = new LC_0701_Insert_into_Binary_Search_Tree();
		TreeNode root = new TreeNode(5);
		root.right = new TreeNode(14);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(77);
		root.right.right.right = new TreeNode(95);
		TreeNode result = obj.insertIntoBST(root, 4);
		PrintBST.inOrder(result);
	}

	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		boolean found = false;
		TreeNode current = root;
		while (!found) {
			if (current.left == null && current.right == null) {
				break;
			}
			if (current.val < val) {
				if(current.right == null) {
					break;
				}
				current = current.right;
			} else if (current.val > val) {
				if(current.left == null) {
					break;
				}
				current = current.left;
			}
		}
		if (current.val < val) {
			current.right = new TreeNode(val);
		} else {
			current.left = new TreeNode(val);
		}

		return root;
	}

}
