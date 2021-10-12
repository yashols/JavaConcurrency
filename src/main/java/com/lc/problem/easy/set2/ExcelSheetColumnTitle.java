package com.lc.problem.easy.set2;

/**
 * @author Yashol Sharma
 */
public final class ExcelSheetColumnTitle
{

	public static void main(String args[])
	{
		ExcelSheetColumnTitle obj = new ExcelSheetColumnTitle();
		String listNode = obj.convertToTitle(701);
		System.out.println(listNode);
	}


	public String convertToTitle(int columnNumber)
	{
		StringBuffer sb = new StringBuffer();
		while (columnNumber > 0)
		{
			columnNumber--;
			char c = (char) ((columnNumber % 26) + 65);
			sb.append(c);
			columnNumber /= 26;
		}
		return sb.reverse().toString();
	}
}
