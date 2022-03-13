package com.lc.problem;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyHeapNode {

	int row;
	int column;
	int value;

	public MyHeapNode(int v, int r, int c) {
		this.value = v;
		this.row = r;
		this.column = c;
	}

	public int getValue() {
		return this.value;
	}

	public int getRow() {
		return this.row;
	}

	public int getColumn() {
		return this.column;
	}
}

class MyHeapComparator implements Comparator<MyHeapNode> {
	public int compare(MyHeapNode x, MyHeapNode y) {
		return x.value - y.value;
	}
}

class LC_0378 {

	public static void main(String[] args) {
		LC_0378 obj = new LC_0378();
		int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
		obj.kthSmallest(matrix, 8);
	}

	public int kthSmallest(int[][] matrix, int k) {

		int minNum = Math.min(matrix.length, k);
		PriorityQueue<MyHeapNode> pq = new PriorityQueue<>(minNum, new MyHeapComparator()); 
		for(int i=0; i<matrix.length; ++i) {
			MyHeapNode node = new MyHeapNode(matrix[i][0], i, 0);
			pq.add(node);
		}
		MyHeapNode node = pq.peek();
		while(k-- > 0) {
			node = pq.poll();
			
			if(node.getColumn() < matrix[node.getRow()].length-1) {
				MyHeapNode newNode = new MyHeapNode(matrix[node.getRow()][node.getColumn()+1], node.getRow(), node.getColumn()+1);
				pq.offer(newNode);
			}
		}
		return node.getValue();
	}
}
