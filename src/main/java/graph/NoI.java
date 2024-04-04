package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoI {
    public static void main(String[] args) {
        NoI n = new NoI();
        char[][] arr = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
                {'1','1','0','1','1'}
        };
        System.out.println(n.numIslands(arr));
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int[][] visited = new int[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++)
        {
            for(int j =0;j<grid[0].length;j++)
            {
                if(visited[i][j]==0&&grid[i][j]=='1')
                {
                    count++;
                    visited[i][j]=-1;
                    bfs(i,j,grid,visited);
                }
            }
        }
        return count;
    }

    public void bfs(int row,int col,char[][] grid,int[][] visited){

        Queue<List<Integer>> q = new LinkedList<>();
        q.add(List.of(row,col));
        while(!q.isEmpty())
        {
            row=q.peek().get(0);
            col=q.peek().get(1);
            q.remove();
            for(int i =-1;i<=1;i++)
            {
                for(int j =-1;j<=1;j++)
                {
                    int r=row+i;
                    int c =col+j;
                    if(r>=0&&r<visited.length&&c>=0&&c<visited[0].length)
                    {
                        if(visited[r][c]==0&&grid[r][c]=='1')
                        {
                            q.add(List.of(r,c));
                            visited[r][c]=-1;
                        }
                    }
                }
            }
        }

    }
}
