package com.lc.problem.medium;

import com.common.TreeNode;

public class LC_0450_Delete_Node_BST {

	
	public static void main(String args[]) {
		LC_0450_Delete_Node_BST obj = new LC_0450_Delete_Node_BST();
		TreeNode root = new TreeNode(33);
		root.left = new TreeNode(32);
		root.right = new TreeNode(45);
		root.right.left = new TreeNode(40);
		root.right.right = new TreeNode(49);
		root.right.right.left = new TreeNode(48);
		root.right.right.left.left = new TreeNode(46);
		root.right.right.left.left.right = new TreeNode(47);
		obj.deleteNode(root, 49);
	}
	
	
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) {
            return null;
        }
        TreeNode current = root;
        TreeNode parent = root;
        while(current != null && current.val != key) {
            parent = current;
            if(current.val > key) {
                current = current.left;
            } else if (current.val < key) {
                current = current.right;
            }
        }
        if(current == null) {
        	return root;
        }
        boolean deleteRootNode = false;
        if(current == root) {
            deleteRootNode = true;
        }
        if(current.left == null && current.right == null) {
            if(deleteRootNode) {
                return null;
            } else {
                if(parent.val > current.val) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                return root;
            }
        }
        TreeNode replacement = null;
        if(current.right != null) {
            replacement = getNextNode(current.right);
        }else if(current.left != null) {
            replacement = getNextNode(current.left);
        }
        if(replacement == current.left) {
        	replacement.left = replacement.left;
        } else {
        	replacement.left = current.left;
        }
        if(replacement == current.right) {
        	replacement.right = replacement.right;
        } else {
        	replacement.right = current.right;
        }
        if(deleteRootNode) {
        	return replacement;
        }
        if(parent.val > current.val) {
            parent.left = replacement;
        } else {
            parent.right = replacement;
        }
        return root;
    }
    
    public TreeNode getNextNode(TreeNode node) {
    	TreeNode parentNode = node;
        while(node.left != null) {
        	parentNode = node;
            node = node.left;
        }
        if(parentNode != node) {
        	parentNode.left = node.right;
        }
        return node;
    }
	
}
