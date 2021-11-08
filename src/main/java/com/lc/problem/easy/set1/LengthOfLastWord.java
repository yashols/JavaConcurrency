package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class LengthOfLastWord {

	public static void main(String arg[]) {
		LengthOfLastWord obj = new LengthOfLastWord();
		int v = obj.lengthOfLastWord("  ");
		System.out.println(v);
	}

	public int lengthOfLastWord(String s) {
		return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
	}

}
