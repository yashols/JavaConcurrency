package com.lc.problem;

import java.util.ArrayList;
import java.util.List;

import com.common.TreeNode;

public class LC_1022_Sum_of_Root_To_Leaf_Binary_Numbers {

	private int sum = 0;
	
	public static void main(String[] args) {
		LC_1022_Sum_of_Root_To_Leaf_Binary_Numbers obj = new LC_1022_Sum_of_Root_To_Leaf_Binary_Numbers();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(1);
		/*
		 * root.right = new TreeNode(1); root.left.left = new TreeNode(0);
		 * root.left.right = new TreeNode(1); root.right.left = new TreeNode(0);
		 * root.right.right = new TreeNode(1);
		 */
		int result = obj.sumRootToLeaf(root);
		System.out.println(result);
	}

	public int sumRootToLeaf(TreeNode root) {
		if(root == null) {
			return 0;
		}
		sumRootToLeaf(root, new ArrayList<Integer>());
		return sum;
	}
	
	
	public void sumRootToLeaf(TreeNode root, List<Integer> list) {
		if(root == null) {
			return;
		}
		list.add(root.val);
		if(root.left == null && root.right == null) {
			addToSum(list);
			list.remove(list.size() - 1);
			return;
		}
		
		sumRootToLeaf(root.left, list);
		sumRootToLeaf(root.right, list);
		
		list.remove(list.size() - 1);
	}
	
	private void addToSum(List<Integer> list) {
		int value = 0;
		int pow = list.size();
		for(int i : list) {
			int power = (int) Math.pow(2, --pow);
			value += i * power;
		}
		sum += value;
	}
}
