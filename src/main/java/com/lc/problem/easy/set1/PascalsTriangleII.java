package com.lc.problem.easy.set1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yashol Sharma
 */
public final class PascalsTriangleII {

	public static void main(String arg[]) {
		PascalsTriangleII obj = new PascalsTriangleII();
		List<Integer> v = obj.getRow(0);
		for (Integer l : v) {
			System.out.print(l + " -> ");
		}

	}

	public List<Integer> getRow(int rowIndex) {
		List<Integer> a = new ArrayList<>();

		a.add(0, 1);

		if (rowIndex >= 1) {
			a.add(1, 1);
		}
		for (int i = 2; i <= rowIndex; ++i) {
			a.add(0, 1);
			for (int j = 1; j <= i - 1; ++j) {
				a.set(j, a.get(j) + a.get(j + 1));
			}
		}
		return a;
	}

}
