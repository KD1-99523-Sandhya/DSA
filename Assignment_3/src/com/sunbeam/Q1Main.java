package com.sunbeam;

import java.util.LinkedList;

public class Q1Main {
	public static void main(String[] args) {
		Q1 list =new Q1();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		
		list.insertAfterData(90,20);
		list.insertBefore(100,30);
		
		
		System.out.println("list:");
		list.display();
		
		
		
	}

}
