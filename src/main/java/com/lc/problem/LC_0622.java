package com.lc.problem;

public class LC_0622 {

	public static void main(String[] args) {

		LC_0622 obj = new LC_0622(2);
		System.out.println(obj.enQueue(1));
		System.out.println(obj.enQueue(2));
		System.out.println(obj.deQueue());
		System.out.println(obj.enQueue(3));
		System.out.println(obj.deQueue());
		System.out.println(obj.enQueue(3));
		System.out.println(obj.deQueue());
		System.out.println(obj.enQueue(3));
		System.out.println(obj.deQueue());
		System.out.println(obj.Front());
	}

	private Integer[] arr = null;

	private Integer front = -1;

	private Integer back = -1;

	private Integer size = 0;

	public LC_0622(int k) {
		arr = new Integer[k];
	}

	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		}
		if(isEmpty()) {
			back = 0;
			front = 0;
		} else {
			back = (back + 1) % arr.length;
		}
		arr[back % arr.length] = value;
		++size;
		return true;
	}

	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		}
		front = (front + 1) % arr.length;
		--size;
		if(isEmpty()) {
			front = 0;
			back = 0;
		}
		return true;
	}

	public int Front() {
		if (isEmpty()) {
			return -1;
		}
		return arr[front];
	}

	public int Rear() {
		if (isEmpty()) {
			return -1;
		}
		return arr[back];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == arr.length;
	}
}
