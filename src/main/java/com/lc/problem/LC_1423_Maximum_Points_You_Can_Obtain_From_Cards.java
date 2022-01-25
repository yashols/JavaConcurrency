package com.lc.problem;

public class LC_1423_Maximum_Points_You_Can_Obtain_From_Cards {

	public static void main(String[] args) {
		LC_1423_Maximum_Points_You_Can_Obtain_From_Cards obj = new LC_1423_Maximum_Points_You_Can_Obtain_From_Cards();
		int[] cardPoints = { 11, 49, 100, 20, 86, 29, 72 };
		obj.maxScore(cardPoints, 4);
	}

	public int maxScore(int[] cardPoints, int k) {
		int sum = 0;
        int current = 0;
		for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        if(k == cardPoints.length) {
            return sum;
        }
        current = sum;
		for (int i = 0; i < k; i++) {
			current = current - cardPoints[k-i-1] + cardPoints[cardPoints.length-1-i];
			sum = Math.max(sum, current);
		}
		return sum;
	}

}
