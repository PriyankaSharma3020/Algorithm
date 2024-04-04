package leetcode.DP;

public class MinFallingPathSum {
    public static void main(String[] args) {
        MinFallingPathSum mp=new MinFallingPathSum();
        System.out.println(mp.minFallingPathSum(new int[][]{{2,1,3},{6,5,4},{7,8,9}}));
    }
    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        if(m==0)
            return 0;
        if(m==1)
            return matrix[0][0];
        int n = matrix[0].length;
        int[] prev_row =new int[n];;
        for(int i =0;i<m;i++)
        {
            int[] curr_row =new int[n];;
            for(int j=0;j<n;j++)
            {
                if(i==0)
                {
                    curr_row[j]=matrix[0][j];
                    continue;
                }

                int bl=matrix[i][j];
                int bd=matrix[i][j];
                int br=matrix[i][j];
                bd += prev_row[j];
                if(j>0) {
                    bl += prev_row[j - 1];
                }else{
                    bl=Integer.MAX_VALUE;
                }
                if(j<n-1&&i>0)
                    br+=prev_row[j+1];
                else
                    br=Integer.MAX_VALUE;
                curr_row[j]=Math.min(Math.min(bl,br),bd);
            }
            prev_row=curr_row;
        }
        int mini = Integer.MAX_VALUE;

        for (int k = 0; k < n; k++) {
            mini = Math.min(mini, prev_row[k]);
        }

        return mini;
    }
}
