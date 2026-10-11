package com.sunbeam;

import java.util.Scanner;


public class demo2 {
	public static int linearSearch(int arr[],int key,int n) {
		if(n<=0) {
			return -1;
		}
		
		int count=0;
		
		for(int i = 0; i < arr.length; i++) {
		if(key==arr[i]) {
			count++;
			
		 if(count==n) {
			 return i;
		 }
			 
		 }
		}
		
		
		return -1;
	

}
public static void main(String[] args ) {
	int arr[]= {11,22,33,44,22,55,66,77,88,22};
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter key to be Searched:");
	int key=sc.nextInt();
	
	System.out.println("enter the occurence you want to find:");
	int n=sc.nextInt();
	
	int index = linearSearch(arr, key, n);
    
    if (index != -1)
        System.out.println("Key " + key + " at occurrence " + n + " found at index: " + index);
    else
        System.out.println("Key is not found ");
    
    sc.close();
	
}
}