package com.cracking.coding.interview;

import java.util.HashMap;


/**
 * CCI_1_4_PalindromePermutation Description.
 *
 * @author Yashol Sharma
 */
public final class CCI_1_4_PalindromePermutation
{

	public static void main(String args[]) {
		CCI_1_4_PalindromePermutation obj = new CCI_1_4_PalindromePermutation();
		String s = "tact coa";
		obj.checkPalindromePermutation(s.toCharArray());
	}


	private void checkPalindromePermutation(final char[] input)
	{
		HashMap<Character, Integer> values = new HashMap<>();
		for(Character c : input) {
			if(values.containsKey(c)) {
				values.put(c, 0);
			} else {
				values.put(c, 1);
			}
		}
		boolean onlyOnce = false;
		for(Character c : values.keySet()) {
			if(values.get(c) == 0) {
				continue;
			} else if(!onlyOnce ){
				onlyOnce = true;
			} else if(onlyOnce) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
