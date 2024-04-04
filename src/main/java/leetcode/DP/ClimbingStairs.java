package leetcode.DP;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climb(5));
        System.out.println(cs.climb_tab_approach(5));
        System.out.println(cs.climb_tab_optimised(5));
    }

    public int climb(int ind){
        if(ind==0)
            return 1 ;
        if(ind==1)
            return 1 ;
        int one=climb(ind-1);
        int two=climb(ind-2);
        return one+two;
    }
    //tabulation
    public int climb_tab_approach(int ind){
        int[] dp = new int[ind+1];
        Arrays.fill(dp,-1);
       return climb_tab(ind,dp);
    }
    public int climb_tab(int ind,int[] dp){
        dp[0]=1;
        dp[1]=1;
        for(int i =2;i<=ind;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[ind];
    }

    public int climb_tab_optimised(int ind){
        int prev1=1;
        int prev2=1;
        for(int i =2;i<=ind;i++)
        {
            int curr=prev2+prev1;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;
    }

}
