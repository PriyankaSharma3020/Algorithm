package leetcode.DP;

public class MaxProductSubarray {
    public static void main(String[] args) {

    }
    //2,3,-2,4
    public int maxProduct(int[] nums) {
        int pre = Integer.MIN_VALUE;
        int post = Integer.MAX_VALUE;
        int max_val=0;
        for(int i =0;i<nums.length;i++)
        {
            pre*=nums[i];
            post*=nums[nums.length-1-i];

            if(pre==0)
                pre=1;
            if(post==0)
                post=1;
            max_val=Math.max(max_val,Math.max(pre,post));
        }
        return max_val;
    }
}
