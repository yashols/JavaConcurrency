package com.lc.topics.array;

public class DuplicateZero {

	public static void main(String[] args) {
		DuplicateZero obj = new DuplicateZero();
		int[] arr = { 1,1,2,3,1,4,5,1 };
		obj.duplicateZeros(arr);
		System.out.println(arr);
	}

	public void duplicateZeros(int[] arr) {
		for (int i = 0; i < arr.length-1; ++i) {
			if (arr[i] == 0) {
				for (int j = arr.length - 2; j >= i + 1; --j) {
					arr[j + 1] = arr[j];
				}
				
				arr[i + 1] = 0;
				++i;
			}
		}
	}

}
