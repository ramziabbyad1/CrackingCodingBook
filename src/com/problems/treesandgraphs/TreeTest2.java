package com.problems.treesandgraphs;

public class TreeTest2 {

	public static void main(String[] args) {
		
	} 
	
	public static void minTree(int[] arr, BST bst){
		int length = arr.length;
		int start = (int)Math.floor(length/2);
		insert(arr,start,bst);
	}
	
	public static void insert(int[] arr, int n, BST bst){
		bst.insert(arr[n]);
		if(n==0 || n==arr.length){
			return;
		}
		insert(arr,(int)Math.floor(n/2), bst);
		insert(arr,n+(int)Math.ceil(n/2), bst);
	}
	
	public static boolean isBST(BST bst){
		return isBST(bst.root);
	}
	public static boolean isBST(BST.Node node){
		return isBST(node, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}
	public static boolean isBST(BST.Node node,int leftParent, int rightParent){
		if(node==null){
			return true;
		}
		return isBST(node.left, node.left.value, rightParent)&&isBST(node.right,leftParent,node.right.value);
	}
}
