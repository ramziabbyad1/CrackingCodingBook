package com.problems.treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	public Node root = null;
	private class Node{
		List<Node> adjacent = new ArrayList<>();
		public int data;
		public boolean visited = false;
		public Node(int data){
			this.data = data;
		}
	}
	
	public void insert(int data){
		insert(root, data);
	}
	
	public void insert(Node node, int data){
		
	}
}
