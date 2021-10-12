package com.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class ParenthesisChecker
{

	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0)
		{
			String input = br.readLine();
			checkString(input);
		}
	}


	private static void checkString(String input)
	{
		Stack<String> stack = new Stack<String>();
		String[] split = input.split("");
		for (int i = 0; i < split.length; ++i)
		{
			String element = split[i];
			if ("{".equals(element) || "[".equals(element) || "(".equals(element))
			{
				stack.push(element);
			}
			if ("}".equals(element) || "]".equals(element) || ")".equals(element))
			{
				String top = "";
				if (!stack.isEmpty())
				{
					top = stack.peek();
				}
				else
				{
					System.out.println("not balanced");
					return;
				}
				if ("}".equals(element) && !top.equals("{"))
				{
					System.out.println("not balanced");
					return;
				}
				if ("]".equals(element) && !top.equals("["))
				{
					System.out.println("not balanced");
					return;
				}
				if (")".equals(element) && !top.equals("("))
				{
					System.out.println("not balanced");
					return;
				}
				stack.pop();
			}
		}
		if (stack.isEmpty())
		{
			System.out.println("balanced");
		}
		else
		{
			System.out.println("not balanced");
		}
	}
}