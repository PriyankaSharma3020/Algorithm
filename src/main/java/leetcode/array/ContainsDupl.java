package leetcode.array;

public class ContainsDupl {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int missing =0;
        for(int i =0;i<nums.length;i++)
        {
            missing^=nums[i]^i;
        }
        return missing;
    }
}
