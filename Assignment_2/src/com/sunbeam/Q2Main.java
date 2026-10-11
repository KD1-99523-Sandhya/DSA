package com.sunbeam;

import java.util.Scanner;

public class Q2Main{
	public static void main(String[] args) {
		Q2 st =new Q2(4);
		
		Scanner sc =new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1.Push\n 2.Pop\n 3.Peek");
			System.out.print("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("enter the value to be pushed:");
				int value = sc.nextInt();
				st.push(value);
				break;
			case 2:
				System.out.println("Poped Value:" +st.pop());
				break;
			case 3:
				System.out.println("Peeked value:"+st.peek());
				break;
			}
		}while(choice !=0);
		sc.close();
	}

}

