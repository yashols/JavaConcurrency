package com.lc.problem.easy.set2;

import com.common.ListNode;

/**
 * @author Yashol Sharma
 */
public final class IntersectionOfTwoLinkedLists {

	public static void main(String args[]) {
		IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();
		ListNode a1 = new ListNode(4);
		ListNode a2 = new ListNode(1);
		ListNode c1 = new ListNode(8);
		ListNode c2 = new ListNode(4);
		ListNode c3 = new ListNode(5);
		ListNode b1 = new ListNode(5);
		ListNode b2 = new ListNode(6);
		ListNode b3 = new ListNode(1);
		a1.next = a2;
		a2.next = c1;
		c1.next = c2;
		c2.next = c3;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		ListNode listNode = obj.getIntersectionNode(a1, b1);
		System.out.println(listNode);
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headA == null) {
			return null;
		}
		ListNode currA = headA;
		ListNode currB = headB;
		while (currA != currB) {
			currA = currA == null ? headB : currA.next;
			currB = currB == null ? headA : currB.next;
		}
		return currA;
	}
}
