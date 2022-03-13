package com.lc.problem;

import java.util.HashMap;
import java.util.Map;

public class LC_0138 {

	public static void main(String[] args) {
		LC_0138 obj = new LC_0138();
		LC_0138_Node head = new LC_0138_Node(7);
		head.next = new LC_0138_Node(13);
		head.next.next = new LC_0138_Node(11);
		head.next.next.next = new LC_0138_Node(10);
		head.next.next.next.next = new LC_0138_Node(1);
		head.random = null;
		head.next.random = head;
		head.next.next.random = head.next.next.next.next;
		head.next.next.next.random = head.next.next;
		head.next.next.next.next.random = head;
		LC_0138_Node result = obj.copyRandomList(head);
		//result = head;
		while(result != null) {
			Integer d = null;
			if(result.random == null  ) {
				d = null;
			} else {
				d = result.random.val;
			}
			System.out.println(result.val + " -> " + d);
			result = result.next;
		}
		
	}

	public LC_0138_Node copyRandomList(LC_0138_Node head) {
		LC_0138_Node current = head;
		Map<LC_0138_Node, LC_0138_Node> nodes = new HashMap<>();
		LC_0138_Node dummy = new LC_0138_Node(-1);
		LC_0138_Node add = dummy;
		while(current != null) {
			LC_0138_Node newNode = new LC_0138_Node(current.val);
			add.next = newNode;
			add = add.next;
			nodes.put(current, newNode);
			current = current.next;
		}
		current = head;
		add = dummy.next;
		while(current != null) {
			if(current.random == null) {
				add.random = null;
			} else {
				add.random = nodes.get(current.random);
			}
			current = current.next;
			add = add.next;
		}
		return dummy.next;
	}
}

class LC_0138_Node {
	int val;
	LC_0138_Node next;
	LC_0138_Node random;

	public LC_0138_Node(int val) {
		this.val = val;
		this.next = null;
		this.random = null;
	}
}