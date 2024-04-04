package graph.again;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        List < List < Integer >> adj = new ArrayList< >();
        for (int i = 0; i <= 5; i++) {
            adj.add(new ArrayList < > ());
        }
       /* adj.get(1).add(2);
        adj.get(1).add(5);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(3).add(5);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(1);
        adj.get(5).add(2);
        adj.get(5).add(3);
        adj.get(5).add(4);
*/
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        bfs sl = new bfs();
        sl.bfs(4, adj);
        //Arrays.fill
    }

    public static void bfs(int startNode,List<List<Integer>> adj)
    {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);

        while(!q.isEmpty())
        {
            Integer curr = q.poll();
            System.out.print("value is "+curr);
            for(Integer neighbour : adj.get(curr))
            {
                if(!visited[neighbour])
                {
                   q.add(neighbour);
                   visited[neighbour]=true;
                }
            }
        }
    }
}
