package com.lc.problem.easy.set1;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;

/**
 * @author Yashol Sharma
 */
public final class BinaryTreePreorderTraversal {

	public static void main(String arg[]) {
		BinaryTreePreorderTraversal obj = new BinaryTreePreorderTraversal();
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(1);
		t1.left = t2;
		t2.left = t3;
		List<Integer> v = obj.preOrderTraversal(t1);
		for (int i : v) {
			System.out.print(i + " -> ");
		}
	}

	public List<Integer> preOrderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if (node != null) {

				stack.push(node.right);
				stack.push(node.left);
				result.add(node.val);
			}
		}
		return result;
	}

	public List<Integer> preOrderTraversal2(TreeNode root) {
		List<Integer> i = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (root != null && !stack.isEmpty()) {
			TreeNode t = stack.pop();

			while (t.left != null) {
				t = t.left;
				stack.push(t);
			}
			if (t.right != null) {
				stack.push(t.right);
			}
		}
		return i;
	}

}
