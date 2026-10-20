import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ass8_Q2 {
    int findMode(int[] arr) {
        if(arr.length==0) throw new IllegalArgumentException("Array cannot be empty");
        Map<Integer,Integer> freq=new HashMap<>(); int mode=arr[0], max=0;
        for(int value:arr) { int count=freq.getOrDefault(value,0)+1; freq.put(value,count); if(count>max) { max=count; mode=value; } }
        return mode;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass8_Q2 s=new ass8_Q2();
        System.out.print("Enter array size: "); int n=sc.nextInt(); if(n<=0) { System.out.println("Array size must be positive"); sc.close(); return; }
        int[] a=new int[n]; System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println("Mode: "+s.findMode(a)); sc.close();
    }
}
