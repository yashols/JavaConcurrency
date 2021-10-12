package com.problems;

public class SamplePrintArray
{

	public static void main(String args[])
	{
		int array[] = {8, 0, 3, 9, 5, 6, 7};
		int slot = getNextAvailableSlot(array, 5);
		System.out.println(slot);
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
