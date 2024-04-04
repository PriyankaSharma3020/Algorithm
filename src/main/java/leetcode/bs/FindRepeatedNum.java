package leetcode.bs;

public class FindRepeatedNum {
    public static void main(String[] args) {
        FindRepeatedNum fr = new FindRepeatedNum();
        int re =fr.findDup(new int[]{1,3,4,2,2});
        System.out.println(re);
    }

    public int findDuplicate(int[] nums) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int thisSum=0;
        for(int i =0;i<nums.length;i++)
        {
            low=Math.min(low,nums[i]);
            high=Math.max(high,nums[i]);
            thisSum+=nums[i];
        }
        System.out.println("this sum:"+thisSum);
        System.out.println("high is :"+high+", low is"+low);
        int sum = calc(high)-calc(low-1);
        System.out.println("sum is"+sum);
        return thisSum-sum;
    }

    public int findDup(int[] nums)
    {
        int duplicate = -1;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.abs(nums[i]);
            if (nums[cur] < 0) {
                duplicate = cur;
                break;
            }
            nums[cur] *= -1;
        }

        // Restore numbers
        for (int i = 0; i < nums.length; i++)
            nums[i] = Math.abs(nums[i]);

        return duplicate;
    }


    public int calc(int no)
    {
        int n = no+1;
        int div=no*(no+1);
        int res =div/2;
        return res;
    }


}
