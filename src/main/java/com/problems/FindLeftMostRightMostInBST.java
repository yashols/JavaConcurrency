/**
 * Find Leftmost and Rightmost node of BST from its given preorder traversal
 * Given a pre-order sequence of the binary search tree of N nodes. The task is to find its leftmost and rightmost node.
 * <p>
 * https://www.geeksforgeeks.org/find-leftmost-and-rightmost-node-of-bst-from-its-given-preorder-traversal/
 * <p>
 * Input : N = 5, preorder[]= 3, 2, 1, 5, 4
 * Output : Leftmost = 1, Rightmost = 5
 */

package com.problems;

import java.util.Scanner;

import com.common.Node;


public class FindLeftMostRightMostInBST
{

	public static void main(String args[])
	{
		//convert pre-order to BST and get left most and right most using traversing.
		Scanner sc = new Scanner(System.in);
		int totalElements = sc.nextInt();
		int[] elements = new int[totalElements];
		for (int i = 0; i < totalElements; ++i)
		{
			elements[i] = sc.nextInt();
		}

		Node root = null;

		for (int i = 0; i < elements.length; ++i)
		{
			root = insertInBST(root, elements[i]);
			//PrintBST.preOrder(root);
		}
		getRightMost(root);
		getLeftMost(root);
	}


	private static void getLeftMost(Node root)
	{
		Node node = root;
		if (node == null)
		{
			return;
		}
		while (root.getLeft() != null)
		{
			node = node.getLeft();
		}
		System.out.println("Leftmost = " + node.getData());
	}


	private static void getRightMost(Node root)
	{
		Node node = root;
		if (node == null)
		{
			return;
		}
		while (root.getRight() != null)
		{
			node = node.getRight();
		}
		System.out.println("Rightmost = " + node.getData());
	}


	private static Node insertInBST(Node root, int value)
	{
		if (root == null)
		{
			Node node = new Node(value);
			return node;
		}
		if (value < root.getData())
		{
			root.setLeft(insertInBST(root.getLeft(), value));
		}
		if (value > root.getData())
		{
			root.setRight(insertInBST(root.getRight(), value));
		}
		return root;
	}

}