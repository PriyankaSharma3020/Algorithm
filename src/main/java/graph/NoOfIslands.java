package graph;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfIslands {
    public static void main(String[] args) {
        char[][] grid =  {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };

        NoOfIslands obj = new NoOfIslands();
        System.out.println(obj.numIslands(grid));
    }

    public int numIslands(char[][] grid) {

        if(grid.length<1)
            return 0;
        int no_of_cycle=0;
        int[][] visited = new int[grid.length][grid[0].length];
        Queue<List<Integer>> q = new LinkedList();
        for (int i = 0; i < grid.length; i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(visited[i][j]==0 && grid[i][j]=='1') {
                    no_of_cycle++;
                    bfs(visited,grid,q,i,j);
                }
            }
        }
        return no_of_cycle;
    }

    void bfs(int[][] visited,char[][] grid,Queue<List<Integer>> q,int row,int col)
    {
        //add in queue
        q.add(List.of(row,col));
        //mark as visited
        visited[row][col]=1;
        //visit all neighours

        while(!q.isEmpty()) {
            List<Integer> ll = q.poll();
            int r = ll.get(0);
            int c = ll.get(1);
            for (int i = r - 1; i <= r + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length) {
                        if(grid[i][j]=='1'&& visited[i][j]==0) {
                            q.add(List.of(i, j));
                            visited[i][j] = 1;
                        }
                    }
                }
            }
        }
    }
}
