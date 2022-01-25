package com.lc.problem;

import com.common.ListNode;

public class LCL_0328_Odd_Even_Linked_List {

	
	public static void main(String[] args) {
		LCL_0328_Odd_Even_Linked_List obj = new LCL_0328_Odd_Even_Linked_List();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		ListNode response = obj.oddEvenList(head);
		while(response != null) {
			System.out.print(response.val + " - > ");
			response = response.next;
		}
	}
	
	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null || head.next.next == null) {
			return head;
		}
		
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		
		ListNode odd = head;
		ListNode even = odd.next;
		
		while(even != null && even.next != null) {
			ListNode nextPointer = even.next;
			even.next = nextPointer.next;
			nextPointer.next = odd.next;
			odd.next = nextPointer;
			odd = odd.next;
			even = even.next;
		}
		
		return dummy.next;
    }
}
