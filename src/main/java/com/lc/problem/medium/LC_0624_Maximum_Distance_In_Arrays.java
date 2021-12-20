package com.lc.problem.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_0624_Maximum_Distance_In_Arrays {

	public static void main(String[] args) {
		LC_0624_Maximum_Distance_In_Arrays obj = new LC_0624_Maximum_Distance_In_Arrays();
		// [[-10,-9,-9,-3,-1,-1,0],[-5],[4],[-8],[-9,-6,-5,-4,-2,2,3],[-3,-3,-2,-1,0]]

		List<List<Integer>> arrays = new ArrayList<>();
		Integer[] list1 = { -10, -9, -9, -3, -1, -1, 0 };
		arrays.add(Arrays.asList(list1));
		Integer[] list2 = { -5 };
		arrays.add(Arrays.asList(list2));
		Integer[] list3 = { 4 };
		arrays.add(Arrays.asList(list3));
		Integer[] list4 = { -8 };
		arrays.add(Arrays.asList(list4));
		Integer[] list5 = {-9, -6, -5, -4, -2, 2, 3};
		arrays.add(Arrays.asList(list5));
		Integer[] list6 = {-3, -3, -2, -1, 0};
		arrays.add(Arrays.asList(list6));

		// Integer[] list1 = {1,5};
		// arrays.add(Arrays.asList(list1));
		// Integer[] list2 = {3,4};
		// arrays.add(Arrays.asList(list2));
		int result = obj.maxDistance(arrays);
		System.out.println(result);
	}

	public int maxDistance(List<List<Integer>> arrays) {
		if (arrays == null || arrays.size() == 0) {
			return 0;
		}
		Integer min = arrays.get(0).get(0);
		Integer max = arrays.get(0).get(arrays.get(0).size() - 1);
		int response = 0;
		for (int count = 1; count < arrays.size(); ++count) {
			List<Integer> list = arrays.get(count);
			int first = list.get(0);
			int last = list.get(list.size() - 1);
			System.out.println(min + " -> " + max + " -> " + first + " -> " + last + " - >" + response);
			if (Math.abs(last - min) > Math.abs(max - first)) {
				max = last;
			} else {
				min = first;
			}
			response = Math.max(response, Math.abs(max - min));
			System.out.println(min + " -> " + max + " -> " + first + " -> " + last + " - >" + response);
		}
		return response;
	}

}
