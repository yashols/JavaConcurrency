package com.lc.problem.easy.set1;

import com.common.ListNode;


/**
 * @author Yashol Sharma
 */
public final class MergeTwoSortedLists
{

	public static void main(String args[])
	{
		// 1 -> 4 -> 8 -> 45
		ListNode l145 = new ListNode(45);
		ListNode l18 = new ListNode(8, l145);
		ListNode l14 = new ListNode(4, l18);
		ListNode l11 = new ListNode(1, l14);

		// 1 -> 5 -> 6 -> 10 -> 34
		ListNode l234 = new ListNode(34);
		ListNode l210 = new ListNode(10, l234);
		ListNode l26 = new ListNode(6, l210);
		ListNode l25 = new ListNode(5, l26);
		ListNode l21 = new ListNode(1, l25);

		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		ListNode response = obj.mergeTwoLists(l11, l21);
		do
		{
			System.out.print(response.getVal() + " -> ");
			response = response.getNext();
		}
		while (response != null);

		System.out.println("");
		/////////////////////////////////////////////
		obj = new MergeTwoSortedLists();
		response = obj.mergeTwoLists(null, null);
		if (response != null)
		{
			do
			{
				System.out.print(response.getVal() + " -> ");
				response = response.getNext();
			}
			while (response != null);
		}
		System.out.println("");
		/////////////////////////////////////////////

		/////////////////////////////////////////////
		obj = new MergeTwoSortedLists();
		response = obj.mergeTwoLists(null, new ListNode(3, new ListNode(5, new ListNode(99))));
		do
		{
			System.out.print(response.getVal() + " -> ");
			response = response.getNext();
		}
		while (response != null);
		System.out.println("");
		/////////////////////////////////////////////
	}


	ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if (l1 == null)
		{
			return l2;
		}
		if (l2 == null)
		{
			return l1;
		}
		ListNode response = null;
		ListNode index = null;
		ListNode newNode = null;

		while (true)
		{
			if (l1.getVal() <= l2.getVal())
			{
				newNode = new ListNode(l1.getVal());
				l1 = l1.getNext();
			}
			else
			{
				newNode = new ListNode(l2.getVal());
				l2 = l2.getNext();
			}
			if (index == null)
			{
				index = newNode;
				response = index;
			}
			else
			{
				index.setNext(newNode);
				index = newNode;
			}
			if (l1 == null || l2 == null)
			{
				break;
			}
		}
		if (l1 == null)
		{
			index.setNext(l2);
		}
		else
		{
			index.setNext(l1);
		}
		return response;
	}

}
