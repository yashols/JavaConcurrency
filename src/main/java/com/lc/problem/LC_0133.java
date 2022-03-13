package com.lc.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC_0133 {

	public static void main(String[] args) {
		LC_0133 obj = new LC_0133();
		LCNode133 node1 = new LCNode133(1);
		LCNode133 node2 = new LCNode133(2);
		LCNode133 node3 = new LCNode133(3);
		LCNode133 node4 = new LCNode133(4);
		node1.neighbors.add(node2);
		node1.neighbors.add(node4);
		node2.neighbors.add(node1);
		node2.neighbors.add(node3);
		node3.neighbors.add(node2);
		node3.neighbors.add(node4);
		node4.neighbors.add(node1);
		node4.neighbors.add(node3);
		LCNode133 result = obj.cloneGraph(node1);
		System.out.println(result);
	}
	Map<Integer, LCNode133> map = new HashMap<>();
	public LCNode133 cloneGraph(LCNode133 node) {
		Map<Integer, LCNode133> map = new HashMap<>();
        return cloneGraph(node, map);
    }
    
    public LCNode133 cloneGraph(LCNode133 node, Map<Integer, LCNode133> map) {
        if(node == null) {
            return node;
        }
        if(map.containsKey(node.val)) {
            return map.get(node.val);
        }
        
        LCNode133 newNode = new LCNode133(node.val);
        map.put(newNode.val, newNode);
        for(LCNode133 n : node.neighbors) {
            newNode.neighbors.add(cloneGraph(n, map));
        }
        
        return newNode;
	}
}

class LCNode133 {
	public int val;
	public List<LCNode133> neighbors;

	public LCNode133() {
		val = 0;
		neighbors = new ArrayList<LCNode133>();
	}

	public LCNode133(int _val) {
		val = _val;
		neighbors = new ArrayList<LCNode133>();
	}

	public LCNode133(int _val, ArrayList<LCNode133> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}