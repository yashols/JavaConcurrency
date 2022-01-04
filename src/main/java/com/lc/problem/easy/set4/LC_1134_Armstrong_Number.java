package com.lc.problem.easy.set4;

public class LC_1134_Armstrong_Number {

	public static void main(String[] args) {
		LC_1134_Armstrong_Number obj = new LC_1134_Armstrong_Number();
		boolean result = obj.isArmstrong(153);
		System.out.println(result);
	}
	
	public boolean isArmstrong(int n) {
        if(n == 1) {
            return true;
        }
        int digits = 0;
        int s = n;
        int finalNumber = 0;
        while(s > 0) {
            ++digits;
            s = s / 10;
        }
        s = n;
        while(s > 0) {
            
            int lastDigit = s % 10;
            finalNumber = finalNumber + (int) Math.pow(lastDigit, digits);
            s = s / 10;
            
        }
        return finalNumber == n;
    }
	
}
