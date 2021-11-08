package com.lc.problem.easy.set1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.common.TreeNode;

/**
 * @author Yashol Sharma
 */
public final class BinaryTreePostorderTraversal {

	public static void main(String arg[]) {
		BinaryTreePostorderTraversal obj = new BinaryTreePostorderTraversal();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		t2.left = t1;
		t2.right = t3;
		List<Integer> v = obj.postOrderTraversal(t2);
		for (int i : v) {
			System.out.print(i + " -> ");
		}
	}

	public List<Integer> postOrderTraversal(TreeNode root) {
		List<Integer> response = new ArrayList<Integer>();
        if(root == null) {
            return response;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            
            TreeNode current = stack.pop();
            response.add(0, current.val);
            if(current.left != null) {
                stack.push(current.left);
            }
            if(current.right != null) {
                stack.push(current.right);
            }
            
        }
        
        return response;
	}

}
