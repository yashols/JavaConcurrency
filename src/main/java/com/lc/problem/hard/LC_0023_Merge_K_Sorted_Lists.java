package com.lc.problem.hard;



import com.common.ListNode;

public class LC_0023_Merge_K_Sorted_Lists {

public static void main(String args[]) {
	LC_0023_Merge_K_Sorted_Lists obj = new LC_0023_Merge_K_Sorted_Lists();
	ListNode[] lists = new ListNode[3];
	ListNode a = new ListNode(1);
	a.next = new ListNode(4);
	a.next.next = new ListNode(5);
	lists[0] = a;
	ListNode b = new ListNode(1);
	b.next = new ListNode(3);
	b.next.next = new ListNode(4);
	lists[1] = b;
	ListNode c = new ListNode(2);
	c.next = new ListNode(6);
	lists[2] = c;
	obj.mergeKLists(lists );
}
	
public ListNode mergeKLists(ListNode[] lists) {
        
        int totalLists = lists.length;
        int[] tracker = new int[totalLists];
        ListNode head = null;
        while(true) {
            
            for(int listIndex : tracker) {
                
                ListNode list = lists[listIndex];
                
                if(tracker[listIndex] >= list.val) {
                    tracker[listIndex] = -1;
                } else {
                    
                }
                
                break;
                
            }
            break;
        }
        
        return head;
        
    }
	
}
