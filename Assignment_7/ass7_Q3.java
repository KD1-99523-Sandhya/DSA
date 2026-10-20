import java.util.Scanner;

class ListNode7Q3 { int val; ListNode7Q3 next; ListNode7Q3(int val){this.val=val;} }

public class ass7_Q3 {
    ListNode7Q3 mergeTwoLists(ListNode7Q3 a,ListNode7Q3 b) {
        ListNode7Q3 dummy=new ListNode7Q3(0),cur=dummy;
        while(a!=null && b!=null) {
            if(a.val<=b.val) { cur.next=a; a=a.next; }
            else { cur.next=b; b=b.next; }
            cur=cur.next;
        }
        cur.next=(a!=null)?a:b; return dummy.next;
    }
    ListNode7Q3 readList(Scanner sc,int n) {
        ListNode7Q3 head=null,tail=null;
        for(int i=0;i<n;i++) { int x=sc.nextInt(); ListNode7Q3 node=new ListNode7Q3(x); if(head==null) head=node; else tail.next=node; tail=node; }
        return head;
    }
    void display(ListNode7Q3 head) { if(head==null) { System.out.println("(empty)"); return; } while(head!=null) { System.out.print(head.val); if(head.next!=null) System.out.print(" -> "); head=head.next; } System.out.println(); }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass7_Q3 s=new ass7_Q3();
        System.out.print("Number of elements in first sorted list: "); int n1=sc.nextInt();
        System.out.println("Enter first list in sorted order:"); ListNode7Q3 a=s.readList(sc,n1);
        System.out.print("Number of elements in second sorted list: "); int n2=sc.nextInt();
        System.out.println("Enter second list in sorted order:"); ListNode7Q3 b=s.readList(sc,n2);
        System.out.print("Merged list: "); s.display(s.mergeTwoLists(a,b)); sc.close();
    }
}
