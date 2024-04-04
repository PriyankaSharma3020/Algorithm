package leetcode.DP;

public class GridUniquePath {
    public static void main(String[] args) {

    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
       return  uniquePaths_tabulation(m,n,dp);

    }
    public int uniquePaths_tabulation(int m, int n,int[][] dp) {

        for(int i =0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(i==0&&j==0)
                    dp[0][0]=1;
                int left=0;
                int up=0;
                if(i>0)
                    left=dp[i-1][j];
                if(j>0)
                    up=dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths_tabulation_opt(int[][] obstacleGrid) {


        int m = obstacleGrid.length;
        if(m==0)
            return 0;
        if(m==1)
            return 1;
        int n = obstacleGrid[0].length;
        int[] prev=new int[m];
        for(int i =0;i<m;i++)
        {
            int[] curr=new int[n];
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0){
                    curr[0]=1;
                    continue;
                }
                if(i > 0 && j > 0 &&obstacleGrid[i][j]==-1){
                    curr[j]=0;
                    continue;
                }
                int up = 0;
                if(i>0)
                    up=prev[j];
                int left=0;
                if(j>0)
                    left=curr[j-1];
                curr[j]=up+left;
            }
            prev=curr;
        }
        return prev[n-1];
    }
}
