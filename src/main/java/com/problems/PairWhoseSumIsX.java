package com.problems;

import java.util.Arrays;
import java.util.LinkedList;


public class PairWhoseSumIsX
{

	public static void main(String args[])
	{
		LinkedList<Integer> head1 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		LinkedList<Integer> head2 = new LinkedList<Integer>(Arrays.asList(11, 12, 13));
		int x = 15;
		System.out.println(countPairs(head1, head2, x));
	}


	public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x)
	{
		int totalPair = 0;
		for (Integer value = 0; value < head1.size(); ++value)
		{
			for (Integer otherValue = 0; otherValue < head2.size(); ++otherValue)
			{
				if (head1.get(value) + head2.get(otherValue) == x)
				{
					++totalPair;
				}
			}
		}
		return totalPair;
	}
}
