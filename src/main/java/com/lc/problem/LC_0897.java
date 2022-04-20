package com.lc.problem;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import com.common.TreeNode;

public class LC_0897 {

	public static void main(String[] args) {
		LC_0897 obj = new LC_0897();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(6);
		root.right.right = new TreeNode(8);
		root.right.right.left = new TreeNode(7);
		root.right.right.right = new TreeNode(9);
		TreeNode result = obj.increasingBST(root);
		while (result != null) {
			System.out.print(result.val + " -> ");
			result = result.right;
		}
	}

	public TreeNode increasingBST(TreeNode root) {
		TreeNode top = null;
		Queue<TreeNode> queue = new LinkedList<>();
		Deque<TreeNode> dequeue = new ArrayDeque<>();
		TreeNode current = root;
		while (!dequeue.isEmpty() || current != null) {
			while (current != null) {
				dequeue.offer(current);
				current = current.left;
			}
			current = dequeue.pollLast();
			queue.add(current);
			current = current.right;
		}
		current = queue.poll();
		TreeNode index = current;
		while (current != null) {
			if (top == null) {
				top = current;
				index = current;
				
			} else {
				index.right = current;
				
				index = index.right;
			}
			index.left = null;
			current = queue.poll();
		}
		return top;
	}

}
