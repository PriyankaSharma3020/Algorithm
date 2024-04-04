package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cycle {
    public static void main(String[] args) {

    }

    public boolean  visit(int n, List<List<Integer>> adj){

        int[] visited=new int[n];
        Queue<List<Integer>> q = new LinkedList<>();
        ArrayList<Integer> op  =new ArrayList<>();

        q.add(List.of(0,null));
        visited[0]=1;
        while(!q.isEmpty())
        {
            int curr = q.poll().get(0);
            int parent = q.poll().get(1);

            for(int i : adj.get(curr))
            {
                if(visited[i]==0)
                {
                    q.add(List.of(i,curr));
                    visited[i]=1;

                }else if(visited[i]==1 && i!=parent)
                    return true;
            }
        }
        return false;

    }
}
