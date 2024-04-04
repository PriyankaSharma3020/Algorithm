package leetcode.hashtable;

public class MajorityElem {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {

        int assume=-1;
        int count=0;
        for(int i =1;i<nums.length;i++)
        {
            if(count==0) {
                assume = nums[i];
                count++ ;
            }else if(assume==nums[i])
                count++;
            else if(assume!=nums[i])
                count--;
        }
        return assume;

    }
}
