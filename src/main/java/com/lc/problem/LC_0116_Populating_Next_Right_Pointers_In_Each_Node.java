package com.lc.problem;

import com.common.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LC_0116_Populating_Next_Right_Pointers_In_Each_Node Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0116_Populating_Next_Right_Pointers_In_Each_Node {

	public static void main(String[] args) {
		LC_0116_Populating_Next_Right_Pointers_In_Each_Node obj = new LC_0116_Populating_Next_Right_Pointers_In_Each_Node();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		Node result = obj.connect(root);
		System.out.println(result);
	}


	public Node connect(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; ++i) {
				Node current = queue.poll();
				current.next = queue.peek();
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}

		return root;
	}
}
