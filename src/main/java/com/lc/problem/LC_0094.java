package com.lc.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;

public class LC_0094 {

	public static void main(String[] args) {
		LC_0094 obj = new LC_0094();
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);
		obj.inorderTraversal(root);
	}
	
	private List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
        	TreeNode current = stack.pop();
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            TreeNode top = stack.pop();
            result.add(top.val);
            if(top.right != null) {
                stack.add(top.right);
            }
        }
        return result;
    }
	
}
