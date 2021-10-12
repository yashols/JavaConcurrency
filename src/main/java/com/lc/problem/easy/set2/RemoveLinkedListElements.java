package com.lc.problem.easy.set2;


import com.common.ListNode;


/**
 * @author Yashol Sharma
 */
public final class RemoveLinkedListElements
{

	public static void main(String args[])
	{
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		ListNode l1 = new ListNode(7);
		ListNode l2 = new ListNode(7);
		ListNode l3 = new ListNode(7);
		ListNode l4 = new ListNode(7);
		ListNode l5 = new ListNode(7);
		ListNode l6 = new ListNode(7);
		ListNode l7 = new ListNode(7);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		ListNode l8 = null;
		ListNode response = obj.removeElements(l1, 7);
		while (response != null)
		{
			System.out.println(response.val + " -> ");
			response = response.next;
		}
	}


	public ListNode removeElements(ListNode head, int val)
	{
		if (head == null)
		{
			return null;
		}
		ListNode back = head;
		ListNode front = head.next;
		while (front != null)
		{
			if (front.val == val)
			{
				back.next = front.next;
			}
			else
			{
				back = front;

			}
			front = front.next;
		}
		if (head.val == val)
		{
			return head.next;
		}
		return head;
	}
}
