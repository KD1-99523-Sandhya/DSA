import java.util.PriorityQueue;
import java.util.Scanner;

public class ass6_Q3 {
    int findKthLargest(int[] nums, int k) {
        if(k<1 || k>nums.length) throw new IllegalArgumentException("k must be between 1 and array length");
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int value:nums) { pq.offer(value); if(pq.size()>k) pq.poll(); }
        return pq.peek();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass6_Q3 s=new ass6_Q3();
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter k: "); int k=sc.nextInt();
        try { System.out.println("Kth largest element: "+s.findKthLargest(a,k)); }
        catch(IllegalArgumentException e) { System.out.println(e.getMessage()); }
        sc.close();
    }
}
