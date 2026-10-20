import java.util.Scanner;
import java.util.Arrays;

public class ass7_Q2 {
    void merge(int[] nums1,int m,int[] nums2,int n) {
        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0) { if(nums1[i]>nums2[j]) nums1[k--]=nums1[i--]; else nums1[k--]=nums2[j--]; }
        while(j>=0) nums1[k--]=nums2[j--];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass7_Q2 s=new ass7_Q2();
        System.out.print("Number of elements in first sorted array: "); int m=sc.nextInt(); int[] a=new int[m+m];
        System.out.println("Enter first array elements in sorted order:"); for(int i=0;i<m;i++) a[i]=sc.nextInt();
        System.out.print("Number of elements in second sorted array: "); int n=sc.nextInt(); int[] b=new int[n];
        System.out.println("Enter second array elements in sorted order:"); for(int i=0;i<n;i++) b[i]=sc.nextInt();
        a=Arrays.copyOf(a,m+n); s.merge(a,m,b,n); System.out.println("Merged array: "+Arrays.toString(a)); sc.close();
    }
}
