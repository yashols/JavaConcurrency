package com.lc.problem.medium.set1;

public class LC_0008_String_Integer_atoi {

    public static void main(String[] args) {
        LC_0008_String_Integer_atoi obj = new LC_0008_String_Integer_atoi();
        int response = obj.myAtoi("-91283472332");
        System.out.println(response);
    }

    public int myAtoi(String s) {
        if (s == null || s.trim().length() == 0) {
            return -0;
        }
        s = s.trim();
        boolean isNegative = s.charAt(0) == '-';
        double response = 0;
        int start = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
        	start = 1;
        }
        for(int i=start; i<s.length(); ++i) {
            char digit = s.charAt(i);
            if(!Character.isDigit(digit)) {
                break;
            }
            response = response * 10 + digit - '0';
        }
        response = isNegative ? response * -1 : response;
        if(response > Integer.MAX_VALUE) {
        	return Integer.MAX_VALUE;
        }
        if(response < Integer.MIN_VALUE) {
        	return Integer.MIN_VALUE;
        }
        return (int)response;
    }
	
}
