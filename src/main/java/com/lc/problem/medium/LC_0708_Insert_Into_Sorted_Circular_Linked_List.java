package com.lc.problem.medium;

import com.common.ListNode;

public class LC_0708_Insert_Into_Sorted_Circular_Linked_List {

	
	public static void main(String[] args) {
		LC_0708_Insert_Into_Sorted_Circular_Linked_List obj = new LC_0708_Insert_Into_Sorted_Circular_Linked_List();
		ListNode head = new ListNode(1);
		head.next = head;
		obj.insert(head, 0);
	}
	
	
	public ListNode insert(ListNode head, int insertVal) {
		ListNode val = new ListNode(insertVal);
        if(head == null) {
            val.next = val;
            return val;
        }
        ListNode dummy = new ListNode(insertVal);
        dummy.next = head;

        ListNode front = head;
        ListNode back = dummy;

        while(back != front) {
        	if((front.val >= insertVal && back.val < insertVal)) {
        		break;
        	}
            back = front;
            front = front.next;
        }

        back.next = val;
        val.next = front;

        return dummy.next;
    }
	
}
