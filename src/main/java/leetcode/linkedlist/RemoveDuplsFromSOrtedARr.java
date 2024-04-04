package leetcode.linkedlist;

public class RemoveDuplsFromSOrtedARr {
    public static void main(String[] args) {

    }
    //          |
    //0,1,2,3,4,2,2,3,3,4,4
    //                  |
    //01111
    public int removeDuplicates(int[] nums) {

        int swap_ptr=0;
        int curr=1;
        for(curr=1;curr<nums.length;)
        {
            if(nums[curr]!=nums[curr-1])
            {
                nums[++swap_ptr]=nums[curr];
            }
                curr++;
        }
        return swap_ptr+1;
    }
}
