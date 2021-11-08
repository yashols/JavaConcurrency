package com.lc.problem.easy.set1;

/**
 * @author Yashol Sharma
 */
public final class AddBinary {

	public static void main(String arg[]) {
		AddBinary obj = new AddBinary();
		String a = "1010";
		String b = "1011";
		String v = obj.addBinary(a, b);
		System.out.print(v);
	}

	public String addBinary(String a, String b) {
		int carry = 0;
		StringBuilder response = new StringBuilder();
		while (a.length() > b.length()) {
			b = "0" + b;
		}
		while (a.length() < b.length()) {
			a = "0" + a;
		}
		int i = a.length() - 1;
		for (; i >= 0;) {
			int a_char = Character.getNumericValue(a.charAt(i));
			int b_char = Character.getNumericValue(b.charAt(i--));
			if (carry == 0) {
				if (a_char == 0 && b_char == 0) {
					response.insert(0, "0");
				} else if ((a_char == 1 && b_char == 0) || (a_char == 0 && b_char == 1)) {
					response.insert(0, "1");
				} else if (a_char == 1 && b_char == 1) {
					response.insert(0, "0");
					carry = 1;
				}
			} else {
				if (a_char == 0 && b_char == 0) {
					response.insert(0, "1");
					carry = 0;
				} else if ((a_char == 1 && b_char == 0) || (a_char == 0 && b_char == 1)) {
					response.insert(0, "0");
				} else if (a_char == 1 && b_char == 1) {
					response.insert(0, "1");
				}
			}
		}
		if (carry != 0) {
			response.insert(0, "1");
		}
		return response.toString();
	}

}
