package com.sample.problem.easy.set1;


import java.util.Stack;


/**
 * @author Yashol Sharma
 */
public class MinStack
{

	private Stack<Integer> mins = new Stack<Integer>();
	private Stack<Integer> mains = new Stack<Integer>();
	private Integer minVal;

	public MinStack()
	{

	}


	//["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
	//[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
	public static void main(String[] arg)
	{
		int a;
		MinStack minStack = new MinStack();
		minStack.push(2147483646);
		minStack.push(2147483646);
		minStack.push(2147483647);
		minStack.top();
		minStack.pop();
		;
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
		minStack.pop();
		minStack.push(2147483647);
		minStack.top();
		minStack.getMin();
		minStack.push(-2147483648);
		minStack.top();
		minStack.getMin();
		minStack.pop();
		minStack.getMin();
	}


	public void push(int val)
	{
		mains.push(val);
		if (minVal == null)
		{
			mins.push(val);
			minVal = val;
		}
		else
		{
			if (minVal < val)
			{
				mins.push(minVal);
			}
			else
			{
				mins.push(val);
				minVal = val;
			}
		}
	}


	public void pop()
	{
		Integer v1 = mins.pop();
		if (!mins.empty())
		{
			Integer v2 = mins.peek();
			if (v1 != v2)
			{
				minVal = v2;
			}
		}
		else
		{
			minVal = null;
		}

		mains.pop();
	}


	public int top()
	{
		return mains.peek();
	}


	public int getMin()
	{
		return minVal;
	}
}