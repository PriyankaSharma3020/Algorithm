package graph.again;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    int dist;
    Pair(int row,int col,int dist)
    {
        this.row=row;
        this.col=col;
        this.dist=dist;
    }
}
public class shortestPath {
    public static void main(String[] args) {
        char[][] grid =
                {{'X', 'X', 'X', 'X', 'X', 'X'}, {'X', '*', 'O', 'O', 'O', 'X'}, {'X', 'O', 'O', '#', 'O', 'X'},
                        {'X', 'X', 'X', 'X', 'X', 'X'}};
        System.out.println(bfs(grid));
    }
    public static int bfs(char[][] grid){

        int res =0;
        Queue<Pair> q=new LinkedList<>();
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]=='*') {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty())
        {
            Pair curr = q.remove();
            int[] r = {-1,+1,0,0};
            int[] c = {0,0,-1,+1};
            for(int i =0;i<4;i++)
            {
                int row = curr.row+r[i];
                int col= curr.col+c[i];
                if(validateMatrix(grid,row,col) && !visited[row][col]&& grid[row][col]!=Character.valueOf('x'))
                {
                    if(grid[row][col]=='#')
                        return curr.dist+1;
                    q.add(new Pair(row,col,curr.dist+1));
                    visited[row][col]=true;
                }
            }
        }
        return res;
    }

    private static boolean validateMatrix(char[][] grid, int row, int col) {
        if(row>=0&&row<grid.length&&col>=0&&col<grid[0].length)
            return true;
        return false;
    }
}
