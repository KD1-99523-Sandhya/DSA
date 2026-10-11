package com.sunbeam;

import java.util.Scanner;

public class Q1main {
	public static void main(String[] args) {
		Q1 q = new Q1(4);
		
		Scanner sc =new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.offer\n2.Poll\n3.peek");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the value to be pushed:");
				int value=sc.nextInt();
				q.offer(value);
				break;
			case 2:
				System.out.println("poped value:" +q.poll());
				break;
			case 3:
				System.out.println("Peeked value:" +q.peek());
				break;
			}
		}while(choice !=0);
		
		
	}

}
