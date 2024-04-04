package leetcode.DP;

import java.util.Arrays;

public class GridUniq {
    public static void main(String[] args) {
        GridUniq gr = new GridUniq();
        int[][] arr = new int[3][2];
        //Arrays.fill(arr,-1);
        System.out.println( gr.uniquePaths(3,2,arr));
    }
    public int uniquePaths(int m, int n,int[][]arr) {

        for(int i=0;i<m;i++)
        {
            for(int j =0;j<n;j++)
            {
                if(i==0&&j==0) {
                    arr[i][j] = 1;
                    continue;
                }
                int up=0;
                if(j>0)
                 up =arr[i][j-1];
                int l =0;
                if(i>0)
                    l=arr[i-1][j];
                arr[i][j]=up+l;
            }
        }
        return arr[m-1][n-1];
    }

    int f(int m ,int n)
    {
        if(m==1&&n==1){
            System.out.println("reached");return 1;};
        if(m<1||n<1)return 0;
        int left=f(m,n-1);
        int up=f(m-1,n);
        return left+up;
    }
    int f1(int m ,int n,int[][] arr)
    {
        arr[0][0]=1;
        if(arr[m][n]!=-1)
            return arr[m][n];
        int left=f(m,n-1);
        int up=f(m-1,n);
        return arr[m][n]=left+up;

    }




}
