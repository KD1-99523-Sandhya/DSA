package com.sunbeam;

import java.util.Scanner;

public class Q3Main {
	public static void main(String[] args) {
		Q3 q = new Q3(4);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.offer\n2.poll\n3.peek");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter value to be pushed:");
				int value=sc.nextInt();
				q.offer(value);
				break;
			case 2:
				System.out.println("popped value:" +q.poll());
				break;
			case 3:
				System.out.println("peeked value:" +q.peek());
				break;
				
			}
		}while(choice !=0);
	}

}

