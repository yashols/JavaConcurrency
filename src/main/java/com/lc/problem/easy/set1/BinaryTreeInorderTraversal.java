package com.lc.problem.easy.set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;

/**
 * @author Yashol Sharma
 */
public final class BinaryTreeInorderTraversal {

	public static void main(String arg[]) {
		BinaryTreeInorderTraversal obj = new BinaryTreeInorderTraversal();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(1);
		t1.left = t2;
		t2.left = t3;
		List<Integer> v = obj.inorderTraversal(t1);
		for (int i : v) {
			System.out.print(i + " -> ");
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> response = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while (cur != null || !stack.empty()) {
			while (cur != null) {
				stack.add(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			response.add(cur.val);
			cur = cur.right;
		}
		return response;
	}

}
