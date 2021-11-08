package com.problems;

/**
 * Problem
 * https://practice.geeksforgeeks.org/problems/rotate-doubly-linked-list-by-p-nodes/1
 */
//Initial Template for Java

import java.util.Scanner;

class Node {
	int data;
	Node prev, next;

	public Node(int d) {
		this.data = d;
		prev = null;
		next = null;
	}
}

public class RotateDoublyLinkedList {

	static void display(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int p = sc.nextInt();

			// Entering the data
			Node head = new Node(sc.nextInt());
			Node curr = head;

			// Entering the rest of the list
			for (int i = 0; i < n - 1; i++) {
				int d = sc.nextInt();
				curr.next = new Node(d);
				curr = curr.next;
			}

			Gfg1 obj = new Gfg1();
			display(obj.rotateP(head, p));
		}
		sc.close();
	}
}

/*
 * This is a function problem.You only need to complete the function given below
 */
//User function Template for Java
/*
 * class Node { int data; Node prev, next;
 * 
 * public Node (int d){ this.data = d; prev = null; next = null; } }
 */
class Gfg1 {
	Node rotateP(Node head, int p) {
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		for (int i = 0; i < p; ++i) {
			Node current = head;
			head = current.next;
			current.next = null;
			last.next = current;
			current.prev = last;
			last = current;
		}
		return head;
	}
}