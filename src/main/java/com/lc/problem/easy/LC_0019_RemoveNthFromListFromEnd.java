package com.lc.problem.easy;

import com.common.ListNode;

/**
 * LC_0019_RemoveNthFromListFromEnd Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0019_RemoveNthFromListFromEnd {

	public static void main(String[] args) {
		LC_0019_RemoveNthFromListFromEnd obj = new LC_0019_RemoveNthFromListFromEnd();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		ListNode response = obj.removeNthFromEnd(head, 2);
		System.out.println(response);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null) {
			return null;
		}
		int length = 0;
		ListNode count = head;
		while (count != null) {
			length++;
			count = count.next;
		}
		if (length == 1) {
			return new ListNode();
		}
		if (n == length) {
			ListNode back = head;
			for (int i = 0; i < length - n - 1; ++i) {
				back = back.next;
			}
			back.next = null;
		} else {
			ListNode back = head;
			ListNode front = back.next;
			for (int i = 0; i < length - n - 1; ++i) {
				front = front.next;
				back = back.next;
			}
			back.next = front.next;
		}
		return head;
	}

}
