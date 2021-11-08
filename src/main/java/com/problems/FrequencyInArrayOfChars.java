package com.problems;


//Initial Template for Java

import java.util.ArrayList;
import java.util.Scanner;


//Position this line where user code will be pasted.
// Driver class with driver code
public class FrequencyInArrayOfChars
{
	// Driver code
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0)
		{
			// Declaring ArrayList
			ArrayList<Character> clist = new ArrayList<Character>();

			int q = sc.nextInt();

			// Looping for queries
			while (q-- > 0)
			{
				char ch = sc.next().charAt(0);

				if (ch == 'i')
				{
					char c = sc.next().charAt(0);
					Geeks.insert(clist, c);
				}

				if (ch == 'f')
				{
					char c = sc.next().charAt(0);
					Geeks.freq(clist, c);
				}
			}
		}
		sc.close();
	}
}

/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
// Geeks clas with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
	// Function to insert element
	public static void insert(ArrayList<Character> clist, char c)
	{
		int index = findIndex(clist, c);
		clist.add(index, c);
	}


	// Function to count frequency of element
	public static void freq(ArrayList<Character> clist, char c)
	{
		int frequency = 0;
		for (Character ch : clist)
		{
			if (ch.equals(c))
			{
				++frequency;
			}
			if (frequency != 0 && !ch.equals(c))
			{
				break;
			}
		}
        if (frequency != 0)
        {
            System.out.println(frequency);
        }
        else
        {
            System.out.println("Not Present");
        }

	}


	public static int findIndex(ArrayList<Character> clist, char c)
	{
		return clist.indexOf(c) == -1 ? 0 : clist.indexOf(c);
	}
}