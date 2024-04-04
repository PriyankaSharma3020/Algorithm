package leetcode;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int res = MinSizeSubArraySum.minSubArrayLen1(1,new int[]{1,4,4});
        System.out.println(res);
    }

    //2,3,1,2,4,3 target=7
    public static int minSubArrayLen(int target, int[] nums) {
        //find no of arrays making samr target or greater target,
        //compare aresults and  return min len everytime
        int sum=0;
        int length=0;
        int min_length=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            int curr=i;
            length=0;
            sum=0;
            while(curr<nums.length )
            {
                sum+=nums[curr++];
                length++;
                if(sum>=target){
                    min_length=Math.min(min_length,length);
                    break;
                }
            }

        }
        if(min_length==Integer.MAX_VALUE)
            return 0;
        return min_length;
    }

    //attempt 2
    public static int minSubArrayLen1(int target, int[] nums) {
        int sum=0;
        int length=0;
        int min_length=Integer.MAX_VALUE;
        int curr=-1;
        int start=0;
        while(curr<nums.length)
        {

            if(sum>=target){
                min_length=Math.min(min_length,(curr-start+1));
                sum-=nums[start++];
                length--;
            }else if(curr==nums.length-1)
                break;
            else{
                curr++;
                sum+=nums[curr];
                length++;
            }
        }


        if(min_length==Integer.MAX_VALUE)
            return 0;
        return min_length;
    }

}
