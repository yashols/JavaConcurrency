package com.lc.problem.easy.set2;

/**
 * @author Yashol Sharma
 */
public final class ExcelSheetColumnNumber {

	public static void main(String args[]) {
		ExcelSheetColumnNumber obj = new ExcelSheetColumnNumber();
		String columnTitle = "FXSHRXW";
		int response = obj.titleToNumber(columnTitle);
		System.out.println(response);
	}

	public int titleToNumber(String columnTitle) {
		char[] charArr = columnTitle.toCharArray();
		int total = 0;
		int multiplier = 0;
		for (int i = charArr.length - 1; i >= 0; i--) {
			total += (charArr[i] - 64) * Math.pow(26, multiplier++);
		}
		return total;
	}

}
