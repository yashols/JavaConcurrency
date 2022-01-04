package com.lc.problem.easy.set4;

public class LC_1544_Make_The_String_Great {

	public static void main(String[] args) {
		LC_1544_Make_The_String_Great obj = new LC_1544_Make_The_String_Great();
		String result = obj.makeGood("leEeetcode");
		System.out.println(result);
	}
	
	public String makeGood(String s) {
        if(s.length() == 1) {
            return s;
        }
        
        boolean notGood = true;
        StringBuilder newSb = new StringBuilder();
        while(notGood) {
            notGood = false;
            for(int i=0; i<=s.length() - 2; ++i) {
                if(Math.abs(s.charAt(i) - s.charAt(i+1)) == 32) {
                    notGood = true;
                    ++i;
                } else {
                    newSb.append(s.charAt(i));
                }
            }
            newSb.append(s.charAt(s.length()-1));
            if(notGood) {
                s = newSb.toString();
                newSb = new StringBuilder();
            }
        }
        return s;
    }
	
}
