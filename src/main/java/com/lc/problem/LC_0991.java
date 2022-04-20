package com.lc.problem;

public class LC_0991 {

	public static void main(String[] args) {
		LC_0991 obj = new LC_0991();
		int result = obj.brokenCalc(2, 3);
		System.out.println(result);
	}
	
	public int brokenCalc(int startValue, int target) {
        return dp(startValue, target);
    }
    
    private int dp(int startValue, int target) {
        if(startValue > target || startValue <= 1) {
            return 0;
        }
        return Math.min(dp(startValue * 2, target) + 1, dp(startValue - 1, target) + 1);
    }
}
