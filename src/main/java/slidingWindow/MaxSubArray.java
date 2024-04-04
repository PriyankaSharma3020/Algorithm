package slidingWindow;

public class MaxSubArray {
    /*  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

     */
     /*   prefix , suffix


     */
    public static void main(String[] args) {
        MaxSubArray mx = new MaxSubArray();
       int res= mx.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(res);
    }

    public int maxSubArray(int[] arr) {
        int pre=0;
        int suff =0;
        int sum=0;
        for(int i =0;i<arr.length;i++)
        {

            if(pre<0)pre=0;
            if(suff<0)suff=0;
            pre+=arr[i];
            suff+=arr[arr.length-i-1];
            int s=Math.max(pre,suff);
            sum=Math.max(s,sum);
        }
        return sum;
    }
}
