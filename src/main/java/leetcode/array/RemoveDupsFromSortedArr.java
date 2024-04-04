package leetcode.array;

public class RemoveDupsFromSortedArr {
    public static void main(String[] args) {
        RemoveDupsFromSortedArr rd = new RemoveDupsFromSortedArr();
        System.out.println(rd.removeDuplicates(new int[]{ 1,1,1,2,2,3}));
    }
    public int removeDuplicates(int[] nums) {

        int swap_index=0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
                nums[swap_index++]=nums[i-1];
        }
        return swap_index;
    }
}
