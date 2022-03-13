package com.lc.problem;

import java.util.Deque;
import java.util.LinkedList;

import com.common.ListNode;

public class LC_0082 {

	public static void main(String[] args) {
		LC_0082 obj = new LC_0082();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		//head.next.next.next = new ListNode(3);
		//head.next.next.next.next = new ListNode(4);
		//head.next.next.next.next.next = new ListNode(4);
		//head.next.next.next.next.next.next = new ListNode(5);
		ListNode response = obj.deleteDuplicates(head);
		while (response != null) {
			System.out.println(response.val + " -> ");
			response = response.next;
		}
	}

	public ListNode deleteDuplicates(ListNode head) {
		Deque<ListNode> deque = new LinkedList<>();
		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(-1);

		ListNode tracker = head;
		while (tracker != null) {
			if (deque.isEmpty() || tracker.val != deque.getLast().val) {
				deque.add(tracker);
				tracker = tracker.next;
			} else if (tracker.val == deque.getLast().val) {
				int duplicate = tracker.val;
				while (tracker != null && tracker.val == duplicate) {
					tracker = tracker.next;
				}
				deque.removeLast();
			}
		}
		ListNode returnValue = dummy;
		while (!deque.isEmpty()) {
			ListNode p = deque.poll();
			p.next = null;
			returnValue.next = p;
			returnValue = returnValue.next;
		}
		return dummy.next;
	}
}
