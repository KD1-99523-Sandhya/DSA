import java.util.Scanner;

class TreeNode6Q2 { int val; TreeNode6Q2 left,right; TreeNode6Q2(int val){this.val=val;} }

public class ass6_Q2 {
    int height(TreeNode6Q2 root) {
        if(root==null) return 0;
        int left=height(root.left); if(left==-1) return -1;
        int right=height(root.right); if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
    boolean isBalanced(TreeNode6Q2 root) { return height(root)!=-1; }
    TreeNode6Q2 readTree(Scanner sc) {
        System.out.print("Enter node value (-1 for no node): "); int value=sc.nextInt();
        if(value==-1) return null;
        TreeNode6Q2 node=new TreeNode6Q2(value);
        System.out.println("Left child of "+value+":"); node.left=readTree(sc);
        System.out.println("Right child of "+value+":"); node.right=readTree(sc);
        return node;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); ass6_Q2 solution=new ass6_Q2();
        System.out.println("Build tree in preorder; enter -1 for a missing node.");
        TreeNode6Q2 root=solution.readTree(sc);
        System.out.println(solution.isBalanced(root)?"Tree is balanced":"Tree is not balanced"); sc.close();
    }
}
