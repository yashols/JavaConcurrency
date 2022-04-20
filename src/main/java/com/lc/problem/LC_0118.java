package com.lc.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal triangle
 *
 */
public class LC_0118 {

	public static void main(String[] args) {
		LC_0118 obj = new LC_0118();
		List<List<Integer>> result = obj.generate(5);
		for(List<Integer> lines : result) {
			for(Integer line : lines) {
				System.out.print(line + " - ");
			}
			System.out.println();
		}
	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> first = new ArrayList<>();
		first.add(1);
		result.add(first);
		if (numRows == 1) {
			return result;
		}
		List<Integer> second = new ArrayList<>();
		second.add(1);
		second.add(1);
		result.add(second);
		if (numRows == 2) {
			return result;
		}
		for (int i = 2; i < numRows; ++i) {
			List<Integer> lastRow = result.get(i - 1);
			List<Integer> line = new ArrayList<>();
			line.add(1);
			for (int j = 1; j < i; ++j) {
				int a = lastRow.get(j - 1);
				int b = lastRow.get(j);
				line.add(a + b);
			}
			line.add(1);
			result.add(line);
		}
		return result;
	}
}
