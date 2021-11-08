package com.lc.problem.medium;

import com.common.ListNode;

/**
 * LC_0024_Swap_Nodes_Pairs Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0024_Swap_Nodes_Pairs {

	public static void main(String args[]) {
		LC_0024_Swap_Nodes_Pairs obj = new LC_0024_Swap_Nodes_Pairs();
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		ListNode t = obj.swapPairs(root);
		while (t != null) {
			System.out.print(t.val + " -> ");
			t = t.next;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if ((head == null) || (head.next == null))
			return head;
		ListNode n = head.next;
		head.next = swapPairs(head.next.next);
		n.next = head;
		return n;
	}

	public ListNode swapPairs2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode first = head;
		ListNode second = head.next;
		while (first != null && first.next != null) {
			ListNode tmp = first;
			first = first.next;
			tmp.next = first.next;
			first.next = tmp;
			first = tmp.next;
			if (first != null && first.next != null)
				tmp.next = first.next;
		}
		return second;
	}

	public ListNode swapPairs1(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode first = head;
		ListNode second = first.next;
		head = head.next;
		while (first != null) {
			ListNode temp = first;
			first.next = second.next;
			second.next = first;
			first = first.next;
			temp.next = first;
			if (first == null) {
				break;
			}
			second = first.next;

		}
		return head;
	}

}
