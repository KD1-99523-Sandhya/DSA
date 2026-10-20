import java.util.Scanner;

class Node5Q3 {
    int data; Node5Q3 left, right;
    Node5Q3(int data) { this.data = data; }
}

public class ass5_Q3 {
    Node5Q3 insert(Node5Q3 root, int value) {
        if (root == null) return new Node5Q3(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }
    Node5Q3 successor(Node5Q3 root, int key) {
        Node5Q3 answer = null;
        while (root != null) {
            if (root.data > key) { answer = root; root = root.left; }
            else root = root.right;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ass5_Q3 t = new ass5_Q3(); Node5Q3 root = null;
        System.out.print("Enter number of BST nodes: "); int n=sc.nextInt();
        System.out.println("Enter node values:"); for(int i=0;i<n;i++) root=t.insert(root,sc.nextInt());
        System.out.print("Enter value to find its successor: "); int key=sc.nextInt();
        Node5Q3 result=t.successor(root,key);
        if(result==null) System.out.println("Successor does not exist"); else System.out.println("Successor: "+result.data);
        sc.close();
    }
}
