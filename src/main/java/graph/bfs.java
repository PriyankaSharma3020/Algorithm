package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public static void main(String args[])
    {
        List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(5);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(3);
        adj.get(5).add(1);
        adj.get(5).add(2);
        adj.get(5).add(3);
        adj.get(5).add(4);
        //adj.get(3).add(1);

        bfs sl = new bfs();
        ArrayList < Integer > ans = sl.visit(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }
    }





    public ArrayList<Integer> visit(int n, List<List<Integer>> adj){
        int[] visited = new int[n];
        ArrayList<Integer> op = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]=1;
        while(!q.isEmpty()) {
            int curr=q.poll();
            op.add(curr);
            for (int i:adj.get(curr)) {
                if(visited[i]==0) {
                    q.add(i);
                    visited[i] = 1;
                }
            }
        }

        return op;
    }
}
