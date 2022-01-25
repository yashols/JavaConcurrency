package com.lc.problem;

public class LC_0067 {

	public static void main(String[] args) {
		LC_0067 obj = new LC_0067();
		obj.addBinary("1010", "1011");
	}
	
	public String addBinary(String a, String b) {
        int carry = 0;
        int aLen = a.length();
        int bLen = b.length();

        int max = Math.max(a.length(), b.length());
        
        StringBuffer result = new StringBuffer(max+1);
        for(int i=max-1; i>=0; --i) {
            String a1 = "0";
            String b1 = "0";
            if(aLen > 0) {
                a1 = String.valueOf(a.charAt(--aLen));
            }
            if(bLen > 0) {
                b1 = String.valueOf(b.charAt(--bLen));
            }
            
            if(a1.equals("1") && b1.equals("1") && carry == 1) {
                carry = 1;
                result.insert(0, 1);
            }
            if(a1.equals("0") && b1.equals("1") && carry == 1) {
                carry = 1;
                result.insert(0, 0);
            }
            if(a1.equals("1") && b1.equals("0") && carry == 1) {
                carry = 1;
                result.insert(0, 0);
            }
            if(a1.equals("0") && b1.equals("0") && carry == 1) {
                carry = 0;
                result.insert(0, 1);
            }
            if(a1.equals("1") && b1.equals("1") && carry == 0) {
                carry = 1;
                result.insert(0, 0);
            }
            if(a1.equals("0") && b1.equals("1") && carry == 0) {
                carry = 0;
                result.insert(0, 1);
            }
            if(a1.equals("1") && b1.equals("0") && carry == 0) {
                carry = 0;
                result.insert(0, 1);
            }
            if(a1.equals("0") && b1.equals("0") && carry == 0) {
                carry = 0;
                result.insert(0, 0);
            }
            
        }
        if(carry == 1) {
            result.insert(0, 1);
        }
        
        return result.toString();
    }
	
}
