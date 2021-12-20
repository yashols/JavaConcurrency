package com.lc.problem.easy;

import com.common.ListNode;

/**
 * LC_0206_Reverse_Linked_List Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0206_Reverse_Linked_List {

	public static void main(String args[]) {
		LC_0206_Reverse_Linked_List obj = new LC_0206_Reverse_Linked_List();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		ListNode response = obj.reverseList(head);
		while (response != null) {
			System.out.println(response.val + "->");
			response = response.next;
		}
	}

	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode currentNode = head;
		ListNode nextNode = head.next;
		while (nextNode != null) {
			currentNode.next = nextNode.next;
			nextNode.next = head;
			head = nextNode;
			nextNode = currentNode.next;

		}
		return head;
	}

}
