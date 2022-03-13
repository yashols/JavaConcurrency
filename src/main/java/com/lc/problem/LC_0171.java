package com.lc.problem;

public class LC_0171 {

	public static void main(String[] args) {
		LC_0171 obj = new LC_0171();
		int result = obj.titleToNumber("FXSHRXW");
		System.out.println(result);
	}
	
	public int titleToNumber(String columnTitle) {
		int result = 0;
		int j = 0;
		char[] chars = columnTitle.toCharArray();
		for(int i=chars.length-1; i>=0; --i) {
			int num = chars[i] - 'A' + 1;
			result += num * Math.pow(26, j++);
		}
		return result;
    }
	
}
