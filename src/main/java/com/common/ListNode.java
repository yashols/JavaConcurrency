package com.common;

/**
 * @author Yashol Sharma
 */
public class ListNode
{
	public int val;
	public ListNode next;


	public ListNode()
	{
	}


	public ListNode(int val)
	{
		this.val = val;
	}


	public ListNode(int val, ListNode next)
	{
		this.val = val;
		this.next = next;
	}


	public int getVal()
	{
		return val;
	}


	public void setVal(final int val)
	{
		this.val = val;
	}


	public ListNode getNext()
	{
		return next;
	}


	public void setNext(final ListNode next)
	{
		this.next = next;
	}


	@Override
	public String toString()
	{
		return "ListNode{" +
			   "val=" + val +
			   '}';
	}
}
