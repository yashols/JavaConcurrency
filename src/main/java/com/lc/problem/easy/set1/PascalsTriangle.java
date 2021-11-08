package com.lc.problem.easy.set1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yashol Sharma
 */
public final class PascalsTriangle {

	public static void main(String arg[]) {
		PascalsTriangle obj = new PascalsTriangle();
		List<List<Integer>> v = obj.generate(2);
		for (List<Integer> l : v) {
			System.out.print(l + " -> ");
		}

	}

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> response = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return response;
		}
		for (int i = 0; i < numRows; ++i) {
			List<Integer> a = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j) {
				if (j == 0 || j == i) {
					a.add(1);
				} else {
					a.add(response.get(i - 1).get(j - 1) + response.get(i - 1).get(j));
				}
			}
			response.add(a);
		}
		return response;
	}

}
