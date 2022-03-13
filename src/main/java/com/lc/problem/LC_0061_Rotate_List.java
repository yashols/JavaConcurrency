package com.lc.problem;

import java.util.Stack;

import com.common.ListNode;

public class LC_0061_Rotate_List {


    public static void main(String[] args) {
        LC_0061_Rotate_List obj = new LC_0061_Rotate_List();
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
        ListNode response = obj.reverse(root);
        while (response != null) {
            System.out.print(response.val + " -> ");
            response = response.next;
        }
    }
    
    public ListNode reverse(ListNode head) {
    	ListNode current = head;
    	Stack<ListNode> stack = new Stack<>();
    	while(current != null) {
    		stack.push(current);
    		current = current.next;
    	}
    	ListNode result = new ListNode();
    	current = result;
    	while(!stack.isEmpty()) {
    		ListNode pop = stack.pop();
    		pop.next = null;
    		current.next = pop;
    		current = current.next;
    	}
    	return result.next;
    }


    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode current = head;
        Stack<ListNode> stack = new Stack<>();
        while(current != null) {
            ++size;
            stack.push(current);
            current = current.next;
        }
        k = k % size;
        ListNode result = new ListNode();
        ListNode add = result;
        current = head;
        ListNode end = null;
        while(!stack.isEmpty()) {
            ListNode pop = stack.pop();
            if(k-- > 0) {
            	if(end == null)
            		end = pop;
                pop.next = add.next;
                add.next = pop;
            } else {
            	if(end == null) {
            		end = add;
            	} 
        		pop.next = end.next;
        		end.next = pop;
            }
        }
        
        return result.next;
    }
	
}
