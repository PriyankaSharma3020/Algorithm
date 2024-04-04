package leetcode.DP;

public class MinPathSum {
    public static void main(String[] args) {

    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if(m==0)
            return 0;
        int n =grid[0].length;
        int[] prev=new int[n];

        for(int i=0;i<m;i++)
        {
            int[] curr=new int[n];
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0) {
                    curr[j] = grid[0][0];
                    continue;
                }
                int l=grid[i][j];
                int u=grid[i][j];
                if(j>0)
                    l+=curr[j-1];
                else
                    l += (int) Math.pow(10, 9);
                if(i>0)
                    u+=prev[j];
                else
                    u += (int) Math.pow(10, 9);
                curr[j]=Math.min(l,u);
            }
            prev=curr;
        }
        return prev[n-1];
    }
}
