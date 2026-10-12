package com.sunbeam;

import java.util.LinkedList;

public class Q2 {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	
	public Q2() {
		head=null;
	}
	
	public boolean isEmpty() {
		return  head==null;
	
	}
	public void insertsorted(int value) {
		Node newnode = new Node(value);
		
		
		if(head == null || value<=head.data) {
			newnode.next = head;
			head=newnode;
			return;
		}
		
		Node trav = head;
		
		while(trav.next!=null && trav.next.data<value) {
			trav=trav.next;
		}
		
		newnode.next = trav.next;
		trav.next=newnode;	
		
	}
	
	public void display() {
		Node trav = head;
		System.out.println("List:");
		
		while(trav !=null) {
			System.out.println(trav.data + " ");
			trav =trav.next;
		}
		
		System.out.println();
	}

}
