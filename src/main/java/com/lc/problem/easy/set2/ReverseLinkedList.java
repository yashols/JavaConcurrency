package com.lc.problem.easy.set2;


import java.util.Stack;

import com.common.ListNode;


/**
 * @author Yashol Sharma
 */
public final class ReverseLinkedList
{

	public static void main(String args[])
	{
		ReverseLinkedList obj = new ReverseLinkedList();
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
		ListNode l7 = new ListNode(7);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		ListNode response = obj.reverseList(l1);
		while (response != null)
		{
			System.out.println(response.val + " -> ");
			response = response.next;
		}
	}


	public ListNode reverseList(ListNode head)
	{
		ListNode tail = new ListNode();
		reverseList(head, tail);
		return tail;
	}


	public ListNode reverseList(ListNode head, ListNode tail)
	{
		if (head == null)
		{
			return null;
		}
		tail.next = reverseList(head.next, tail);
		return tail;
	}


	public ListNode reverseList1(ListNode head)
	{
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode tail = null;
		ListNode curr = null;
		while (head != null)
		{
			stack.push(head);
			head = head.next;
		}
		while (!stack.isEmpty())
		{
			if (tail == null)
			{
				curr = stack.pop();
				tail = curr;
			}
			else
			{
				curr.next = stack.pop();
				curr = curr.next;
				curr.next = null;
			}
		}

		return tail;
	}
}
