package leetcode.DP;

public class GridUniquePathII {
    public static void main(String[] args) {

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if(m==0)
            return 0;
        if(m==1)
            return 1;
        int n = obstacleGrid[0].length;
        int[] prev=new int[n];
        for(int i =0;i<m;i++)
        {
            int[] curr=new int[n];
            for(int j=0;j<n;j++)
            {
                if(i==0&&j==0)
                    curr[0]=1;
                if((i>0||j>0)&&obstacleGrid[i][j]==-1)
                    curr[i]=0;
                int up = 0;
                if(i>0)
                    up=prev[j];
                int left=0;
                if(j>0)
                    left=curr[i-1];
                curr[j]=up+left;
            }
            prev=curr;
        }
        return prev[n-1];
    }
}
