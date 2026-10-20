import java.util.Scanner;

class Node5Q1 {
    int data;
    Node5Q1 left, right;
    Node5Q1(int data) { this.data = data; }
}

public class ass5_Q1 {
    Node5Q1 insert(Node5Q1 root, int value) {
        if (root == null) return new Node5Q1(value);
        if (value < root.data) root.left = insert(root.left, value);
        else if (value > root.data) root.right = insert(root.right, value);
        return root;
    }

    int findDepth(Node5Q1 root, int key) {
        int depth = 0;
        while (root != null) {
            if (root.data == key) return depth;
            root = key < root.data ? root.left : root.right;
            depth++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ass5_Q1 tree = new ass5_Q1();
        Node5Q1 root = null;
        System.out.print("Enter number of BST nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) root = tree.insert(root, sc.nextInt());
        System.out.print("Enter value to find depth: ");
        int key = sc.nextInt();
        int depth = tree.findDepth(root, key);
        if (depth == -1) System.out.println("Node not found");
        else System.out.println("Depth: " + depth);
        sc.close();
    }
}
