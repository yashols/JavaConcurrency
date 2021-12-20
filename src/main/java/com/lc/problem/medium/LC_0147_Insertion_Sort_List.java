package com.lc.problem.medium;

import com.common.ListNode;

public class LC_0147_Insertion_Sort_List {

	public static void main(String[] args) {
		LC_0147_Insertion_Sort_List obj = new LC_0147_Insertion_Sort_List();
		ListNode head = new ListNode(-1);
		head.next = new ListNode(5);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(0);
		ListNode node = obj.insertionSortList(head);
		while(node != null) {
			System.out.print(node.val+ " -> ");
			node = node.next;
		}
	}

	public ListNode insertionSortList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(-1);
		ListNode curr = head;
		while(curr != null) {
			ListNode next = curr.next;
			
			ListNode sortedPart = dummy.next;
			ListNode behind = dummy;

			while(sortedPart.val < curr.val && sortedPart.next != null) {
				behind = sortedPart;
				sortedPart = sortedPart.next;
			}
			behind.next = curr;
			curr.next = sortedPart;
			sortedPart.next = null;
		}
 		
		return dummy.next;
	}

}
