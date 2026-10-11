package com.sunbeam;

import java.util.Scanner;


public class demo1 {
	public static int linearSearch(int arr[],int key) {
		for(int i = arr.length - 1; i >= 0; i--) {
			if(key==arr[i]) {
				return i;
			}
		}
		
		return -1;
	

}
public static void main(String[] args ) {
	int arr[]= {11,22,33,44,22,55,66,77,88,22};
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter key to be Searched:");
	int key=sc.nextInt();
	int index =linearSearch(arr,key);
	if(index != -1)
		System.out.println("key found at index:"+index);
	else
		System.out.println("key is not found");
	
	sc.close();
	
}
}