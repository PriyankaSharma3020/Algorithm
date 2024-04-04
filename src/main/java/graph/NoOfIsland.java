package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfIsland {
    public static void main(String[] args) {
        NoOfIsland ni = new NoOfIsland();
        char[][] arr = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'1','1','0','1','1'}
        };
        System.out.println(ni.numIslands(arr));
    }
    public int numIslands(char[][] grid) {
        int noOfIsland =  0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        for(int i =0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Printing grid[i][j]"+grid[i][j]+" & visited[i][j]"+visited[i][j]);
                if(grid[i][j]=='1' && visited[i][j]==0)
                {
                    noOfIsland++;
                    visited[i][j]=-1;
                    bfs(i,j,visited,grid);
                }
            }
        }
        return noOfIsland;
    }

    private void bfs(int m, int n, int[][] visited, char[][] grid) {

        int r = visited.length;
        int c = visited[0].length;
        Queue<List<Integer>> q=new LinkedList<>();
        q.add(List.of(m,n));
        while(!q.isEmpty()) {
            int row = q.peek().get(0);
            int col = q.peek().get(1);
            q.remove();

            for (int i = -1; i <= +1; i++) {
                for (int j = -1; j <= +1; j++) {
                    int rr = row + i;
                    int cc = col + j;
                    if ( rr< r && rr >= 0 && cc < c && cc >= 0) {
                        if (grid[rr][cc] == '1' && visited[rr][cc] == 0) {
                            q.add(List.of(rr, cc));
                            visited[rr][cc] = -1;
                        }
                    }
                }
            }
        }
    }
}
