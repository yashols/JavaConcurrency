package com.lc.problem;

import com.common.ListNode;

public class LC_0382_Linked_List_Random_Node {

	public static void main(String[] args) {
		ListNode head = new ListNode(10);
		head.next = new ListNode(100);
		head.next.next = new ListNode(100);
		head.next.next.next = new ListNode(20);
		head.next.next.next.next = new ListNode(20);
		head.next.next.next.next.next = new ListNode(100);
		LC_0382_Linked_List_Random_Node obj = new LC_0382_Linked_List_Random_Node(head);
		for (int i = 0; i < 5000; ++i) {
			int result = obj.getRandom();
			System.out.print(result + ", ");
		}
	}

	private ListNode head;

	public LC_0382_Linked_List_Random_Node(ListNode head) {
		this.head = head;
	}

	public int getRandom() {
		if (head == null) {
			return 0;
		}
		ListNode current = head;
		ListNode result = head;
		int scope = 1;
		while (current != null) {
			if (Math.random() < 1.0 / scope) {
				result = current;

			}
			++scope;
			current = current.next;
		}

		return result.val;
	}

}
