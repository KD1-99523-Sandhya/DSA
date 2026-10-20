import java.util.Scanner;

public class ass6_Q1 {
    private int[] heap = new int[1000]; private int size = 0;
    void add(int value) {
        if (size == heap.length) { System.out.println("Heap is full"); return; }
        heap[size] = value; int i = size++;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] <= heap[i]) break;
            int temp=heap[parent]; heap[parent]=heap[i]; heap[i]=temp; i=parent;
        }
    }
    Integer deleteMin() {
        if (size == 0) return null;
        int min=heap[0]; heap[0]=heap[--size]; int i=0;
        while (true) {
            int left=2*i+1, right=2*i+2, smallest=i;
            if(left<size && heap[left]<heap[smallest]) smallest=left;
            if(right<size && heap[right]<heap[smallest]) smallest=right;
            if(smallest==i) break;
            int temp=heap[i]; heap[i]=heap[smallest]; heap[smallest]=temp; i=smallest;
        }
        return min;
    }
    void display() { if(size==0) { System.out.println("Heap is empty"); return; } for(int i=0;i<size;i++) System.out.print(heap[i]+" "); System.out.println(); }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass6_Q1 h=new ass6_Q1(); int choice;
        do {
            System.out.println("\n1. Add  2. Delete minimum  3. Display heap  0. Exit");
            System.out.print("Choice: "); choice=sc.nextInt();
            switch(choice) {
                case 1: System.out.print("Value: "); h.add(sc.nextInt()); break;
                case 2: Integer value=h.deleteMin(); if(value==null) System.out.println("Heap is empty"); else System.out.println("Deleted minimum: "+value); break;
                case 3: h.display(); break;
                case 0: System.out.println("Exit"); break;
                default: System.out.println("Invalid choice");
            }
        } while(choice!=0);
        sc.close();
    }
}
