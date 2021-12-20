package com.lc.problem.medium;

import com.common.TreeNode;

public class LC_0106_Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal {
	
	
	public static void main(String args[]) {
		LC_0106_Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal obj = new LC_0106_Construct_Binary_Tree_From_Inorder_And_Postorder_Traversal();
		
		int[] inOrder = {9,3,15,20,7};
		int[] postOrder = {9,15,7,20,3};
		
		obj.buildTree(inOrder, postOrder);
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return construct(inorder, postorder, 0, inorder.length - 1, postorder.length - 1);
    }
    
    
    public TreeNode construct(int[] inorder, int[] postorder, int start, int end, int index) {
        
        if(end < start) {
            return null;
        }
        
        TreeNode root = new TreeNode(postorder[index]);
        
        int i = start;
        while(postorder[index] != inorder[i]) {
            i++;
        }
        
        root.left = construct(inorder, postorder, start, i-1, index - (end - i) - 1);
        root.right = construct(inorder, postorder, i + 1, end, index - 1);
        
        
        return root;
        
    }

}
