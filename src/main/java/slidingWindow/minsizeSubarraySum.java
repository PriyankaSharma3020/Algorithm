package slidingWindow;

public class minsizeSubarraySum {
    public static void main(String[] args) {
        int[] mn = new int[]{2,3,1,2,4,3};
        int res =minSubArrayLen(7,mn);
        System.out.println(res);
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int j =0;
        int sum=0;
        int start=0;
        int len=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            len++;

            while (sum>=target && start<=i) {
                ans=Math.min(len,ans);
                sum-=nums[start];
                start++;
                len--;
            }

        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
