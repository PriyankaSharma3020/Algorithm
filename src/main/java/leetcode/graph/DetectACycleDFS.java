package leetcode.graph;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

class Pair1{
    int parent;
    int curr;
    Pair1(int p , int c)
    {
        this.curr=c;
        this.parent=p;
    }

}
public class DetectACycleDFS {

    public boolean detectCycleDFS(int V, List<List<Integer>> adj)
    {
        boolean[] visited = new boolean[V];

        //visited[0]=true;
        return dfs(new Pair(-1,0),adj,visited);

    }

    public boolean dfs(Pair pair_node, List<List<Integer>> adj,boolean[] visited)
    {
        int node = pair_node.curr;
        for(int i: adj.get(node))
        {
            if(!visited[node]) {
                visited[node] = true;
                dfs(new Pair(i,node), adj, visited);
            }else{
                //detect a cycle
                if(pair_node.parent!=i)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList< >());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        DetectACycleDFS obj = new DetectACycleDFS();
        boolean ans = obj.detectCycleDFS(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

}
