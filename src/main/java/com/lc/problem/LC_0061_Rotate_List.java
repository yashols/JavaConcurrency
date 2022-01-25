package com.lc.problem;

import com.common.ListNode;

public class LC_0061_Rotate_List {


    public static void main(String[] args) {
        LC_0061_Rotate_List obj = new LC_0061_Rotate_List();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        //root.next.next = new ListNode(3);
        //root.next.next.next = new ListNode(4);
        //root.next.next.next.next = new ListNode(5);
        ListNode response = obj.rotateRight(root, 0);
        while (response != null) {
            System.out.print(response.val + " -> ");
            response = response.next;
        }
    }


    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int listSize = 1;
        ListNode current = head;
        while(current.next != null) {
            current = current.next;
            ++listSize;
        }
        
        k = k % listSize;
        ListNode last = head;
        for(int i =0; i< listSize - k - 1; ++i) {
            last = last.next;
        }
        ListNode nextNode = last.next;
        last.next = null;
        current.next = head;
        return nextNode;
    }
	
}
