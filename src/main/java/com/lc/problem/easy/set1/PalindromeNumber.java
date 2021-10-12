package com.lc.problem.easy.set1;

import java.util.Stack;


/**
 * @author Yashol Sharma
 */
public final class PalindromeNumber
{

	public static void main(String[] args)
	{
		PalindromeNumber n = new PalindromeNumber();
		String s = "(]";
		boolean response = n.isValid(s);
		System.out.println(response);
	}


	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for (Character ch : s.toCharArray())
		{
			if (ch == '(' || ch == '{' || ch == '[')
			{
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty())
			{
				return false;
			}
			Character top = stack.pop();
			if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{'))
			{
				return false;
			}
		}
		return stack.isEmpty();
	}

}
