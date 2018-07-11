package com.miya.example.test;

import com.miya.datastruct.treenode.BinaryTree;
import com.miya.datastruct.treenode.TreeNode;
import com.miya.recursive.method.RecursiveData;

public class Test {
	
	public static void main(String[] args) {
//		testBinaryTreeTravels();
		
		testRecusive();
		
	}
	
	
	private static void testRecusive(){
		RecursiveData recursiveFirst = new RecursiveData();
		recursiveFirst.getBottleCount(20);
		System.out.println("current count:"+recursiveFirst.getCount());
		System.out.println("----------------------------------------------------");
		
		RecursiveData recursiveSecond = new RecursiveData();
		recursiveSecond.testDeepWell(20);
//		recursiveSecond.getBottleCount(6);
//		System.out.println("current count:"+recursiveSecond.getCount());
		System.out.println("----------------------------------------------------");
	}
	
	private static void testBinaryTreeTravels(){
		System.out.println("print the system");
		BinaryTree binaryTree = new BinaryTree();
		TreeNode treeNode = binaryTree.init();
		System.out.println("\nprint the first traversal.");
		binaryTree.theFirstTraversal(treeNode);
		System.out.println("\nprint the order traversal.");
		binaryTree.theInOrderTraversal(treeNode);
		System.out.println("\nprint the first traversal use stack.");
		binaryTree.theFirstTraversal_Stack(treeNode);
		System.out.println("\nprint the order traversal use stack.");
		binaryTree.theOrderTraversal_Stack(treeNode);
	}

}
