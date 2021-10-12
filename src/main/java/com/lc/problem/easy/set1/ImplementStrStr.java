package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class ImplementStrStr
{

	public static void main(String args[])
	{
		ImplementStrStr obj = new ImplementStrStr();
		int response = obj.strStr("abc", "c");
		System.out.println(response);
	}


	public int strStr(String haystack, String needle)
	{
		if (needle == null || needle.length() == 0 || needle.equals(haystack))
		{
			return 0;
		}
		for (int i = 0; i <= haystack.length() - needle.length(); ++i)
		{
			String part = haystack.substring(i, i + needle.length());
			if (needle.equals(part))
			{
				return i;
			}
		}
		return -1;
	}

}
