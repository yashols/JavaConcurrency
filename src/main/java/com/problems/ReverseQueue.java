package com.problems;


import java.util.*;
import java.io.*;

public class ReverseQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Queue<Integer> q = new LinkedList<Integer>();
            String s = br.readLine();
            String[] a = s.split(" ");
            for (String b : a) {
                int x = Integer.parseInt(b);
                q.add(x);
            }
            ReverseQueueInner g = new ReverseQueueInner();
            q = g.rev(q);
            while (!q.isEmpty()) {
                int x = q.peek();
                q.poll();
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}


/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*Complete the function below*/
class ReverseQueueInner {
    public Queue<Integer> rev(Queue<Integer> q) {
        if(q.isEmpty()) {
            return q;
        }
        Stack<Integer> stack = new Stack<Integer>();
        while(!q.isEmpty()) {
            stack.push(q.poll());
        }
        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }
        return q;
    }
}