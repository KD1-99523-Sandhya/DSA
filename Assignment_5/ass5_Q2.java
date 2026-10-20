import java.util.Scanner;
import java.util.Stack;

class Node5Q2 {
    int data;
    Node5Q2 left, right;
    Node5Q2(int data) { this.data = data; }
}

public class ass5_Q2 {
    Node5Q2 insert(Node5Q2 root, int value) {
        if (root == null) return new Node5Q2(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }
    void preorder(Node5Q2 root) {
        if (root == null) return;
        Stack<Node5Q2> st = new Stack<>(); st.push(root);
        while (!st.isEmpty()) {
            Node5Q2 cur = st.pop(); System.out.print(cur.data + " ");
            if (cur.right != null) st.push(cur.right);
            if (cur.left != null) st.push(cur.left);
        }
    }
    void inorder(Node5Q2 root) {
        Stack<Node5Q2> st = new Stack<>(); Node5Q2 cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) { st.push(cur); cur = cur.left; }
            cur = st.pop(); System.out.print(cur.data + " "); cur = cur.right;
        }
    }
    void postorder(Node5Q2 root) {
        if (root == null) return;
        Stack<Node5Q2> s1 = new Stack<>(), s2 = new Stack<>(); s1.push(root);
        while (!s1.isEmpty()) {
            Node5Q2 cur = s1.pop(); s2.push(cur);
            if (cur.left != null) s1.push(cur.left);
            if (cur.right != null) s1.push(cur.right);
        }
        while (!s2.isEmpty()) System.out.print(s2.pop().data + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); ass5_Q2 t = new ass5_Q2(); Node5Q2 root = null;
        System.out.print("Enter number of BST nodes: "); int n = sc.nextInt();
        System.out.println("Enter node values:"); for (int i=0;i<n;i++) root=t.insert(root,sc.nextInt());
        System.out.print("Preorder: "); t.preorder(root);
        System.out.print("\nInorder: "); t.inorder(root);
        System.out.print("\nPostorder: "); t.postorder(root); System.out.println(); sc.close();
    }
}
