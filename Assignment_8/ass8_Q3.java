import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public class ass8_Q3 {
    int[] twoSum(int[] nums,int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) { int need=target-nums[i]; if(map.containsKey(need)) return new int[]{map.get(need),i}; map.put(nums[i],i); }
        return new int[0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass8_Q3 s=new ass8_Q3();
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.print("Enter target: "); int target=sc.nextInt(); int[] result=s.twoSum(a,target);
        if(result.length==0) System.out.println("No pair found"); else System.out.println("Indices: "+Arrays.toString(result)); sc.close();
    }
}
