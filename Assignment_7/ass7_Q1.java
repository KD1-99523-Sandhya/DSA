import java.util.Scanner;
import java.util.Arrays;

public class ass7_Q1 {
    void insertionSortDescending(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            int key=arr[i], j=i-1;
            while(j>=0 && arr[j]<key) { arr[j+1]=arr[j]; j--; }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass7_Q1 s=new ass7_Q1();
        System.out.print("Enter array size: "); int n=sc.nextInt(); int[] a=new int[n];
        System.out.println("Enter array elements:"); for(int i=0;i<n;i++) a[i]=sc.nextInt();
        s.insertionSortDescending(a); System.out.println("Descending order: "+Arrays.toString(a)); sc.close();
    }
}
