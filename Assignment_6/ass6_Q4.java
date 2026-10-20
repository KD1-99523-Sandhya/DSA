import java.util.*;

public class ass6_Q4 {
    int[] topKFrequent(int[] nums, int k) {
        if(k<0) throw new IllegalArgumentException("k cannot be negative");
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x:nums) freq.put(x,freq.getOrDefault(x,0)+1);
        if(k>freq.size()) throw new IllegalArgumentException("k cannot exceed the number of distinct values");
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(freq.get(b),freq.get(a)));
        pq.addAll(freq.keySet()); int[] result=new int[k];
        for(int i=0;i<k;i++) result[i]=pq.poll();
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass6_Q4 s=new ass6_Q4();
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter k: "); int k=sc.nextInt();
        try { System.out.println("Top k frequent elements: "+Arrays.toString(s.topKFrequent(a,k))); }
        catch(IllegalArgumentException e) { System.out.println(e.getMessage()); }
        sc.close();
    }
}
