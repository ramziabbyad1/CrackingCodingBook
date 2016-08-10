package com.problems.linkedlist;

import java.util.HashMap;
import java.util.Hashtable;

public class LinkedList {
	public Node head = null;
	public Node run = null;
	public int size =0;
	
	public class Node {
		public Node next = null;
		int data;
		public Node(){}
		public Node(int data){
			this.data = data;
		}
		@Override
		public String toString() {
			return ""+data;
		}
	}
	public void addForwardLists(LinkedList ll1, LinkedList ll2){
		addForwardLists(ll1.head, ll2.head, 0, new Sum());
	}
	public class Sum{
		public int data=0;
	}
	//Since lists are of unequal length recurse on each list separately
	//How? If ll1.next==null stop and wait for ll2.next==null
	//This will take additional recursive calls, so need to track sum
	//through those calls
	//Using a wrapper class Sum
	public void addForwardLists(Node ll1, Node ll2, int next, Sum s){
		int sum = 0;
		if(ll1.next==null){
			s.data += ll1.data;
		}else{
			ll1 = ll1.next;
		}
		if(ll2.next==null){
			s.data += ll2.data;
		}else{
			ll2 = ll2.next;
		}
		
		//addForwardLists(ll1.next, ll2.next, next);
	}
	
	public void addReverseLists(LinkedList ll1, LinkedList ll2){
		//LinkedList sum = new LinkedList();
		//int remainder = 0;
		int next = 0;
		int curr = 0;
		int isum = 0;
		ll1.run = ll1.head;
		ll2.run = ll2.head;
		while(ll1.run != null && ll2.run != null){
			//System.out.println(ll1.run);
			//System.out.println(ll2.run);
			isum = ll1.run.data+ll2.run.data+next;
			if(isum>=10){
				curr = isum - 10;
				
				this.append(curr);
				next = 1;
			}else{
				
				this.append(isum);
				next = 0;
			}
			ll1.run = ll1.run.next;
			ll2.run = ll2.run.next;
		}
		while(ll1.run != null){
			
			isum = ll1.run.data+next;
			if(isum>=10){
				curr = isum-10;
				this.append(curr);
				next = 1;
			}else{
				this.append(isum);
				next = 0;
			}
			ll1.run = ll1.run.next;
		}
		while(ll2.run != null){
		
			isum = ll2.run.data+next;
			if(isum>=10){
				curr = isum-10;
				this.append(curr);
				next = 1;
			}else{
				this.append(isum);
				next = 0;
			}
			ll2.run = ll2.run.next;
		}
		if(next!=0){
			this.append(1);
		}
		//this.printList();
	
	}
	
	public LinkedList partition(int k){
		LinkedList out = new LinkedList();
		LinkedList less = new LinkedList();
		LinkedList more = new LinkedList();
		Node n = head;
		while(n.next != null){
			Node node = new Node(n.data);
			if(n.data < k){
				less.appendNode(node);
			}else{
				more.appendNode(node);
			}
			n=n.next;
		}
		out.appendNode(less.head);
		out.appendNode(more.head);
		return out;
	}
	
	public boolean isPalindrome(){
		boolean out = false;
		Node n = head;
		//Node run = null;
		if(n.next==null){
			return true;
		}
		int i = 0;
		while(i < Math.floor(size/2)){
			
			i++;
		}
		
		return out;
	}
	
	public Node findCycle(){
		Node out = null;
		Node n = head;
		Node run = head;
		int index = 0;
		if(run.next==null){
			return run;
		}
		while(run.next != null){
			run = run.next;
			index++;
			for(int i = 0; i < index; i++){
				if(run==n){
					return n;
				}
				n=n.next;
			}
			n=head;
		}
		
		return out;
	}
	
	public void deleteMid(Node n){
		//size = 7, i < 2
		Node run = this.head;
		Node ahead = this.head;
		ahead = ahead.next;
		for(int i = 0; i < Math.floor(size/2.0)-1; i++){
			run = run.next;
			ahead = ahead.next;
		}
		run.next = ahead.next;
		size--;
	}
	
	public int kthToLast(int k){
		//if k = 0 run moves out 1 head when run.next=null n = last return last
		//if k = 1 run moves out 2 ahead of n
		//if k = 2 run will be two ahead so if list is size 3 n=1, run = 3
		//run will move to null n=2
		//run = this.head;
		Node n = this.head;
		moveKPlaces(k);
		while(run.next!=null){
			n = n.next;
			run = run.next;
		}
		
		return n.data;
	}
	
	public void appendNode(Node n){
		if(head==null) head = n;
		else{
			run = head;
			while(run.next!= null){
				run = run.next;
			}
			run.next = n;
		}
		size++;
	}
	
	public void moveKPlaces(int k){
		run = this.head;
		for(int i = 0; i < k; i++){
			run = run.next;
		}
	}
	
	public void add(int data, int pos){
		if(pos==0){
			prepend(data);
		}else{
			Node n = new Node(data);
			Node before = this.head;
			for(int i = 0; i < pos-1;i++){
				before = before.next;
			}
			Node after = before.next; 
			before.next = n;
			n.next = after;
		}
		size++;
	}
		
	public void append(int data){
		Node end = new Node(data);
		if(head==null){
			head = end;
		}else{
			Node n = this.head;
			while(n.next!=null){
				n = n.next;
			}
			n.next = end;
		}
		size++;
	}
	
	public void prepend(int data){
		Node beg = new Node(data);
		if(head==null){
			head = beg;
		}else{
			beg.next = this.head;
			this.head = beg;
		}
		size++;
	}
	
	public void printList(){
		Node n = this.head;
		while(n!=null){
			System.out.print(" "+n);
			n = n.next;
		}
		System.out.println();
	}

}

