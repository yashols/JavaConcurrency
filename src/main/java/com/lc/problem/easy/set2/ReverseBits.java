package com.lc.problem.easy.set2;

/**
 * @author Yashol Sharma
 */
public final class ReverseBits {

	public static void main(String args[]) {
		ReverseBits obj = new ReverseBits();
		String n = "00000010100101000001111010011100";
		// String n = "001";
		int response = obj.reverseBits(n);
		System.out.println(response);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}

	public int reverseBits(int n) {
		String s = "" + n;
		return reverseBits(s);
	}

	public int reverseBits(String n) {
		int response = 0;
		String v = String.valueOf(n);
		for (int i = v.length() - 1; i >= 0; --i) {
			response = response * 2 + Integer.parseInt(v.charAt(i) + "");
		}
		return response;
	}
}
