package com.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CardRotation
{

	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalTestCases = Integer.parseInt(br.readLine());
		//int totalTestCases = 1;
		while (totalTestCases-- > 0)
		{
			int cards = Integer.parseInt(br.readLine());
			//int cards = 6;
			GetCardSequence(cards);
		}
	}


	private static void GetCardSequence(int cards)
	{
		int[] array = new int[cards];
		int number = 1;
		int pointer = 0;
		int skipped = 0;
		while (number <= cards)
		{
			if (pointer == array.length)
			{
				pointer = 0;
			}
			if (array[pointer] != 0)
			{
				++pointer;
				continue;
			}

			if (skipped == number)
			{
				int nextSlot = getNextAvailableSlot(array, pointer);
				array[nextSlot] = number++;
				skipped = 0;
			}
			else
			{
				++skipped;
				++pointer;
			}
		}
		for (int i = 0; i < array.length; ++i)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}


	private static int getNextAvailableSlot(int[] array, int pointer)
	{
		int slot = pointer;
		for (int i = 0; i < array.length; ++i)
		{
			//System.out.print(slot);
			if (slot == array.length)
			{
				slot = 0;
			}
			if (array[slot] == 0)
			{
				return slot;
			}
			else
			{
				++slot;
			}
		}
		return -1;
	}

}
