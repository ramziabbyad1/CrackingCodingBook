package com.problems.treesandgraphs;

public class BST {
	
	public Node root = null;
	
	class Node{
		public Node left;
		public Node right;
		public int value;
		Node(int value){
			this.value = value;
			left = null;
			right = null;
		}
	}
	
	public void insert(int value){
		if(root==null){	root = new Node(value);}
		else{
			root = insert(root, value);
		}
	}
	
	private Node insert(Node node, int value){
		if(node == null){
			return new Node(value);
		}else if(value < node.value){
			node.left = insert(node.left, value);
		}else{
			node.right = insert(node.right, value);
		}
		return node;
	}
	
	public void inOrder(){
		if(root!=null)
			inOrder(root);
	}
	
	private void inOrder(Node node){
		if(node.left != null)
			inOrder(node.left);
		System.out.println(node.value);
		if(node.right != null)
			inOrder(node.right);
	}
	
	public void preOrder(){
		if(root!=null)
			preOrder(root);
	}
	
	private void preOrder(Node node){
		System.out.println(node.value);
		if(node.left != null)
			preOrder(node.left);
		if(node.right != null)
			preOrder(node.right);
	}
	
	public void postOrder(){
		if(root!=null)
			postOrder(root);
	}
	
	private void postOrder(Node node){
		if(node.left!=null){
			postOrder(node.left);
		}
		if(node.right!=null){
			postOrder(node.right);
		}
		System.out.println(node.value);
	}
	
	public boolean contains(int value){
		return contains(root,value);
	}
	
	private boolean contains(Node node, int value){
		if(node == null){
			return false;
		}else if(node.value == value){
			return true;
		}else if(value < node.value){
			return contains(node.left, value);
		}else{
			return contains(node.right, value);
		}
		
		
	}
	
	public int getHeight(Node node){
		if(node==null){
			return 0;
		}
		return Math.max(getHeight(node.left), getHeight(node.right))+1;
	}
	
	public boolean isBalanced(){
		return isBalanced(root);
	}
	
	public boolean isBalanced(Node node){
		if(node==null){
			return true; 
		}
		if(Math.abs(getHeight(node.left)-getHeight(node.right))<=1){
			return (isBalanced(node.left) && isBalanced(node.right));
		}else{
			return false;
		}
		
	}
	
	/*public boolean isBalanced2(){
		return isBalanced(root);
	}*/
	
	public int checkHeight(Node node){
		if(node==null){
			return 0;
		}
		int heightR = checkHeight(node.right);
		if(heightR==-1){
			return -1;
		}
		int heightL = checkHeight(node.left);
		if(heightL==-1){
			return -1;
		}
		
		if(Math.abs(heightR-heightL)>1){
			return -1;
		}else{
			return Math.max(heightR, heightL)+1;
		}
	}
	
	public boolean isBalanced2(){
		return isBalanced2(root);
	}
	
	public boolean isBalanced2(Node node){
		if(checkHeight(node)==-1){
			return false;
		}else{
			return true;
		}
		
	}
	/*
	 * check height of left and right subtrees 
	 * */
	/*public boolean bfsContains(int value){
	//	return bfsContains(root, value);
	}*/
	
	
	
	
	/*
	 * Trace of insert:
	 * insert(10) => root = 10;
	 * 
	 * insert(8)  => root = insert(root,value) returns root
	 * 			  => root.left = insert(root.left,value) 
	 * 			  =>  insert(root.left,value) returns new Node(value);
	 * 
	 * 
	 * */
	
	
}
