package com.problems;

/*package whatever //do not write package name here */

import java.util.Scanner;
import java.util.Stack;


public class ReverseStringUsingStack
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
		{
			Solution obj = new Solution();
			obj.reverse(sc.next());
		}
	}
}


/*This is a function problem.You only need to complete the function given below*/

class Solution
{

	public void reverse(String str)
	{
		Stack<String> stack = new Stack<String>();
		String[] split = str.split("");
		for (int i = 0; i < split.length; ++i)
		{
			stack.push(split[i]);
		}
		while (!stack.isEmpty())
		{
			System.out.print(stack.pop());
		}
		System.out.println("");
	}
}