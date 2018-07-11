package com.miya.datastruct.treenode;

import java.util.Stack;

public class BinaryTree {

	public TreeNode init() {
		// 注意必须逆序建立，先建立子节点，再逆序往上建立，因为非叶子结点会使用到下面的节点，而初始化是按顺序初始化的，不逆序建立会报错
		TreeNode J = new TreeNode(8, null, null);
		TreeNode H = new TreeNode(4, null, null);
		TreeNode G = new TreeNode(2, null, null);
		TreeNode F = new TreeNode(7, null, J);
		TreeNode E = new TreeNode(5, H, null);
		TreeNode D = new TreeNode(1, null, G);
		TreeNode C = new TreeNode(9, F, null);
		TreeNode B = new TreeNode(3, D, E);
		TreeNode A = new TreeNode(6, B, C);
		return A; // 返回根节点
	}

	public void printNode(TreeNode node) {
		System.out.print(node.getData() +"-");
	}

	public void theFirstTraversal(TreeNode root) { // 先序遍历
		printNode(root);
		if (root.getLeft() != null) { // 使用递归进行遍历左孩子
			theFirstTraversal(root.getLeft());
		}
		if (root.getRight() != null) { // 递归遍历右孩子
			theFirstTraversal(root.getRight());
		}
	}
	
	public void theInOrderTraversal(TreeNode root) {  //中序遍历  
        if (root.getLeft() != null) {  
            theInOrderTraversal(root.getLeft());  
        }  
        printNode(root);  
        if (root.getRight() != null) {  
            theInOrderTraversal(root.getRight());  
        }  
    }
	
	public void theFirstTraversal_Stack(TreeNode root) {  //先序遍历  
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        TreeNode node = root;  
        while (node != null || stack.size() > 0) {  //将所有左孩子压栈  
            if (node != null) {   //压栈之前先访问  
                printNode(node);  
                stack.push(node);  
                node = node.getLeft();
            } else {  
                node = stack.pop();  
                node = node.getRight(); 
            }  
        }  
    }  
	
	public void theOrderTraversal_Stack(TreeNode root) {  //先序遍历  
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        TreeNode node = root;  
        while (node != null || stack.size() > 0) {  //将所有左孩子压栈  
            if (node != null) {   //压栈之前先访问  
                stack.push(node);  
                node = node.getLeft();
            } else {  
                node = stack.pop();
                printNode(node);  
                node = node.getRight(); 
            }  
        }  
    }  

}
