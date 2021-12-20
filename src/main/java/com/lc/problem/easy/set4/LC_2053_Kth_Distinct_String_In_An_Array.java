package com.lc.problem.easy.set4;

import java.util.HashMap;
import java.util.Map;

public class LC_2053_Kth_Distinct_String_In_An_Array {

	public static void main(String[] args) {
		LC_2053_Kth_Distinct_String_In_An_Array obj = new LC_2053_Kth_Distinct_String_In_An_Array();
		String[] arr = { "d", "b", "c", "b", "c", "a" };
		String result = obj.kthDistinct(arr, 2);
		System.out.println(result);
	}

	public String kthDistinct(String[] arr, int k) {
		Map<String, Integer> stringOccurance = new HashMap<String, Integer>();
		for (String str : arr) {
			if (stringOccurance.containsKey(str)) {
				stringOccurance.put(str, stringOccurance.get(str) + 1);
			} else {
				stringOccurance.put(str, 1);
			}
		}
		int strFoundWithOneOccurance = 0;
		for (String str : arr) {
			if (stringOccurance.get(str) == 1) {
				++strFoundWithOneOccurance;
			}
			if (strFoundWithOneOccurance == k) {
				return str;
			}
		}
		return "";
	}

}
