package com.common;

public class PrintBST {

	public static void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.getData() + " ");
		preOrder(node.getLeft());
		preOrder(node.getRight());
	}

	public static void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.getLeft());
		System.out.print(node.getData() + " ");
		inOrder(node.getRight());
	}

	public static void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.getLeft());
		postOrder(node.getRight());
		System.out.print(node.getData() + " ");
	}

	public static void preOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.val + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public static void inOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.val + " ");
		inOrder(node.right);
	}

	public static void postOrder(TreeNode node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.val + " ");
	}

}
