package com.problems;
/**
 * Brute force solution. Ideal solution is BSF available on GeeksForGeeks.
 * https://www.geeksforgeeks.org/stepping-numbers/
 */

import java.util.Scanner;


public class SteppingNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int totalTests = sc.nextInt();
		for (int test = 0; test < totalTests; ++test)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int totalSteppingNumbers = checkSteppingNumbers(n, m);
			System.out.println(totalSteppingNumbers);
		}
	}


	private static int checkSteppingNumbers(int n, int m)
	{
		int totalSteppingNumbers = 0;
		while (n <= m)
		{
			if (isSteppingNumber(n))
			{
				++totalSteppingNumbers;
			}
			++n;
		}
		return totalSteppingNumbers;
	}


	private static boolean isSteppingNumber(int number)
	{
		int secondLastDigit = -1;
		while (number > 0)
		{
			int lastDigit = number % 10;
			if (secondLastDigit != -1)
			{
				if (Math.abs(lastDigit - secondLastDigit) != 1)
				{
					return false;
				}
			}
			number = number / 10;
			secondLastDigit = lastDigit;
		}
		return true;
	}
}
