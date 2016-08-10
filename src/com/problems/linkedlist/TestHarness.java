package com.problems.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class TestHarness {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		/*list.append(10);
		list.append(9);
		list.append(8);
		list.prepend(7);
		list.prepend(6);
		list.prepend(5);
		list.add(1000, 1);
		list.add(1000, 5);
		list.add(2000, 0);
		list.printList();
		
		int k = 1;
		int kthToLast = list.kthToLast(k);*/
		//System.out.println(k+" to last = " + kthToLast);
		
		/*LinkedList.Node n1 = list.new Node(1);
		LinkedList.Node n2 = list.new Node(2);
		LinkedList.Node n3 = list.new Node(3);
		
		list.appendNode(n1);
		list.appendNode(n2);
		list.appendNode(n3);
		list.appendNode(n2);
		
		//list.printList();
		
		//list.deleteMid(n2);
		LinkedList.Node cyc = list.findCycle();
		
		System.out.println(cyc);
		System.out.println(cyc.next);
		*/
		
	/*	LinkedList ll1 = new LinkedList();
		ll1.append(9);
		ll1.append(9);
		ll1.append(9);
		ll1.append(9);
		//ll1.printList();
		
		LinkedList ll2 = new LinkedList();
		ll2.append(9);
		ll2.append(9);
		ll2.append(9);
		
		LinkedList sum = new LinkedList();
		sum.addReverseLists(ll1, ll2);
		
		sum.printList();*/
		List<Integer> l = new ArrayList<>();
		//LinkedList l = new LinkedList();
		for(int i =0; i < 10e6;i++){
			l.append(i);
		}
		
		//list.printList();
		
		
		
		
		

	}

}
