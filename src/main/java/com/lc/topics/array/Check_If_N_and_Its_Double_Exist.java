package com.lc.topics.array;

public class Check_If_N_and_Its_Double_Exist {

	public static void main(String[] args) {
		Check_If_N_and_Its_Double_Exist obj = new Check_If_N_and_Its_Double_Exist();
		int[] arr = { 7, 1, 14, 11 };
		obj.checkIfExist(arr);
	}

	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			int n = arr[i];
			for (int j = i + 1; j < arr.length; ++j) {
				int m = arr[j];
				if (n == 2 * m || n * 2 == m) {
					return true;
				}
			}
		}
		return false;
	}

}
