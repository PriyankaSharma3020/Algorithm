package leetcode.graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NoOfIsland {
    public static void main(String[] args) {

    }

    public int noOfIsland(int[][] grid)
    {
        if(grid.length<=0)
            return 0;
        int r = grid.length;
        int c = grid[0].length;
        //visited array
        int[][] visited = new int[r][c];
        //return set
        HashSet<List<String>> ret_final = new HashSet<>();
        for(int i =0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(visited[i][j]!=1)
                {
                    //depth first search
                    visited[i][j]=1;
                    List<String> ret =new ArrayList<>();
                    dfs(r,c,r,c,visited,ret,grid);
                    ret_final.add(ret);
                }
            }
        }
        return ret_final.size();
    }

    private void dfs(int r, int c,int r0,int c0, int[][] visited, List<String> ret,int[][] grid) {

        //mark current entry visited
        visited[r][c]=1;
        //add in ret result
        ret.add(String.valueOf("r-r0"+","+"c-c0"));
        //r,c is base
        //visit around it up down,left,right 4 possibilities
        int[] visit_rows_around={0, 0,-1,+1};
        int[] visit_cols_around={-1,+1,0,0};
        for(int i =0;i<4;i++)
        {
            int r1 = r0+visit_rows_around[i];
            int c1 =c0+visit_cols_around[i];
            if(r1>=0 && c1>=0 && r1<grid.length && c1<grid[0].length && visited[r1][c1]!=1)
            {
                dfs(r,c,r1,c1,visited,ret,grid);
            }
        }
    }



}
