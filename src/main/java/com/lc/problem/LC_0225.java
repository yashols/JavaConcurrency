package com.lc.problem;

import java.util.LinkedList;
import java.util.Queue;

public class LC_0225 {
	private Queue<Integer> queue1 = null;
    private Queue<Integer> queue2 = null;
    
    public static void main(String[] args) {
		LC_0225 obj = new LC_0225();
		//["MyStack","push","push","top","pop","empty"]
		//[[],[1],[2],[],[],[]]
		obj.push(1);
		obj.push(2);
		obj.top();
		obj.pop();
		obj.empty();

	}
    
    public LC_0225() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!queue1.isEmpty()) {
            queue1.add(x);
        } else {
            queue2.add(x);
        }
    }
    
    public int pop() {
        int result = -1;
        if(!queue1.isEmpty()) {
            while(queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            result = queue1.poll();
        } else 
        if(!queue2.isEmpty()) {
            while(queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            result = queue2.poll();
        }
        return result;
    }
    
    public int top() {
        int result = -1;
        if(!queue1.isEmpty()) {
            while(!queue1.isEmpty()) {
                result = queue1.poll();
                queue2.add(result);
            }
        }else 
        if(!queue2.isEmpty()) {
            while(!queue2.isEmpty()) {
                result = queue2.poll();
                queue1.add(result);
            }
        }
        return result;
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
