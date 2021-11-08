package com.lc.problem.easy.set3;

import com.common.ListNode;

/**
 * LC_0021_Merge_Two_Sorted_Lists Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0021_Merge_Two_Sorted_Lists {

	public static void main(String args[]) {
		LC_0021_Merge_Two_Sorted_Lists obj = new LC_0021_Merge_Two_Sorted_Lists();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode response = obj.mergeTwoLists(l1, l2);
		while (response != null) {
			System.out.print(response.val + "->");
			response = response.next;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode current = null;
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		while (l1 != null || l2 != null) {
			int nextVal = l1 == null ? l2.val : l2 == null ? l1.val : Math.min(l1.val, l2.val);
			ListNode node = new ListNode(nextVal);
			if (head == null) {
				head = node;
				current = node;
			} else {
				current.next = node;
				current = node;
			}
			if (l1 != null && l1.val == nextVal) {
				l1 = l1.next;
			} else if (l2 != null && l2.val == nextVal) {
				l2 = l2.next;
			}
		}
		return head;
	}

}
