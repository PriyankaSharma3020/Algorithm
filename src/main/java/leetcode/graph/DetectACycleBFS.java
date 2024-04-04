package leetcode.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
    int parent;
    int curr;
    Pair(int p,int c)
    {
        this.parent=p;
        this.curr=c;
    }
}

public class DetectACycleBFS {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);

        DetectACycleBFS obj = new DetectACycleBFS();
        boolean ans = obj.bfsCycle(4, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");

    }


    public boolean bfsCycle(int V, List<List<Integer>> adj)
    {
        //List<Integer> ret = new ArrayList<>();
        boolean[] visited = new boolean[V];

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(-1,0));
        visited[0]=true;
        while(!q.isEmpty())
        {
            Pair cur = q.poll();
            int current = cur.curr;
           // ret.add(curr);

            for(Integer i:adj.get(current))
            {
                if(!visited[i]) {
                    q.add(new Pair(current, i));
                    visited[i]=true;
                }
                else
                {
                    //detect cycle
                    Integer parent = cur.parent;
                    if(parent==i)
                        return true;
                }

            }

        }
        return false;
    }

}
