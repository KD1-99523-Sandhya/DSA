
package com.sunbeam;

public class Q3{

    static class Node {
        private int data;
        private Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;

    public Q3() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    
    public void addPosition(int value, int pos) {

        
        if (pos < 1)
            return;

        
        if (head == null) {
            if (pos == 1) {
                Node newnode = new Node(value);
                head = newnode;
                newnode.next = head;
            }
            return;
        }

        
        Node newnode = new Node(value);

        if (pos == 1) {
            Node trav = head;

            
            while (trav.next != head)
                trav = trav.next;

            newnode.next = head;
            trav.next = newnode;
            head = newnode;
            return;
        }


        Node trav = head;
        int i = 1;

        while (i < pos - 1 && trav.next != head) {
            trav = trav.next;
            i++;
        }

       
        if (i != pos - 1)
            return;

        
        newnode.next = trav.next;
        trav.next = newnode;
    }

    
    public void deletePosition(int pos) {

        
        if (head == null || pos < 1)
            return;

        
        if (pos == 1) {

            
            if (head.next == head) {
                head = null;
                return;
            }

            Node trav = head;

            while (trav.next != head)
                trav = trav.next;

         
            head = head.next;

            
            trav.next = head;
            return;
        }

        Node trav = head;
        int i = 1;

        while (i < pos - 1 && trav.next != head) {
            trav = trav.next;
            i++;
        }

        
        if (i != pos - 1 || trav.next == head)
            return;

        
        trav.next = trav.next.next;
    }

    
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node trav = head;

        System.out.print("List :: ");

        do {
            System.out.print(trav.data + " ");
            trav = trav.next;
        } while (trav != head);

        System.out.println();
    }

    public static void main(String[] args) {

        Q3 list = new Q3();

        
        list.addPosition(10, 1);
        list.addPosition(20, 2);
        list.addPosition(30, 3);
        list.addPosition(40, 4);

        System.out.println("list:");
        list.display();

        list.addPosition(25, 3);
        
        list.display();

        
        list.deletePosition(2);

        list.display();

       
        list.deletePosition(1);

        list.display();
    }
}
