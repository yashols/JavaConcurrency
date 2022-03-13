package com.lc.problem;

public class LC_0402 {

	public static void main(String[] args) {
		LC_0402 obj = new LC_0402();
		String result = obj.removeKdigits("1234", 1);
		System.out.println(result);
	}
	
	public String removeKdigits(String num, int k) {
        if(num.length() <= k) {
            return "0";
        }
        StringBuffer sb = new StringBuffer(num.length() - k);
        int i=0;
        for(i=0; i<num.length()-1; ++i) {
            int firstC = num.charAt(i) - '0';
            int secondC = num.charAt(i+1) - '0';
            if(secondC >= firstC) {
                sb.append(firstC);
            } else {
            	--k;
                if(k == 0) {
                	break;
                }
            }
        }
        if(i != num.length()- 1) {
        	for(int j=i+1; j<num.length(); ++j) {
        		sb.append(num.charAt(j));
        	}
        }
        if(k != 0) {
        	return sb.toString().substring(k, sb.toString().length());
        	
        }
        return String.valueOf(Integer.parseInt(sb.toString()));
    }
	
}
