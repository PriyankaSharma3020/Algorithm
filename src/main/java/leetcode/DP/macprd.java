package leetcode.DP;

public class macprd {
    public static void main(String[] args) {
        System.out.println(macprd.maxProduct(new int[]{-2,0,-1}));
    }

    public static int maxProduct(int[] nums) {
        int pre = 1;//Integer.MIN_VALUE;
        int post = 1;//Integer.MAX_VALUE;
        int max_val=0;
        for(int i =0;i<nums.length;i++)
        {
            pre*=nums[i];
            post*=nums[nums.length-1-i];
            max_val=Math.max(max_val,Math.max(pre,post));
            if(pre==0)
                pre=1;
            if(post==0)
                post=1;

        }
        return max_val;
    }
    public static int maxProduct1(int[] nums) {
        int prd=1;
        for(int i=nums.length-1;i>=0;i++)
        {
            if(nums[i]<=0)
                prd=1;
            else
                prd*=nums[i];
        }
        return prd;
    }
}
