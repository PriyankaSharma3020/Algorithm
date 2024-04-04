package leetcode.slidingWindow;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        RemoveDups rd = new RemoveDups();
        int[] t = new int[]{1,1,1,2,2,3};
       int r = rd.removeDuplicates(t);
        System.out.println(r);
        System.out.println(Arrays.toString(t));
    }
    public int removeDuplicates(int[] nums) {
        int count=1;
        int swap_index=1;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]) {
                count++;
                nums[swap_index++]=nums[i];
            }
        }
        return count;
    }
}
