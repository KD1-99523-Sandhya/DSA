import java.util.HashSet;
import java.util.Scanner;

public class ass8_Q4 {
    boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int value:nums) { if(set.contains(value)) return true; set.add(value); }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass8_Q4 s=new ass8_Q4();
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        System.out.println(s.containsDuplicate(a)?"Array contains duplicates":"No duplicates found"); sc.close();
    }
}
