package com.lc.problem;

public class LC_0878_Nth_Magical_Number {

	public static void main(String[] args) {
		LC_0878_Nth_Magical_Number obj = new LC_0878_Nth_Magical_Number();
		obj.nthMagicalNumber(1, 2, 3);
	}
	
	public int nthMagicalNumber(int n, int a, int b) {
        int count = 0;
        int number = 0;
        while(count < n) {
        	number++;
            if(number % a == 0 || number % b == 0) {
                count++;
            }
        }
        return number;
    }
	
}
