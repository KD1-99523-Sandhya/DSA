package com.sunbeam;

import java.util.LinkedList;

public class Q1 {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next =null;
		}	
	}
	private Node head;
	
	public Q1() {
		head=null;
	}
	
	public boolean isEmpty() {
		return head ==null;
		
	}
	public void addFirst(int value) {
        Node newnode = new Node(value);

        newnode.next = head;
        head = newnode;
    }
	
	public void insertAfterData(int value,int key) {
		if(head==null)
			return;
		Node trav=head;
		
		while(trav!=null && trav.data !=key)
			trav =trav.next;
		if(trav == null)
			return;
		
	Node newnode =new Node(value);
	
	newnode.next=trav.next;
	trav.next=newnode;
	
		
	}
	
	public void insertBefore(int value,int key) {
		if(head==null)
			return;
		
		if(head.data==key) {
			Node newnode = new Node(value);
			newnode.next=head;
			head=newnode;
			return;
			
		}
		Node trav = head;

      
        while (trav.next != null && trav.next.data != key)
            trav = trav.next;

        if (trav.next == null)
            return;

        Node newnode = new Node(value);

        newnode.next = trav.next;
        trav.next = newnode;
		
		
	}
	public void display() {
        Node trav = head;

        System.out.print("List :: ");

        while (trav != null) {
            System.out.print(trav.data + " ");
            trav = trav.next;
        }

        System.out.println();
    }
	
	

}
