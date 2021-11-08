package com.cracking.coding.interview;

/**
 * CCI_1_3_Urlify Description.
 *
 * @author Yashol Sharma
 */
public final class CCI_1_3_Urlify {

	public static void main(String args[]) {
		CCI_1_3_Urlify obj = new CCI_1_3_Urlify();
		String s = "Mr John Smith       ";
		// String x = "Mr%20John%20Smith%20";
		obj.url(s);
	}

	public void url(String s) {
		char[] org = s.toCharArray();
		char[] newStr = new char[org.length];
		int index = 0;
		boolean first = true;
		for (char c : org) {
			if (c == ' ' && first) {
				newStr[index++] = '%';
				newStr[index++] = '2';
				newStr[index++] = '0';
				first = false;
			} else if (c != ' ') {
				first = true;
				newStr[index++] = c;
			}
		}

		System.out.println(newStr);
	}

}
