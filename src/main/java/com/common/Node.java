package com.common;

public class Node {

	public Integer data;
	public Node left;
	public Node right;
	public Node next;

	public Node(int value) {
		this.data = value;
		this.left = null;
		this.right = null;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
