package leetcode.DP;

import java.util.Arrays;

public class SumOfNopnAdjacent {
    public static void main(String[] args) {
        SumOfNopnAdjacent sa = new SumOfNopnAdjacent();
        System.out.println(sa.sum(3,new int[]{2,1,4,9}));
        System.out.println(sa.sum_memoization_call(3,new int[]{2,1,4,9}));
        System.out.println(sa.sum_tabulation_call(3,new int[]{2,1,4,9}));
    }

    public int sum(int ind, int[] arr)
    {
        if(ind==0)
            return arr[0];
        int pick=0;
        if(ind>1)
            pick=arr[ind]+sum(ind-2,arr);
        else{
            pick=arr[ind];
        }
        int no_pick=0+sum(ind-1,arr);
        return Math.max(pick,no_pick);
    }
    public int sum_memoization_call(int ind, int[] arr)
    {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return sum_memoization(ind,arr,dp);
    }
    public int sum_tabulation_call(int ind, int[] arr)
    {
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return sum_tabulation(ind,arr,dp);
    }
    public int sum_memoization(int ind, int[] arr,int[] dp)
    {
        dp[0]= arr[0];
        if(dp[ind]!=-1)return dp[ind];

            int pick = 0;
            if (ind > 1)
                pick = arr[ind] + sum_memoization(ind - 2,arr,dp);
            else {
                pick = arr[ind];
            }
            int no_pick = 0 + sum_memoization(ind - 1,arr,dp);
           return  dp[ind] = Math.max(pick, no_pick);

    }
    public int sum_tabulation(int ind, int[] arr,int[] dp)
    {
        dp[0]= arr[0];

        for(int i =1;i<arr.length;i++) {
            int pick = 0;
            if (i > 1)
                pick = arr[i] + dp[i - 2];
            else {
                pick = arr[i];
            }
            int no_pick = 0 + dp[i - 1];
            dp[i] = Math.max(pick, no_pick);
        }
        return dp[arr.length-1];
    }
    public int sum_tabulation_optimised(int ind, int[] arr)
    {
        int prev2= arr[0];
        if(ind<1)
            return prev2;
        int prev1=Math.max(arr[1],arr[0]);
        for(int i =2;i<arr.length;i++) {
            int pick = arr[i] + prev2;
            int no_pick = 0 + prev1;
            int curr = Math.max(pick, no_pick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }

}
