package com.lc.problem;

import com.common.ListNode;

public class LC_0024 {

	public static void main(String[] args) {
		LC_0024 obj = new LC_0024();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ListNode o = obj.swapPairs(head);
		while(o != null) {
			System.out.print(o.val + " -> ");
			o = o.next;
		}
	}
	
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tail = dummy;
        ListNode first = dummy.next;
        ListNode second = first.next;
        while(true) {
            
            first.next = second.next;
            second.next = first;
            tail.next = second;
            tail = first;
            if(tail.next == null || tail.next.next == null) {
                break;
            }
            first = tail.next;
            second = first.next;
        }
        return dummy.next;
    }
	
}
