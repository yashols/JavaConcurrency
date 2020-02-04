/**
 * Problem
 * https://practice.geeksforgeeks.org/problems/move-all-zeros-to-the-front-of-the-linked-list/1
 */
package com.problems;


import java.util.*;

class NodeA {
    int data;
    NodeA next;

    NodeA(int d) {
        data = d;
        next = null;
    }
}

public class MoveZeroInFrontLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            int n = 10;
            NodeA head = null;
            while (n-- > 0) {
                int a = sc.nextInt();
                if (head == null) {
                    head = new NodeA(a);
                } else {
                    NodeA temp = new NodeA(a);
                    temp.next = head;
                    head = temp;
                }
            }
            ZeroFirst g = new ZeroFirst();
            head = g.moveZeroes(head);
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }
}


class ZeroFirst {
    public NodeA moveZeroes(NodeA head) {
        NodeA current = head;
        NodeA forward = head;
        while (forward.next != null) {
            if (current == forward) {
                forward = forward.next;
                continue;
            }
            if (forward.data == 0) {
                current.next = forward.next;
                forward.next = head;
                head = forward;
                forward = current.next;
            } else {
                current = forward;
                forward = forward.next;
            }

        }
        return head;
    }
}
