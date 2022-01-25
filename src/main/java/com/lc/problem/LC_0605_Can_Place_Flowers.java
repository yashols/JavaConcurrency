package com.lc.problem;

public class LC_0605_Can_Place_Flowers {

	public static void main(String[] args) {
		LC_0605_Can_Place_Flowers obj = new LC_0605_Can_Place_Flowers();
		int[] flowerbed = { 1, 0, 0, 0, 1, 0, 0 };
		boolean result = obj.canPlaceFlowers(flowerbed, 2);
		System.out.println(result);
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		if (flowerbed.length == 0) {
			return false;
		}
		if (flowerbed.length == 1) {
			if (flowerbed[0] == 0 && n == 1) {
				return true;
			}
			if (n == 0) {
				return true;
			}
			return false;
		}

		int number = 0;

		int total = 0;
		while (true) {
			if (number >= flowerbed.length) {
				break;
			}
			if ((number-1 == -1 || flowerbed[number-1] == 0) && flowerbed[number] == 0
					&& (number+1 == flowerbed.length || flowerbed[number+1] == 0)) {
				++total;	
			}
			++number;
		}
		return total == n;
	}

}
