package leetcode.array;

public class MaxSubArray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {

        int maxSum=Integer.MIN_VALUE;
        int sum_pre=Integer.MIN_VALUE;
        int sum_post=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            if(sum_pre<0)
                sum_pre=0;
            sum_pre=nums[i]+sum_pre;
            if(sum_post<0)
                sum_post=0;
            sum_post=nums[nums.length-1-i]+sum_post;
            maxSum=Math.max(maxSum,Math.max(sum_post,sum_pre));
        }
        return maxSum;
    }
}
