package com.sunbeam;

import java.util.Scanner;

public class demo3 {
	public static int binarySearch(int arr[],int key) {
		int left=0,right=arr.length-1,mid;
		while(left <= right) {
			mid=(left + right)/2;
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				left=mid+1;
			else 
				right=mid-1;
				
			}
			
			return -1;
			
		}


	
	
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the key to be searched:");
		int key =sc.nextInt();
		
		int index=binarySearch(arr,key);
		if(index != -1)
			System.out.println("key is found at index:" +index);
		else 
			System.out.println("key is not found");
		
		sc.close();
		
		}
		
	}
	

	


