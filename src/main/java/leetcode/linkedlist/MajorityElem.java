package leetcode.linkedlist;

public class MajorityElem {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        int count=1;
        int assume=nums[0];
        for(int i =1;i<nums.length;i++)
        {
            if(count==0) {
                assume = nums[i];
            }
            if(nums[i]==nums[i-1])
                count++;
            else
                count--;
        }
        return count;
    }
}
