package com.lc.problem.medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 * LC_0077_Combinations Description.
 *
 * @author Yashol Sharma
 */
public final class LC_0077_Combinations
{

	public static void main(String args[])
	{
		LC_0077_Combinations obj = new LC_0077_Combinations();
		int n = 4;
		int k = 2;
		List<List<Integer>> response = obj.combine(n, k);
		for (List<Integer> innerList : response)
		{
			for (Integer innerL : innerList)
			{
				System.out.print(innerL);
			}
			System.out.println("");
		}
	}

	public List<List<Integer>> combine(int n, int k) {
		if(k == 0) {
			return null;
		}
		int[] arr = new int[n];
		for(int i=0; i<n; ++i) {
			arr[i] = i+1;
		}
		List<List<Integer>> response = new LinkedList<>();
		Integer[] data = new Integer[k];
		generate(response, arr, data, n, k, 0);
		return response;
	}

	public void generate(List<List<Integer>> response, int[] arr, Integer[] data, int n, int k, int index) {
		for(int i=index; i<n; ++i) {
			if(index == k) {
				Integer[] cloned = new Integer[k];
				for(int j=0; j<k; ++j) {
					cloned[j] = data[j];
				}
				response.add(Arrays.asList(cloned));
				return;
			}
			data[index] = i+1;
			generate(response, arr, data, n, k, index + 1);
		}
	}
}
