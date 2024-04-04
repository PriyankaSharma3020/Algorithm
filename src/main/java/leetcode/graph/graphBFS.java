package leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class graphBFS {
    public static void main(String[] args) {
        List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        graphBFS sl = new graphBFS();
        List < Integer > ans = sl.breadthFirstSearch(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }

    }

    public List<Integer> breadthFirstSearch(int V, List<List<Integer>> adj){
        //visited array
        boolean[] visited= new boolean[V];
        //return list
        List<Integer> ret = new ArrayList<>();
        //queue to store breadth nodes
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0]=true;

        //while q is not empty
        while(!q.isEmpty())
        {
           int node = q.poll();
           ret.add(node);
            //for all adjacent nodes in adj list add it in q
            for(int i : adj.get(node))
            {
                if(!visited[i]) {
                    q.add(i);
                    visited[i]=true;
                }
            }

        }
        return ret;


    }
}
