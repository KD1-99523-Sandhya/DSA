import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ass8_Q5 {
    private int n; private ArrayList<ArrayList<Integer>> adj;
    ass8_Q5(int n) { this.n=n; adj=new ArrayList<>(); for(int i=0;i<n;i++) adj.add(new ArrayList<Integer>()); }
    void addEdge(int u,int v) { if(u<0||u>=n||v<0||v>=n) throw new IllegalArgumentException("Vertex out of range"); adj.get(u).add(v); adj.get(v).add(u); }
    void bfs(int start) {
        boolean[] visited=new boolean[n]; Queue<Integer> q=new LinkedList<>(); visited[start]=true; q.offer(start);
        while(!q.isEmpty()) { int cur=q.poll(); System.out.print(cur+" "); for(int next:adj.get(cur)) if(!visited[next]) { visited[next]=true; q.offer(next); } }
        System.out.println();
    }
    void dfs(int start) { boolean[] visited=new boolean[n]; dfsHelper(start,visited); System.out.println(); }
    void dfsHelper(int cur,boolean[] visited) { visited[cur]=true; System.out.print(cur+" "); for(int next:adj.get(cur)) if(!visited[next]) dfsHelper(next,visited); }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.print("Enter number of vertices: "); int n=sc.nextInt();
        if(n<=0) { System.out.println("Number of vertices must be positive"); sc.close(); return; }
        ass8_Q5 g=new ass8_Q5(n); System.out.print("Enter number of edges: "); int e=sc.nextInt();
        System.out.println("Enter each edge as: source destination (vertices numbered 0 to "+(n-1)+")");
        for(int i=0;i<e;i++) g.addEdge(sc.nextInt(),sc.nextInt());
        System.out.print("Enter starting vertex: "); int start=sc.nextInt();
        if(start<0||start>=n) System.out.println("Invalid starting vertex");
        else { System.out.print("BFS: "); g.bfs(start); System.out.print("DFS: "); g.dfs(start); }
        sc.close();
    }
}
