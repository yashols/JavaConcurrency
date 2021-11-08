package com.lc.problem.easy.set1;

import com.common.ListNode;

/**
 * @author Yashol Sharma
 */
public final class LinkedListCycle {

	public static void main(String[] args) {
		LinkedListCycle n = new LinkedListCycle();
		ListNode l1 = new ListNode(3);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(0);
		ListNode l4 = new ListNode(-4);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;
		boolean response = n.hasCycle(l1);
		System.out.println(response);
	}

	public boolean hasCycle(ListNode head) {
		ListNode twoSteps = head;
		while (twoSteps != null && twoSteps.next != null && twoSteps.next.next != null) {
			twoSteps = twoSteps.next.next;
			if (head == twoSteps) {
				return true;
			}
			head = head.next;
		}
		return false;
	}

}
