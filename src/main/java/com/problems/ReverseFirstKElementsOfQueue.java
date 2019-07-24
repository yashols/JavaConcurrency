package com.problems;

import java.util.*;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        int k = 3;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        GfG g = new GfG();
        Queue<Integer> ans = g.modifyQueue(q, k);
        while (!ans.isEmpty()) {
            int a = ans.peek();
            ans.poll();
            System.out.print(a + " ");
        }
        System.out.println();

    }
}


/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class GfG {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < k; ++i) {
            list.add(0, q.poll());
        }
        while(!q.isEmpty()) {
            list.add(q.poll());
        }
        for (int i = 0; i < list.size(); ++i) {
            q.add(list.get(i));
        }
        return q;
    }
}
