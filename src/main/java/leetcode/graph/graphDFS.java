package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class graphDFS {
    public static void main(String[] args) {
        List < List < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

        graphDFS sl = new graphDFS();
        List < Integer > ans = sl.dfsOfGraph(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }

    }
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {

        //use recursion for depth first search
        boolean[] visited = new boolean[V];
        List<Integer> ret = new ArrayList<>();
        visited[0]=true;
        dfs(visited,adj,0,ret);
        return ret;
    }

    private void dfs(boolean[] visited, List<List<Integer>> adj, int node, List<Integer> ret) {
        ret.add(node);
        for(int i : adj.get(node))
        {
            if(!visited[i])
            {
                visited[i]=true;
                dfs(visited,adj,i,ret);
            }
        }
    }
}
