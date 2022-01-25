package com.lc.problem;

public class LC_0134 {

	public static void main(String[] args) {
		LC_0134 obj = new LC_0134();
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 3, 4, 5, 1, 2 };
		int result = obj.canCompleteCircuit(gas, cost);
		System.out.println(result);
	}

	public int canCompleteCircuit(int[] gas, int[] cost) {

		int totalGas = 0;
		int g = 0;
		for (g = 0; g < gas.length; ++g) {
			totalGas = 0;
			boolean found = false;
			for (int i = 0; i < gas.length; ++i) {
				int index = (i + g) % gas.length;
				int indexExtra = (g + i + 1) % gas.length;
				totalGas += gas[index];
				if (gas[indexExtra] > totalGas) {
					found = true;
					break;
				}
				totalGas -= cost[index];

			}
			if (!found) {
				return g;
			}
		}

		return g;
	}

}
