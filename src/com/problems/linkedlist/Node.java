package com.problems.linkedlist;

public class Node {
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
	
	public void append(int data){
		Node end = new Node(data);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
	
	public void printList(){
		Node n = this;
		while(n!=null){
			System.out.println(n);
			n = n.next;
		}
	}

	@Override
	public String toString() {
		return ""+data;
	}
}
