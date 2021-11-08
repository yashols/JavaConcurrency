package com.lc.problem.easy.set1;

import com.common.ListNode;

/**
 * @author Yashol Sharma
 */
public final class RemoveDuplicatesFromSortedList {

	public static void main(String args[]) {
		// 1 -> 4 -> 8 -> 45
		ListNode a4 = new ListNode(45);
		ListNode a3 = new ListNode(8, a4);
		ListNode a2 = new ListNode(4, a3);
		ListNode a11 = new ListNode(4, a2);
		ListNode a1 = new ListNode(1, a11);

		RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();
		ListNode response = obj.deleteDuplicates(a1);
		do {
			System.out.print(response.getVal() + " -> ");
			response = response.getNext();
		} while (response != null);

	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode node = head;
		while (node != null && node.next != null) {
			if (node.val == node.next.val) {
				node.next = node.next.next;
			} else {
				node = node.next;
			}
		}
		return head;
	}

}
