package leetcode.array;

public class RemoveDup {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int swap_index=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
                nums[swap_index++]=nums[i];


        }
        return swap_index;


    }
}
